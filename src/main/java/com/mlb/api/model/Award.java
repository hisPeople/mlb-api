package com.mlb.api.model;

/**
 * User: devon
 * Date: 5/4/13
 * Time: 9:57 AM
 */
public class Award {
    private String position;
    private String award_date;
    private String league_abbrev;
    private String player;
    private String display_date;
    private String award;
    private int player_id;
    private String team;
    private String notes;
    private String league;
    private int team_id;

    public String getPosition() {
        return position;
    }

    public String getAwardDate() {
        return award_date;
    }

    public String getLeagueAbbrev() {
        return league_abbrev;
    }

    public String getPlayer() {
        return player;
    }

    public String getDisplayDate() {
        return display_date;
    }

    public String getAward() {
        return award;
    }

    public int getPlayerID() {
        return player_id;
    }

    public String getTeam() {
        return team;
    }

    public String getNotes() {
        return notes;
    }

    public String getLeague() {
        return league;
    }

    public int getTeamID() {
        return team_id;
    }
}
