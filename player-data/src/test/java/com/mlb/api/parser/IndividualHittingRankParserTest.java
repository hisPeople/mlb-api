package com.mlb.api.parser;

import com.mlb.api.model.*;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * User: devon
 * Date: 5/5/13
 * Time: 7:56 PM
 */
public class IndividualHittingRankParserTest {

    @Test
    public void individualHittingRankParseTest() {
        IndividualHittingRankParser individualHittingRankParser = new IndividualHittingRankParser();
        IndividualHittingRank[] hittingRanks = individualHittingRankParser.parse("425545");
        assertNotNull(hittingRanks);
        for(IndividualHittingRank hittingRank : hittingRanks) {
            assertNotNull(hittingRank.getLeagueCode());
            assertNotNull(hittingRank.getAverageRank());
            assertNotNull(hittingRank.getHitsRank());
            assertNotNull(hittingRank.getFlyoutsRank());
            assertNotNull(hittingRank.getTriplesRank());
            assertNotNull(hittingRank.getGroundoutToFlyoutRank());
            assertNotNull(hittingRank.getHomerunRank());
            assertNotNull(hittingRank.getTotalBases());
            assertNotNull(hittingRank.getHitByPitchRank());
            assertNotNull(hittingRank.getDoubles());
            assertNotNull(hittingRank.getStrikoutRank());
            assertNotNull(hittingRank.getSluggingPercentage());
            assertNotNull(hittingRank.getBattingAverage());
            assertNotNull(hittingRank.getWalks());
            assertNotNull(hittingRank.getOnbasePlusSlugging());
            assertNotNull(hittingRank.getSluggingRank());
            assertNotNull(hittingRank.getTeamNameFull());
            assertNotNull(hittingRank.getTeamNameAbbrev());
            assertNotNull(hittingRank.getStrikeouts());
            assertNotNull(hittingRank.getDoublesRank());
            assertNotNull(hittingRank.getAtBatsRank());
            assertNotNull(hittingRank.getStolenBasesRank());
            assertNotNull(hittingRank.getCaughtStealing());
            assertNotNull(hittingRank.getRunsRank());
            assertNotNull(hittingRank.getSeasonYear());
            assertNotNull(hittingRank.getWalksRank());
            assertNotNull(hittingRank.getGroundoutsRank());
            assertNotNull(hittingRank.getGroundoutToFlyoutRatio());
            assertNotNull(hittingRank.getStolenBases());
            assertNotNull(hittingRank.getTriples());
            assertNotNull(hittingRank.getIntentionalWalks());
            assertNotNull(hittingRank.getTeamID());
            assertNotNull(hittingRank.getGroundouts());
            assertNotNull(hittingRank.getTotalBasesRank());
            assertNotNull(hittingRank.getHomeruns());
            assertNotNull(hittingRank.isQualifier());
            assertNotNull(hittingRank.getRunsBattedIn());
            assertNotNull(hittingRank.getRunsBattedInRank());
            assertNotNull(hittingRank.getGamesRank());
            assertNotNull(hittingRank.getLeagueShortName());
            assertNotNull(hittingRank.getCaughtStealingRank());
            assertNotNull(hittingRank.getGames());
            assertNotNull(hittingRank.getLeagueNameAbbrev());
            assertNotNull(hittingRank.getTeamShortName());
            assertNotNull(hittingRank.getOnBasePercentageRank());
            assertNotNull(hittingRank.getOPSRank());
            assertNotNull(hittingRank.getHits());
            assertNotNull(hittingRank.getOnBasePercentage());
            assertNotNull(hittingRank.getIntentionalWalksRank());
            assertNotNull(hittingRank.getFlyouts());
            assertNotNull(hittingRank.getRuns());
            assertNotNull(hittingRank.getAtBats());
        }
    }
}
