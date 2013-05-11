package com.mlb.api.parser;

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

    private static final String URL_STRING = "http://mlb.mlb.com/fantasylookup/json/named.wsfb_fantasy_news_byplayer.bam?playerid=";
    private Parser<FantasyLookup> parser;

    public FantasyLookupParser() {
        parser = new Parser<FantasyLookup>(FantasyLookup.class);
    }

    public FantasyLookup parse(String playerID) {
        JSONObject lookupJson = null;
        JSONObject row = null;
        try {
            URL lookupUrl = new URL(URL_STRING + playerID);
            BufferedReader br = new BufferedReader(new InputStreamReader(lookupUrl.openStream()));
            String jsonIn;
            while((jsonIn = br.readLine()) != null) {
                lookupJson = new JSONObject(jsonIn);
            }
            JSONObject news = lookupJson.getJSONObject("wsfb_fantasy_news_byplayer");
            JSONObject queryResults = news.getJSONObject("queryResults");
            row = queryResults.getJSONObject("row");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return parser.parse(row.toString());

    }
}
