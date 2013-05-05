package com.mlb.api.parser;

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
 * Date: 5/4/13
 * Time: 5:01 PM
 */
public class PlayerAwardsParser {

    private static final String URL_STRING = "http://mlb.mlb.com/lookup/json/named.player_awards.bam?player_id=";

    public PlayerAwardsParser(String playerID) {
        JSONObject jsonObject = null;

        try {
            URL playerAwardsUrl = new URL(URL_STRING + playerID);
            BufferedReader br = new BufferedReader(new InputStreamReader(playerAwardsUrl.openStream()));
            String jsonIn;
            while((jsonIn = br.readLine()) != null) {
                jsonObject = new JSONObject(jsonIn);
            }
            JSONObject playerInfo = jsonObject.getJSONObject("player_awards");
            JSONObject queryResults = playerInfo.getJSONObject("queryResults");
            JSONArray row = queryResults.getJSONArray("row");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
