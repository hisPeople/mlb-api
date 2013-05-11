package com.mlb.api.model;

/**
 * User: devon
 * Date: 5/6/13
 * Time: 8:26 AM
 */
public class IndividualPitchingRank {
    private String league_code;
    private String pa_rank;
    private int gidp;
    private String avg_rank;
    private int np;
    private String l_rank;
    private String h_rank;
    private String ao_rank;
    private String svo_rank;
    private String gidp_rank;
    private String s_rank;
    private int sho;
    private String go_ao_rank;
    private String sho_rank;
    private String ip_rank;
    private String hr_rank;
    private int bk;
    private String er_rank;
    private String so_rank;
    private int sv;
    private String ir_rank;
    private double whip;
    private double avg;
    private int bb;
    private String team_full;
    private String league_full;
    private String team_abbrev;
    private int so;
    private int wp;
    private String ab_rank;
    private int hb;
    private String w_rank;
    private String gs_rank;
    private String r_rank;
    private int season;
    private int pa;
    private String bb_rank;
    private String go_rank;
    private double go_ao;
    private int cg;
    private int ibb;
    private int gs;
    private int team_id;
    private int go;
    private int hr;
    private int irs;
    private double era;
    private String qualifies;
    private String cg_rank;
    private String whip_rank;
    private String np_rank;
    private String hb_rank;
    private String g_rank;
    private String league_short;
    private int ir;
    private int g;
    private String league_abbrev;
    private int hld;
    private String sv_rank;
    private String bk_rank;
    private String irs_rank;
    private int l;
    private String team_short;
    private int svo;
    private String wp_rank;
    private int h;
    private double ip;
    private int w;
    private String ibb_rank;
    private int s;
    private int ao;
    private int r;
    private String era_rank;
    private int ab;
    private String hld_rank;
    private int er;

    public String getLeagueCode() {
        return league_code;
    }

    public String getPlateAppearancesRank() {
        return pa_rank;
    }

    public int getGIDP() {
        return gidp;
    }

    public String getAvgRank() {
        return avg_rank;
    }

    public int getNumberOfPitches() {
        return np;
    }

    public String getLossesRank() {
        return l_rank;
    }

    public String getHitsRank() {
        return h_rank;
    }

    public String getFlyoutsRank() {
        return ao_rank;
    }

    public String getSaveOpsRank() {
        return svo_rank;
    }

    public String getGIDPRank() {
        return gidp_rank;
    }

    public String getStrikesRank() {
        return s_rank;
    }

    public int getShutouts() {
        return sho;
    }

    public String getGroundoutToFlyoutRank() {
        return go_ao_rank;
    }

    public String getShutoutsRank() {
        return sho_rank;
    }

    public String getInningsPitchedRank() {
        return ip_rank;
    }

    public String getHomerunsRank() {
        return hr_rank;
    }

    public int getBalks() {
        return bk;
    }

    public String getEarnedRunsRank() {
        return er_rank;
    }

    public String getStrikeoutsRank() {
        return so_rank;
    }

    public int getSaves() {
        return sv;
    }

    public String getInheritedRunnersRank() {
        return ir_rank;
    }

    public double getWHIP() {
        return whip;
    }

    public double getAvg() {
        return avg;
    }

    public int getWalks() {
        return bb;
    }

    public String getTeamNameFull() {
        return team_full;
    }

    public String getLeagueFull() {
        return league_full;
    }

    public String getTeamAbbrev() {
        return team_abbrev;
    }

    public int getStrikeouts() {
        return so;
    }

    public int getWildPitches() {
        return wp;
    }

    public String getAtBatsRank() {
        return ab_rank;
    }

    public int getHitBatters() {
        return hb;
    }

    public String getWinsRank() {
        return w_rank;
    }

    public String getGamesStartedRank() {
        return gs_rank;
    }

    public String getRunsRank() {
        return r_rank;
    }

    public int getSeason() {
        return season;
    }

    public int getPlateAppearances() {
        return pa;
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

    public int getCompleteGames() {
        return cg;
    }

    public int getIntentionalWalks() {
        return ibb;
    }

    public int getGamesStarted() {
        return gs;
    }

    public int getTeamID() {
        return team_id;
    }

    public int getGroundouts() {
        return go;
    }

    public int getHomeruns() {
        return hr;
    }

    public int getInheritedRunnersScored() {
        return irs;
    }

    public double getERA() {
        return era;
    }

    public boolean isQualifier() {
        return qualifies.equals("Y");
    }

    public String getCompleteGamesRank() {
        return cg_rank;
    }

    public String getWHIPRank() {
        return whip_rank;
    }

    public String getNumberOfPitchesRank() {
        return np_rank;
    }

    public String getHitBattersRank() {
        return hb_rank;
    }

    public String getGamesRank() {
        return g_rank;
    }

    public String getLeagueShort() {
        return league_short;
    }

    public int getInheritedRunners() {
        return ir;
    }

    public int getGames() {
        return g;
    }

    public String getLeagueAbbrev() {
        return league_abbrev;
    }

    public int getHolds() {
        return hld;
    }

    public String getSavesRank() {
        return sv_rank;
    }

    public String getBalksRank() {
        return bk_rank;
    }

    public String getInheritedRunnersScoredRank() {
        return irs_rank;
    }

    public int getLosses() {
        return l;
    }

    public String getTeamShort() {
        return team_short;
    }

    public int getSaveOps() {
        return svo;
    }

    public String getWildPitchesRank() {
        return wp_rank;
    }

    public int getHits() {
        return h;
    }

    public double getInningsPitched() {
        return ip;
    }

    public int getWins() {
        return w;
    }

    public String getIntentionalWalksRank() {
        return ibb_rank;
    }

    public int getStrikesThrown() {
        return s;
    }

    public int getFlyouts() {
        return ao;
    }

    public int getRuns() {
        return r;
    }

    public String getERARank() {
        return era_rank;
    }

    public int getAtBats() {
        return ab;
    }

    public String getHoldsRank() {
        return hld_rank;
    }

    public int getEarnedRuns() {
        return er;
    }
}
