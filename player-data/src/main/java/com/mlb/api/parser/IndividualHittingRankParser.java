package com.mlb.api.parser;

import com.mlb.api.model.*;
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
 * Date: 5/5/13
 * Time: 7:57 AM
 */
public class IndividualHittingRankParser {

    private static final String URL_STRING = "http://mlb.mlb.com/lookup/json/named.mlb_individual_hitting_rank.bam?player_id=";
    private Parser<IndividualHittingRank> parser;

    public IndividualHittingRankParser() {
        parser = new Parser<IndividualHittingRank>(IndividualHittingRank.class);
    }

    public IndividualHittingRank[] parse(String playerID) {
        JSONObject jsonObject = null;
        JSONArray row = null;

        try {
            URL hittingRankUrl = new URL(URL_STRING + playerID);
            BufferedReader br = new BufferedReader(new InputStreamReader(hittingRankUrl.openStream()));
            String jsonIn;
            while((jsonIn = br.readLine()) != null) {
                jsonObject = new JSONObject(jsonIn);
            }
            JSONObject playerInfo = jsonObject.getJSONObject("mlb_individual_hitting_rank");
            JSONObject queryResults = playerInfo.getJSONObject("queryResults");
            row = queryResults.getJSONArray("row");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        IndividualHittingRank[] hittingRanks = new IndividualHittingRank[row.length()];
        for(int i = 0; i < row.length(); i++) {
            try {
                hittingRanks[i] = parser.parse(row.get(i).toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return hittingRanks;
    }
}
