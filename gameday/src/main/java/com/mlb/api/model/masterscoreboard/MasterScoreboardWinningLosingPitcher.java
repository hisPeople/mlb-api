package com.mlb.api.model.masterscoreboard;

/**
 * User: devon
 * Date: 5/14/13
 * Time: 9:13 AM
 */
public class MasterScoreboardWinningLosingPitcher {
    private String id;
    private String last;
    private String losses;
    private String era;
    private String number;
    private String name_display_roster;
    private String first;
    private String wins;

    public String getId() {
        return id;
    }

    public String getLast() {
        return last;
    }

    public String getLosses() {
        return losses;
    }

    public String getEra() {
        return era;
    }

    public String getNumber() {
        return number;
    }

    public String getName_display_roster() {
        return name_display_roster;
    }

    public String getFirst() {
        return first;
    }

    public String getWins() {
        return wins;
    }
}
