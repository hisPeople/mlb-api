package com.mlb.api.model.masterscoreboard;

import com.google.gson.Gson;
import com.mlb.api.parser.MasterScoreboardParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

/**
 * User: devon
 * Date: 5/13/13
 * Time: 9:45 AM
 */
public class MasterScoreboardTest {

    @Test
    public void masterScoreboardParseTest() {
        MasterScoreboardParser masterScoreboardParser = new MasterScoreboardParser();
        MasterScoreboard masterScoreboard = masterScoreboardParser.parse("http://gd2.mlb.com/components/game/mlb/year_2013/month_04/day_22/master_scoreboard.json");
        assertNotNull(masterScoreboard);
//        JSONObject jsonObject = null;
//        JSONObject data = null;
//        JSONObject games = null;
//        JSONArray gameArray = null;
//        try {
//            URL msUrl = new URL("http://gd2.mlb.com/components/game/mlb/year_2013/month_04/day_22/master_scoreboard.json");
//            BufferedReader br = new BufferedReader(new InputStreamReader(msUrl.openStream()));
//            String jsonIn;
//            while((jsonIn = br.readLine()) != null) {
//                jsonObject = new JSONObject(jsonIn);
//            }
//
//            data = jsonObject.getJSONObject("data");
//            games = data.getJSONObject("games");
//            gameArray = games.getJSONArray("game");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        Gson gson = new Gson();
//        MasterScoreboard masterScoreboard = gson.fromJson(String.valueOf(jsonObject), MasterScoreboard.class);
//        MasterScoreboardGame[] masterScoreboardGames = new MasterScoreboardGame[gameArray.length()];
//        for(int i = 0; i < gameArray.length(); i++) {
//            try {
//                masterScoreboardGames[i] = gson.fromJson(gameArray.get(i).toString(), MasterScoreboardGame.class);
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        }
//        masterScoreboard.setGames(masterScoreboardGames);
//        System.out.println();
    }
}
