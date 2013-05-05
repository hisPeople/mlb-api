package com.mlb.api.parser;

import com.mlb.api.model.PlayerInfo;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * User: devon
 * Date: 5/4/13
 * Time: 5:01 PM
 */
public class PlayerInfoParser {

    private static final String URL_STRING = "http://mlb.mlb.com/lookup/json/named.player_info.bam?sport_code=%27mlb%27&player_id=";

    private Parser<PlayerInfo> parser;
    public PlayerInfoParser() {
        parser = new Parser<PlayerInfo>(PlayerInfo.class);
    }

    public PlayerInfo parse(String playerID) {
        JSONObject jsonObject = null;
        JSONObject row = null;
        String throwingHand = null;
        try {
            URL playerInfoUrl = new URL(URL_STRING + playerID);
            BufferedReader br = new BufferedReader(new InputStreamReader(playerInfoUrl.openStream()));
            String jsonIn;
            while((jsonIn = br.readLine()) != null) {
                jsonObject = new JSONObject(jsonIn);
            }
            JSONObject playerInfo = jsonObject.getJSONObject("player_info");
            JSONObject queryResults = playerInfo.getJSONObject("queryResults");
            row = queryResults.getJSONObject("row");

            // parse throws because Gson wont becuase it is a reserved word
            throwingHand = row.getString("throws");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        PlayerInfo playerInfo = parser.parse(row.toString());
        playerInfo.setThrows(throwingHand);
        return playerInfo;
    }
}
