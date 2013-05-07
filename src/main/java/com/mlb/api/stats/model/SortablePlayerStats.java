package com.mlb.api.stats.model;

/**
 * User: devon
 * Date: 5/5/13
 * Time: 8:01 AM
 */
public class SortablePlayerStats {
    private int hr;
    private int gidp;
    private int minimum_qualifier;
    private int np;
    private int sac;
    private int gdp;
    private String name_display_first_last;
    private String name_display_roster;
    private String qualifies;
    private String pos;
    private int rbi;
    private int rank;
    private int tb;
    private String bats;
    private int xbh;
    private String name_display_last_init;
    private double slg;
    private double avg;
    private int bb;
    private double ops;
    private int hbp;
    private int g;
    private int d;
    private String team_abbrev;
    private int so;
    private String team_name;
    private int league_id;
    private int sf;
    private String team;
    private String league;
    private int tpa;
    private String name_display_last_first;
    private int h;
    private int cs;
    private double obp;
    private int t;
    private int ao;
    private int r;
    private double go_ao;
    private int sb;
    private String last_name;
    private int player_id;
    private int ibb;
    private int ab;
    private String name_last;
    private int player_qualifier;
    private int team_id;
    private int go;

    public int getHomeruns() {
        return hr;
    }

    public int getMinimumQualifyingNumber() {
        return minimum_qualifier;
    }


    public int getNumberOfPitches() {
        return np;
    }

    public int getSacrificeBunts() {
        return sac;
    }

    public int getGroundedIntoDoublePlay() {
        return gdp;
    }

    public String getNameDisplayFirstLast() {
        return name_display_first_last;
    }

    public String getDisplayNameRoster() {
        return name_display_roster;
    }

    // allows access to 'qualifies' as a boolean
    public boolean isQualifier() {
        return qualifies.equals("Y");
    }

    public String getPosition() {
        return pos;
    }

    public int getRunsBattedIn() {
        return rbi;
    }

    public int getRank() {
        return rank;
    }

    public int getTotalBases() {
        return tb;
    }

    public String getBats() {
        return bats;
    }

    public int getExtraBaseHits() {
        return xbh;
    }

    public String getNameDisplayLastInitial() {
        return name_display_last_init;
    }

    public double getSluggingPercentage() {
        return slg;
    }

    public double getBattingAverage() {
        return avg;
    }

    public int getWalks() {
        return bb;
    }

    public double getOnBasePlusSlugging() {
        return ops;
    }

    public int getHitByPitch() {
        return hbp;
    }

    public int getGames() {
        return g;
    }

    // what is this
    public int getD() {
        return d;
    }

    public String getTeamNameAbbrev() {
        return team_abbrev;
    }

    public int getStrikeouts() {
        return so;
    }

    public String getTeamName() {
        return team_name;
    }

    public int getLeagueID() {
        return league_id;
    }

    public int getSacrificeFlies() {
        return sf;
    }

    public String getTeam() {
        return team;
    }

    public String getLeague() {
        return league;
    }

    public int getTotalPlateAppearances() {
        return tpa;
    }

    public String getNameDisplayLastFirst() {
        return name_display_last_first;
    }

    public int getHits() {
        return h;
    }

    public int getCaughtStealing() {
        return cs;
    }

    public double getOnBasePercentage() {
        return obp;
    }

    // what is this??
    public int getT() {
        return t;
    }

    public int getFlyouts() {
        return ao;
    }

    public int getRuns() {
        return r;
    }

    public double getGroundoutToFlyoutRatio() {
        return go_ao;
    }

    public int getStolenBases() {
        return sb;
    }

    public String getLastName() {
        return last_name;
    }

    public int getPlayerID() {
        return player_id;
    }

    public int getIntentionalWalks() {
        return ibb;
    }

    public int getAtBats() {
        return ab;
    }

    public String getNameLast() {
        return name_last;
    }

    public int getPlayerQualifierNumber() {
        return player_qualifier;
    }

    public int getTeamID() {
        return team_id;
    }

    public int getGroundOuts() {
        return go;
    }
}
