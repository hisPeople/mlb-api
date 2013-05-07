package com.mlb.api.stats.parser;

import com.mlb.api.parser.*;
import com.mlb.api.stats.model.SortablePlayerStats;
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
 * Time: 8:01 AM
 */
public class SortablePlayerStatsParser {
    private static final String URL_STRING = "http://mlb.mlb.com/pubajax/wf/flow/stats.splayer?season=2013&sort_order='desc'&sort_column='avg'&stat_type=hitting&page_type=SortablePlayer&game_type='R'&player_pool=QUALIFIER&season_type=ANY&sport_code='mlb'&results=1000&recSP=1&recPP=50";

    private Parser<SortablePlayerStats> parser;

    public SortablePlayerStatsParser() {
        parser = new Parser<SortablePlayerStats>(SortablePlayerStats.class);
    }

    public SortablePlayerStats[] parse() {
        JSONObject jsonObject = null;
        JSONArray row = null;

        try {
            URL sortableStatsUrl = new URL(URL_STRING);
            BufferedReader br = new BufferedReader(new InputStreamReader(sortableStatsUrl.openStream()));
            String jsonIn;
            while((jsonIn = br.readLine()) != null) {                System.out.println();
                jsonObject = new JSONObject(jsonIn);
            }
            JSONObject sortableStats = jsonObject.getJSONObject("stats_sortable_player");
            JSONObject queryResults = sortableStats.getJSONObject("queryResults");
            row = queryResults.getJSONArray("row");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SortablePlayerStats[] sortablePlayerStats = new SortablePlayerStats[row.length()];
        for(int i = 0; i < row.length(); i++) {
            try {
                sortablePlayerStats[i] = parser.parse(row.get(i).toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return sortablePlayerStats;
    }
}
