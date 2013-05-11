package com.mlb.api.parser;

import com.mlb.api.model.IndividualPitchingRank;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * User: devon
 * Date: 5/6/13
 * Time: 10:57 AM
 */
public class IndividualPitchingRankParserTest {

    @Test
    public void individualPitchingRankParseTest(){
        IndividualPitchingRankParser individualPitchingRankParser = new IndividualPitchingRankParser();
        IndividualPitchingRank[] pitchingRanks = individualPitchingRankParser.parse("453329");
        assertNotNull(pitchingRanks);
        for(IndividualPitchingRank pitchingRank : pitchingRanks) {
            assertNotNull(pitchingRank.getLeagueCode());
            assertNotNull(pitchingRank.getPlateAppearancesRank());
            assertNotNull(pitchingRank.getGIDP());
            assertNotNull(pitchingRank.getAvgRank());
            assertNotNull(pitchingRank.getNumberOfPitches());
            assertNotNull(pitchingRank.getLossesRank());
            assertNotNull(pitchingRank.getHitsRank());
            assertNotNull(pitchingRank.getFlyoutsRank());
            assertNotNull(pitchingRank.getSaveOpsRank());
            assertNotNull(pitchingRank.getGIDPRank());
            assertNotNull(pitchingRank.getStrikesRank());
            assertNotNull(pitchingRank.getShutouts());
            assertNotNull(pitchingRank.getGroundoutToFlyoutRank());
            assertNotNull(pitchingRank.getShutoutsRank());
            assertNotNull(pitchingRank.getInningsPitchedRank());
            assertNotNull(pitchingRank.getHomerunsRank());
            assertNotNull(pitchingRank.getBalks());
            assertNotNull(pitchingRank.getEarnedRunsRank());
            assertNotNull(pitchingRank.getStrikeoutsRank());
            assertNotNull(pitchingRank.getSaves());
            assertNotNull(pitchingRank.getInheritedRunnersRank());
            assertNotNull(pitchingRank.getWHIP());
            assertNotNull(pitchingRank.getAvg());
            assertNotNull(pitchingRank.getWalks());
            assertNotNull(pitchingRank.getTeamNameFull());
            assertNotNull(pitchingRank.getLeagueFull());
            assertNotNull(pitchingRank.getTeamAbbrev());
            assertNotNull(pitchingRank.getStrikeouts());
            assertNotNull(pitchingRank.getWildPitches());
            assertNotNull(pitchingRank.getAtBatsRank());
            assertNotNull(pitchingRank.getHitBatters());
            assertNotNull(pitchingRank.getWinsRank());
            assertNotNull(pitchingRank.getGamesStartedRank());
            assertNotNull(pitchingRank.getRunsRank());
            assertNotNull(pitchingRank.getSeason());
            assertNotNull(pitchingRank.getPlateAppearances());
            assertNotNull(pitchingRank.getWalksRank());
            assertNotNull(pitchingRank.getGroundoutsRank());
            assertNotNull(pitchingRank.getGroundoutToFlyoutRatio());
            assertNotNull(pitchingRank.getCompleteGames());
            assertNotNull(pitchingRank.getIntentionalWalks());
            assertNotNull(pitchingRank.getGamesStarted());
            assertNotNull(pitchingRank.getTeamID());
            assertNotNull(pitchingRank.getGroundouts());
            assertNotNull(pitchingRank.getHomeruns());
            assertNotNull(pitchingRank.getInheritedRunnersScored());
            assertNotNull(pitchingRank.getERA());
            assertNotNull(pitchingRank.isQualifier());
            assertNotNull(pitchingRank.getCompleteGamesRank());
            assertNotNull(pitchingRank.getWHIPRank());
            assertNotNull(pitchingRank.getNumberOfPitchesRank());
            assertNotNull(pitchingRank.getHitBattersRank());
            assertNotNull(pitchingRank.getGamesRank());
            assertNotNull(pitchingRank.getLeagueShort());
            assertNotNull(pitchingRank.getInheritedRunners());
            assertNotNull(pitchingRank.getGames());
            assertNotNull(pitchingRank.getLeagueAbbrev());
            assertNotNull(pitchingRank.getHolds());
            assertNotNull(pitchingRank.getSavesRank());
            assertNotNull(pitchingRank.getBalksRank());
            assertNotNull(pitchingRank.getInheritedRunnersScoredRank());
            assertNotNull(pitchingRank.getLosses());
            assertNotNull(pitchingRank.getTeamShort());
            assertNotNull(pitchingRank.getSaveOps());
            assertNotNull(pitchingRank.getWildPitchesRank());
            assertNotNull(pitchingRank.getHits());
            assertNotNull(pitchingRank.getInningsPitched());
            assertNotNull(pitchingRank.getWins());
            assertNotNull(pitchingRank.getIntentionalWalksRank());
            assertNotNull(pitchingRank.getStrikesThrown());
            assertNotNull(pitchingRank.getFlyouts());
            assertNotNull(pitchingRank.getRuns());
            assertNotNull(pitchingRank.getERARank());
            assertNotNull(pitchingRank.getAtBats());
            assertNotNull(pitchingRank.getHoldsRank());
            assertNotNull(pitchingRank.getEarnedRuns());
        }
    }
}
