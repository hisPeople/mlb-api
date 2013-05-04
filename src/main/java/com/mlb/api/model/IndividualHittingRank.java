package com.mlb.api.model;

/**
 * User: devon
 * Date: 5/4/13
 * Time: 10:04 AM
 */
public class IndividualHittingRank {
    private String leagueCode;
    private String teamNameAbbrev;
    private String teamName;
    private String leagueName;
    private String year;
    private int teamID;
    private boolean isQualifier;
    private String leagueShortName;
    private String leagueAbbrev;
    private String teamShortName;

    private int triples;
    private int totalBases;
    private int doubles;
    private double sluggingPercentage;
    private double battingAverage;
    private int walks;
    private double ops;
    private int hitByPitch;
    private int strikeouts;
    private double groundoutToFlyoutRatio;
    private int stolenBases;
    private int caughtStealing;
    private int intentionalWalks;
    private int groundouts;
    private int homeruns;
    private int runsBattedIn;
    private int gamesPlayed;
    private double onBasePercentage;
    private int hits;
    private int flyouts;
    private int runs;
    private int atBats;

    private int triplesRank;
    private int totalBasesRank;
    private int doublesRank;
    private int sluggingPercentageRank;
    private int battingAverageRank;
    private int walksRank;
    private int opsRank;
    private int hitByPitchRank;
    private int strikeoutsRank;
    private int groundoutToflyoutRank;
    private int stolenBasesRank;
    private int caughtStealingRank;
    private int intentionalWalksRank;
    private int groundoutsRank;
    private int homeRunsRank;
    private int runsBattedInRank;
    private int gamesPlayedRank;
    private int onBasePercentageRank;
    private int hitsRank;
    private int flyoutsRank;
    private int runsRank;

    public String getLeagueCode() {
        return leagueCode;
    }

    public void setLeagueCode(String leagueCode) {
        this.leagueCode = leagueCode;
    }

    public String getTeamNameAbbrev() {
        return teamNameAbbrev;
    }

    public void setTeamNameAbbrev(String teamNameAbbrev) {
        this.teamNameAbbrev = teamNameAbbrev;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public boolean isQualifier() {
        return isQualifier;
    }

    public void setQualifier(boolean qualifier) {
        isQualifier = qualifier;
    }

    public String getLeagueShortName() {
        return leagueShortName;
    }

    public void setLeagueShortName(String leagueShortName) {
        this.leagueShortName = leagueShortName;
    }

    public String getLeagueAbbrev() {
        return leagueAbbrev;
    }

    public void setLeagueAbbrev(String leagueAbbrev) {
        this.leagueAbbrev = leagueAbbrev;
    }

    public String getTeamShortName() {
        return teamShortName;
    }

    public void setTeamShortName(String teamShortName) {
        this.teamShortName = teamShortName;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getTotalBases() {
        return totalBases;
    }

    public void setTotalBases(int totalBases) {
        this.totalBases = totalBases;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public double getSluggingPercentage() {
        return sluggingPercentage;
    }

    public void setSluggingPercentage(double sluggingPercentage) {
        this.sluggingPercentage = sluggingPercentage;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public double getOps() {
        return ops;
    }

    public void setOps(double ops) {
        this.ops = ops;
    }

    public int getHitByPitch() {
        return hitByPitch;
    }

    public void setHitByPitch(int hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public double getGroundoutToFlyoutRatio() {
        return groundoutToFlyoutRatio;
    }

    public void setGroundoutToFlyoutRatio(double groundoutToFlyoutRatio) {
        this.groundoutToFlyoutRatio = groundoutToFlyoutRatio;
    }

    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    public int getIntentionalWalks() {
        return intentionalWalks;
    }

    public void setIntentionalWalks(int intentionalWalks) {
        this.intentionalWalks = intentionalWalks;
    }

    public int getGroundouts() {
        return groundouts;
    }

    public void setGroundouts(int groundouts) {
        this.groundouts = groundouts;
    }

    public int getHomeruns() {
        return homeruns;
    }

    public void setHomeruns(int homeruns) {
        this.homeruns = homeruns;
    }

    public int getRunsBattedIn() {
        return runsBattedIn;
    }

    public void setRunsBattedIn(int runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public double getOnBasePercentage() {
        return onBasePercentage;
    }

    public void setOnBasePercentage(double onBasePercentage) {
        this.onBasePercentage = onBasePercentage;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getFlyouts() {
        return flyouts;
    }

    public void setFlyouts(int flyouts) {
        this.flyouts = flyouts;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getTriplesRank() {
        return triplesRank;
    }

    public void setTriplesRank(int triplesRank) {
        this.triplesRank = triplesRank;
    }

    public int getTotalBasesRank() {
        return totalBasesRank;
    }

    public void setTotalBasesRank(int totalBasesRank) {
        this.totalBasesRank = totalBasesRank;
    }

    public int getDoublesRank() {
        return doublesRank;
    }

    public void setDoublesRank(int doublesRank) {
        this.doublesRank = doublesRank;
    }

    public int getSluggingPercentageRank() {
        return sluggingPercentageRank;
    }

    public void setSluggingPercentageRank(int sluggingPercentageRank) {
        this.sluggingPercentageRank = sluggingPercentageRank;
    }

    public int getBattingAverageRank() {
        return battingAverageRank;
    }

    public void setBattingAverageRank(int battingAverageRank) {
        this.battingAverageRank = battingAverageRank;
    }

    public int getWalksRank() {
        return walksRank;
    }

    public void setWalksRank(int walksRank) {
        this.walksRank = walksRank;
    }

    public int getOpsRank() {
        return opsRank;
    }

    public void setOpsRank(int opsRank) {
        this.opsRank = opsRank;
    }

    public int getHitByPitchRank() {
        return hitByPitchRank;
    }

    public void setHitByPitchRank(int hitByPitchRank) {
        this.hitByPitchRank = hitByPitchRank;
    }

    public int getStrikeoutsRank() {
        return strikeoutsRank;
    }

    public void setStrikeoutsRank(int strikeoutsRank) {
        this.strikeoutsRank = strikeoutsRank;
    }

    public int getGroundoutToflyoutRank() {
        return groundoutToflyoutRank;
    }

    public void setGroundoutToflyoutRank(int groundoutToflyoutRank) {
        this.groundoutToflyoutRank = groundoutToflyoutRank;
    }

    public int getStolenBasesRank() {
        return stolenBasesRank;
    }

    public void setStolenBasesRank(int stolenBasesRank) {
        this.stolenBasesRank = stolenBasesRank;
    }

    public int getCaughtStealingRank() {
        return caughtStealingRank;
    }

    public void setCaughtStealingRank(int caughtStealingRank) {
        this.caughtStealingRank = caughtStealingRank;
    }

    public int getIntentionalWalksRank() {
        return intentionalWalksRank;
    }

    public void setIntentionalWalksRank(int intentionalWalksRank) {
        this.intentionalWalksRank = intentionalWalksRank;
    }

    public int getGroundoutsRank() {
        return groundoutsRank;
    }

    public void setGroundoutsRank(int groundoutsRank) {
        this.groundoutsRank = groundoutsRank;
    }

    public int getHomeRunsRank() {
        return homeRunsRank;
    }

    public void setHomeRunsRank(int homeRunsRank) {
        this.homeRunsRank = homeRunsRank;
    }

    public int getRunsBattedInRank() {
        return runsBattedInRank;
    }

    public void setRunsBattedInRank(int runsBattedInRank) {
        this.runsBattedInRank = runsBattedInRank;
    }

    public int getGamesPlayedRank() {
        return gamesPlayedRank;
    }

    public void setGamesPlayedRank(int gamesPlayedRank) {
        this.gamesPlayedRank = gamesPlayedRank;
    }

    public int getOnBasePercentageRank() {
        return onBasePercentageRank;
    }

    public void setOnBasePercentageRank(int onBasePercentageRank) {
        this.onBasePercentageRank = onBasePercentageRank;
    }

    public int getHitsRank() {
        return hitsRank;
    }

    public void setHitsRank(int hitsRank) {
        this.hitsRank = hitsRank;
    }

    public int getFlyoutsRank() {
        return flyoutsRank;
    }

    public void setFlyoutsRank(int flyoutsRank) {
        this.flyoutsRank = flyoutsRank;
    }

    public int getRunsRank() {
        return runsRank;
    }

    public void setRunsRank(int runsRank) {
        this.runsRank = runsRank;
    }

    public int getAtBatsRank() {
        return atBatsRank;
    }

    public void setAtBatsRank(int atBatsRank) {
        this.atBatsRank = atBatsRank;
    }

    private int atBatsRank;

}
