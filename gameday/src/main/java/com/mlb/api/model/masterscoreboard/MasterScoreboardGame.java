package com.mlb.api.model.masterscoreboard;

/**
 * User: devon
 * Date: 5/12/13
 * Time: 8:30 AM
 */

public class MasterScoreboardGame {
    private MasterScoreboardBroadcast broadcast;
    private MasterScoreboardSavePitcher save_pitcher;
    private String game_type;
    private String double_header_sw;
    private String time;
    private String home_time;
    private String home_team_name;
    private String description;
    private String original_date;
    private String home_team_city;
    private String venue_id;
    private String gameday_sw; // what is this??
    private String away_win;
    private String home_games_back_wildcard;
    private String away_team_id;
    private String tz_hm_lg_gen;
    private MasterScoreboardStatus status;
    private String home_loss;
    private String home_games_back;
    private String home_code;
    private String away_sport_code;
    private String home_win;
    private String time_hm_lg;
    private String away_name_abbrev;
    private String league;
    private String time_zone_aw_lg;
    private String away_games_back;
    private String home_file_code;
    private String game_data_directory;
    private String time_zone;
    private String away_league_id;
    private String home_team_id;
    private String day;
    private String time_aw_lg;
    private String away_team_city;
    private String tz_aw_lg_gen;
    private String away_code;
    private MasterScoreboardWinningLosingPitcher winning_pitcher;
    //TODO: game media

    private String time_date_aw_lg;
    private String away_games_back_wildcard;
    private String scheduled_innings;
    private MasterScoreboardLinescore linescore;

    private String venue_w_chan_loc;
    private String first_pitch_et;
    private String away_team_name;

    private Homeruns home_runs;
    private String time_date_hm_lg;
    private String id;
    private String home_name_abbrev;
    private String ampm;
    private String home_division;
    private String home_time_zone;
    private String away_time_zone;
    private String hm_lg_ampm;
    private String home_sport_code;
    private String time_date;

    //TODO: links

    private String home_ampm;
    private String game_pk;
    private String venue;
    private String home_league_id;
    private String video_thumbnail;
    private String away_loss;
    private String resume_date;
    private String away_file_code;
    private MasterScoreboardWinningLosingPitcher losing_pitcher;
    private String away_lg_ampm;
    //TODO: video_tumbnails
    private String time_zone_hm_lg;
    private String away_ampm;
    private String gameday;
    private String away_division;

    public String getAway_division() {
        return away_division;
    }

    public MasterScoreboardBroadcast getBroadcast() {
        return broadcast;
    }

    public MasterScoreboardSavePitcher getSave_pitcher() {
        return save_pitcher;
    }

    public String getGame_type() {
        return game_type;
    }

    public String getDouble_header_sw() {
        return double_header_sw;
    }

    public String getTime() {
        return time;
    }

    public String getHome_time() {
        return home_time;
    }

    public String getHome_team_name() {
        return home_team_name;
    }

    public String getDescription() {
        return description;
    }

    public String getOriginal_date() {
        return original_date;
    }

    public String getHome_team_city() {
        return home_team_city;
    }

    public String getVenue_id() {
        return venue_id;
    }

    public String getGameday_sw() {
        return gameday_sw;
    }

    public String getAway_win() {
        return away_win;
    }

    public String getHome_games_back_wildcard() {
        return home_games_back_wildcard;
    }

    public String getAway_team_id() {
        return away_team_id;
    }

    public String getTz_hm_lg_gen() {
        return tz_hm_lg_gen;
    }

    public MasterScoreboardStatus getStatus() {
        return status;
    }

    public String getHome_loss() {
        return home_loss;
    }

    public String getHome_games_back() {
        return home_games_back;
    }

    public String getHome_code() {
        return home_code;
    }

    public String getAway_sport_code() {
        return away_sport_code;
    }

    public String getHome_win() {
        return home_win;
    }

    public String getTime_hm_lg() {
        return time_hm_lg;
    }

    public String getAway_name_abbrev() {
        return away_name_abbrev;
    }

    public String getLeague() {
        return league;
    }

    public String getTime_zone_aw_lg() {
        return time_zone_aw_lg;
    }

    public String getAway_games_back() {
        return away_games_back;
    }

    public String getHome_file_code() {
        return home_file_code;
    }

    public String getGame_data_directory() {
        return game_data_directory;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public String getAway_league_id() {
        return away_league_id;
    }

    public String getHome_team_id() {
        return home_team_id;
    }

    public String getDay() {
        return day;
    }

    public String getTime_aw_lg() {
        return time_aw_lg;
    }

    public String getAway_team_city() {
        return away_team_city;
    }

    public String getTz_aw_lg_gen() {
        return tz_aw_lg_gen;
    }

    public String getAway_code() {
        return away_code;
    }

    public MasterScoreboardWinningLosingPitcher getWinning_pitcher() {
        return winning_pitcher;
    }

    public String getTime_date_aw_lg() {
        return time_date_aw_lg;
    }

    public String getAway_games_back_wildcard() {
        return away_games_back_wildcard;
    }

    public String getScheduled_innings() {
        return scheduled_innings;
    }

    public MasterScoreboardLinescore getLinescore() {
        return linescore;
    }

    public String getVenue_w_chan_loc() {
        return venue_w_chan_loc;
    }

    public String getFirst_pitch_et() {
        return first_pitch_et;
    }

    public String getAway_team_name() {
        return away_team_name;
    }

    public Homeruns getHome_runs() {
        return home_runs;
    }

    public String getTime_date_hm_lg() {
        return time_date_hm_lg;
    }

    public String getId() {
        return id;
    }

    public String getHome_name_abbrev() {
        return home_name_abbrev;
    }

    public String getAmpm() {
        return ampm;
    }

    public String getHome_division() {
        return home_division;
    }

    public String getHome_time_zone() {
        return home_time_zone;
    }

    public String getAway_time_zone() {
        return away_time_zone;
    }

    public String getHm_lg_ampm() {
        return hm_lg_ampm;
    }

    public String getHome_sport_code() {
        return home_sport_code;
    }

    public String getTime_date() {
        return time_date;
    }

    public String getHome_ampm() {
        return home_ampm;
    }

    public String getGame_pk() {
        return game_pk;
    }

    public String getVenue() {
        return venue;
    }

    public String getHome_league_id() {
        return home_league_id;
    }

    public String getVideo_thumbnail() {
        return video_thumbnail;
    }

    public String getAway_loss() {
        return away_loss;
    }

    public String getResume_date() {
        return resume_date;
    }

    public String getAway_file_code() {
        return away_file_code;
    }

    public MasterScoreboardWinningLosingPitcher getLosing_pitcher() {
        return losing_pitcher;
    }

    public String getAway_lg_ampm() {
        return away_lg_ampm;
    }

    public String getTime_zone_hm_lg() {
        return time_zone_hm_lg;
    }

    public String getAway_ampm() {
        return away_ampm;
    }

    public String getGameday() {
        return gameday;
    }
}
