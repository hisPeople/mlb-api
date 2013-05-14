package com.mlb.api.model.masterscoreboard;

/**
 * User: devon
 * Date: 5/14/13
 * Time: 8:57 AM
 */
public class MasterScoreboardSavePitcher {
    private String id;
    private String last;
    private String saves;
    private String losses;
    private String era;
    private String name_display_roster;
    private String number;
    private String svo;
    private String first;
    private String wins;

    public String getId() {
        return id;
    }

    public String getLast() {
        return last;
    }

    public String getSaves() {
        return saves;
    }

    public String getLosses() {
        return losses;
    }

    public String getEra() {
        return era;
    }

    public String getName_display_roster() {
        return name_display_roster;
    }

    public String getNumber() {
        return number;
    }

    public String getSvo() {
        return svo;
    }

    public String getFirst() {
        return first;
    }

    public String getWins() {
        return wins;
    }
}
