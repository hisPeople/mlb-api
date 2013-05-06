package com.mlb.api.parser;

import com.mlb.api.model.IndividualPitchingRank;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * User: devon
 * Date: 5/6/13
 * Time: 8:26 AM
 */
public class IndividualPitchingRankParser {

    private static final String URL_STRING = "http://mlb.mlb.com/lookup/json/named.mlb_individual_pitching_rank.bam?player_id=";
    private Parser<IndividualPitchingRank> parser;

    public IndividualPitchingRankParser() {
        parser = new Parser<IndividualPitchingRank>(IndividualPitchingRank.class);
    }

    public IndividualPitchingRank[] parse(String playerID) {
        JSONObject jsonObject = null;
        JSONArray row = null;

        try {
            URL pitchingRankUrl = new URL(URL_STRING + playerID);
            BufferedReader br = new BufferedReader(new InputStreamReader(pitchingRankUrl.openStream()));
            String jsonIn;
            while((jsonIn = br.readLine()) != null) {
                jsonObject = new JSONObject(jsonIn);
            }
            JSONObject playerInfo = jsonObject.getJSONObject("mlb_individual_pitching_rank");
            JSONObject queryResults = playerInfo.getJSONObject("queryResults");
            row = queryResults.getJSONArray("row");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        IndividualPitchingRank[] pitchingRanks = new IndividualPitchingRank[row.length()];
        for(int i = 0; i < row.length(); i++) {
            try {
                pitchingRanks[i] = parser.parse(row.get(i).toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return pitchingRanks;
    }
}
