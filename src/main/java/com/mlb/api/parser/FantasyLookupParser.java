package com.mlb.api.parser;

import com.google.gson.Gson;
import com.mlb.api.model.FantasyLookup;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * User: devon
 * Date: 5/3/13
 * Time: 11:41 PM
 */
public class FantasyLookupParser {

    private FantasyLookup fantasyLookup;

    public static final String URL_STRING = "http://mlb.mlb.com/fantasylookup/json/named.wsfb_fantasy_news_byplayer.bam?playerid=425545";
    public FantasyLookupParser() {
        JSONObject lookupJson = null;
        try {
            URL lookupUrl = new URL(URL_STRING);
            BufferedReader br = new BufferedReader(new InputStreamReader(lookupUrl.openStream()));
            String jsonIn;
            while((jsonIn = br.readLine()) != null) {
                lookupJson = new JSONObject(jsonIn);
            }
            JSONObject news = lookupJson.getJSONObject("wsfb_fantasy_news_byplayer");
            JSONObject queryResults = news.getJSONObject("queryResults");
            JSONObject row = queryResults.getJSONObject("row");

            FantasyLookup fl = testGenericParser(row.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public FantasyLookup getFantasyLookup(String json) {
        Gson gson = new Gson();
        fantasyLookup = gson.fromJson(json, FantasyLookup.class);
        return fantasyLookup;
    }

    public FantasyLookup testGenericParser(String json) {
        Parser<FantasyLookup> fantasyLookupParser = new Parser<FantasyLookup>(FantasyLookup.class);
        FantasyLookup fl = fantasyLookupParser.parse(json);
        return fl;
    }
}
