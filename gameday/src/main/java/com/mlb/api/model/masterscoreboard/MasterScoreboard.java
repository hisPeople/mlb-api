package com.mlb.api.model.masterscoreboard;

/**
 * User: devon
 * Date: 5/12/13
 * Time: 8:29 AM
 */
public class MasterScoreboard {

    private String subject;
    private String copyright;
    private MasterScoreboardGame[] games;

    public String getSubject() {
        return subject;
    }

    public String getCopyright() {
        return copyright;
    }

    public MasterScoreboardGame[] getGames() {
        return games;
    }

    public void setGames(MasterScoreboardGame[] games) {
        this.games = games;
    }
}
