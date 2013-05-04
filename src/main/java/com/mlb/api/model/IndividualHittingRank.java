package com.mlb.api.model;

/**
 * User: devon
 * Date: 5/4/13
 * Time: 10:04 AM
 */
public class IndividualHittingRank {
    private String league_code;
    private int avg_rank;
    private int h_rank;
    private int ao_rank;
    private int h3b_rank;
    private int go_ao_rank;
    private int hr_rank;
    private int tb;
    private int hbp_rank;
    private int h2b;
    private int so_rank;
    private double slg;
    private double avg;
    private int bb;
    private double ops;
    private int slg_rank;
    private String team_full;
    private String team_abbrev;
    private int so;
    private int h2b_rank;
    private int ab_rank;
    private int sb_rank;
    private int cs;
    private int r_rank;
    private int season;
    private int bb_rank;
    private int go_rank;
    private double go_ao;
    private int sb;
    private int h3b;
    private int ibb;
    private int team_id;
    private int go;
    private int tb_rank;
    private int hr;
    private String qualifies;
    private int rbi;
    private int rbi_rank;
    private int g_rank;
    private String league_short;
    private int cs_rank;
    private int g;
    private String league_abbrev;
    private String team_short;
    private int obp_rank;
    private int ops_rank;
    private int h;
    private double obp;
    private int ibb_rank;
    private int ao;
    private int r;
    private int ab;

    public String getLeagueCode() {
        return league_code;
    }

    public int getAverageRank() {
        return avg_rank;
    }

    public int getHitsRank() {
        return h_rank;
    }

    public int getFlyoutsRank() {
        return ao_rank;
    }

    public int getTriplesRank() {
        return h3b_rank;
    }

    public int getGroundoutToFlyoutRank() {
        return go_ao_rank;
    }

    public int getHomerunRank() {
        return hr_rank;
    }

    public int getTotalBases() {
        return tb;
    }

    public int getHitByPitchRank() {
        return hbp_rank;
    }

    public int getDoubles() {
        return h2b;
    }

    public int getStrikoutRank() {
        return so_rank;
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

    public double getOnbasePlusSlugging() {
        return ops;
    }

    public int getSluggingRank() {
        return slg_rank;
    }

    public String getTeamNameFull() {
        return team_full;
    }

    public String getTeamNameAbbrev() {
        return team_abbrev;
    }

    public int getStrikeouts() {
        return so;
    }

    public int getDoublesRank() {
        return h2b_rank;
    }

    public int getAtBatsRank() {
        return ab_rank;
    }

    public int getStolenBasesRank() {
        return sb_rank;
    }

    public int getCaughtStealing() {
        return cs;
    }

    public int getRunsRank() {
        return r_rank;
    }

    public int getSeasonYear() {
        return season;
    }

    public int getWalksRank() {
        return bb_rank;
    }

    public int getGroundoutsRank() {
        return go_rank;
    }

    public double getGroundoutToFlyoutRatio() {
        return go_ao;
    }

    public int getStolenBases() {
        return sb;
    }

    public int getTriples() {
        return h3b;
    }

    public int getIntentionalWalks() {
        return ibb;
    }

    public int getTeamID() {
        return team_id;
    }

    public int getGroundouts() {
        return go;
    }

    public int getTotalBasesRank() {
        return tb_rank;
    }

    public int getHomeruns() {
        return hr;
    }

    // lets the string 'qualifies' be accessed as a boolean
    public boolean isQualifier() {
        return qualifies.equals("Y");
    }

    public int getRunsBattedIn() {
        return rbi;
    }

    public int getRunsBattedInRank() {
        return rbi_rank;
    }

    public int getGamesRank() {
        return g_rank;
    }

    public String getLeagueShortName() {
        return league_short;
    }

    public int getCaughtStealingRank() {
        return cs_rank;
    }

    public int getGames() {
        return g;
    }

    public String getLeagueNameAbbrev() {
        return league_abbrev;
    }

    public String getTeamShortName() {
        return team_short;
    }

    public int getOnBasePercentageRank() {
        return obp_rank;
    }

    public int getOPSRank() {
        return ops_rank;
    }

    public int getHits() {
        return h;
    }

    public double getOnBasePercentage() {
        return obp;
    }

    public int getIntentionalWalksRank() {
        return ibb_rank;
    }

    public int getFlyouts() {
        return ao;
    }

    public int getRuns() {
        return r;
    }

    public int getAtBats() {
        return ab;
    }
}
