package com.mlb.api.model;

/**
 * User: devon
 * Date: 5/12/13
 * Time: 8:30 AM
 */
public class Game {

    private Broadcast broadcast;
    private Player save_pitcher;
    private String game_type;
    private String double_header_sw;
    private String time;
    private String home_time;
    private String home_team_name;
    private String description;
    private String original_date;
    private String home_team_city;
    private int venue_id;
    private String gameday_sw; // what is this??
    private int away_win;
    private double home_games_back_wildcard;
    private int away_team_id;
    private String tz_hm_lg_gen;
    private Status status;
    private int home_loss;
}
