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
    private static final String URL_STRING = "http://mlb.mlb.com/stats/sortable.jsp?c_id=mlb&" +
            "tcid=mm_mlb_stats#statType=hitting&elem=%5Bobject+Object%5D&tab_level=child&" +
            "click_text=Sortable+Player+hitting&%23167%3BionType=sp&page=1&ts=1367944438272&season=2013&season_type=ANY&" +
            "playerType=QUALIFIER&sportCode='mlb'&league_code='MLB'&split=&team_id=&active_sw=&game_type='R'&position=&" +
            "page_type=SortablePlayer&sortOrder='desc'&sortColumn=ip&results=&perPage=50&timeframe=&last_x_days=&" +
            "extended=0&sectionType=sp";

    private Parser<SortablePlayerStats> parser;

    public SortablePlayerStatsParser() {
        parser = new Parser<SortablePlayerStats>(SortablePlayerStats.class);
    }

    public SortablePlayerStats[] parse() {
        JSONObject jsonObject = null;
        JSONArray row = null;

        try {
            URL pitchingRankUrl = new URL(URL_STRING );
            BufferedReader br = new BufferedReader(new InputStreamReader(pitchingRankUrl.openStream()));
            String jsonIn;
            while((jsonIn = br.readLine()) != null) {
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
