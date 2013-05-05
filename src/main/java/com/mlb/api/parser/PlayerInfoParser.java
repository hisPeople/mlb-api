package com.mlb.api.parser;

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

    private static final String URL_STRING = "http://mlb.mlb.com/lookup/json/named.player_info.bam?sport_code=mlb&player_id=";

    public PlayerInfoParser(String playerID) {
        JSONObject jsonObject = null;
        try {
            URL playerInfoUrl = new URL(URL_STRING + playerID);
            BufferedReader br = new BufferedReader(new InputStreamReader(playerInfoUrl.openStream()));
            String jsonIn;
            while((jsonIn = br.readLine()) != null) {
                jsonObject = new JSONObject(jsonIn);
            }
            JSONObject playerInfo = jsonObject.getJSONObject("player_info");
            JSONObject queryResults = playerInfo.getJSONObject("queryResults");
            JSONObject row = queryResults.getJSONObject("row");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
