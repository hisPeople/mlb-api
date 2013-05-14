package com.mlb.api.parser;

import com.google.gson.Gson;
import com.mlb.api.model.masterscoreboard.MasterScoreboard;
import com.mlb.api.model.masterscoreboard.MasterScoreboardGame;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;

/**
 * User: devon
 * Date: 5/14/13
 * Time: 10:56 AM
 */
public class MasterScoreboardParser {
//    private static final String BASE_URL_STRING = "http://gd2.mlb.com/components/game/mlb/";
//    private static final String MASTER_SCOREBOARD_JSON = "/master_scoreboard.json";
//    private String completeURLString;
//    private String year;
//    private String month;
//    private String day;
    private Parser<MasterScoreboard> parser;

    public MasterScoreboardParser() {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//
//        int calYear = calendar.get(Calendar.YEAR);
//        int calMonth = calendar.get(Calendar.MONTH);
//        int calDay = calendar.get(Calendar.DATE);
//
//        year = String.valueOf(calYear);
//
//        if(calMonth < 10) {
//            month = "0" + calMonth;
//        }
//
//        if(calDay < 10) {
//            day = "0" + calDay;
//        }
//        completeURLString = BASE_URL_STRING + "/year_" + year + "/month_" + month + "/day_" + day + MASTER_SCOREBOARD_JSON;
        parser = new Parser<MasterScoreboard>(MasterScoreboard.class);
    }

    public MasterScoreboard parse(String url) {
        JSONObject jsonObject = null;
        JSONObject data = null;
        JSONObject games = null;
        JSONArray gameArray = null;
        try {
            URL msUrl = new URL(url);
            BufferedReader br = new BufferedReader(new InputStreamReader(msUrl.openStream()));
            String jsonIn;
            while((jsonIn = br.readLine()) != null) {
                jsonObject = new JSONObject(jsonIn);
            }

            data = jsonObject.getJSONObject("data");
            games = data.getJSONObject("games");
            gameArray = games.getJSONArray("game");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        MasterScoreboard masterScoreboard = parser.parse(String.valueOf(jsonObject));
        MasterScoreboardGame[] masterScoreboardGames = new MasterScoreboardGame[gameArray.length()];
        for(int i = 0; i < gameArray.length(); i++) {
            try {
                Gson gson = new Gson();
                masterScoreboardGames[i] = gson.fromJson(gameArray.get(i).toString(), MasterScoreboardGame.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        masterScoreboard.setGames(masterScoreboardGames);
        return masterScoreboard;
    }
}
