package com.mlb.api.model;


import java.util.Date;

/**
 * User: devon
 * Date: 5/4/13
 * Time: 9:57 AM
 */
public class Award {
    private String position;
    private Date awardDate;
    private String leagueAbbrev;
    private String playerName;
    private String award;
    private int playerID;
    private String teamName;
    private String notes;
    private String league;
    private int teamID;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getAwardDate() {
        return awardDate;
    }

    public void setAwardDate(Date awardDate) {
        this.awardDate = awardDate;
    }

    public String getLeagueAbbrev() {
        return leagueAbbrev;
    }

    public void setLeagueAbbrev(String leagueAbbrev) {
        this.leagueAbbrev = leagueAbbrev;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }
}
