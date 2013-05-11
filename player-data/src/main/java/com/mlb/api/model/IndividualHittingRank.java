package com.mlb.api.model;

/**
 * User: devon
 * Date: 5/4/13
 * Time: 10:04 AM
 */
public class IndividualHittingRank {
    private String league_code;
    private String avg_rank;
    private String h_rank;
    private String ao_rank;
    private String h3b_rank;
    private String go_ao_rank;
    private String hr_rank;
    private int tb;
    private String hbp_rank;
    private int h2b;
    private String so_rank;
    private double slg;
    private double avg;
    private int bb;
    private double ops;
    private String slg_rank;
    private String team_full;
    private String team_abbrev;
    private int so;
    private String h2b_rank;
    private String ab_rank;
    private String sb_rank;
    private int cs;
    private String r_rank;
    private int season;
    private String bb_rank;
    private String go_rank;
    private double go_ao;
    private int sb;
    private int h3b;
    private int ibb;
    private int team_id;
    private int go;
    private String tb_rank;
    private int hr;
    private String qualifies;
    private int rbi;
    private String rbi_rank;
    private String g_rank;
    private String league_short;
    private String cs_rank;
    private int g;
    private String league_abbrev;
    private String team_short;
    private String obp_rank;
    private String ops_rank;
    private int h;
    private double obp;
    private String ibb_rank;
    private int ao;
    private int r;
    private int ab;

    public String getLeagueCode() {
        return league_code;
    }

    public String getAverageRank() {
        return avg_rank;
    }

    public String getHitsRank() {
        return h_rank;
    }

    public String getFlyoutsRank() {
        return ao_rank;
    }

    public String getTriplesRank() {
        return h3b_rank;
    }

    public String getGroundoutToFlyoutRank() {
        return go_ao_rank;
    }

    public String getHomerunRank() {
        return hr_rank;
    }

    public int getTotalBases() {
        return tb;
    }

    public String getHitByPitchRank() {
        return hbp_rank;
    }

    public int getDoubles() {
        return h2b;
    }

    public String getStrikoutRank() {
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

    public String getSluggingRank() {
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

    public String getDoublesRank() {
        return h2b_rank;
    }

    public String getAtBatsRank() {
        return ab_rank;
    }

    public String getStolenBasesRank() {
        return sb_rank;
    }

    public int getCaughtStealing() {
        return cs;
    }

    public String getRunsRank() {
        return r_rank;
    }

    public int getSeasonYear() {
        return season;
    }

    public String getWalksRank() {
        return bb_rank;
    }

    public String getGroundoutsRank() {
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

    public String getTotalBasesRank() {
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

    public String getRunsBattedInRank() {
        return rbi_rank;
    }

    public String getGamesRank() {
        return g_rank;
    }

    public String getLeagueShortName() {
        return league_short;
    }

    public String getCaughtStealingRank() {
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

    public String getOnBasePercentageRank() {
        return obp_rank;
    }

    public String getOPSRank() {
        return ops_rank;
    }

    public int getHits() {
        return h;
    }

    public double getOnBasePercentage() {
        return obp;
    }

    public String getIntentionalWalksRank() {
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
