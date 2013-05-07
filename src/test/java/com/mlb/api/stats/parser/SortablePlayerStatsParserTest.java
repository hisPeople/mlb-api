package com.mlb.api.stats.parser;

import com.mlb.api.stats.model.SortablePlayerStats;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * User: devon
 * Date: 5/7/13
 * Time: 11:05 AM
 */
public class SortablePlayerStatsParserTest {

    @Test
    public void sortablePlayerStatsParseTest() {
        SortablePlayerStatsParser sortablePlayerStatsParser = new SortablePlayerStatsParser();
        SortablePlayerStats[] sortablePlayerStats = sortablePlayerStatsParser.parse();
        assertNotNull(sortablePlayerStats);
        for(SortablePlayerStats playerStats : sortablePlayerStats) {
            assertNotNull(playerStats.getHomeruns());
            assertNotNull(playerStats.getMinimumQualifyingNumber());
            assertNotNull(playerStats.getNumberOfPitches());
            assertNotNull(playerStats.getSacrificeBunts());
            assertNotNull(playerStats.getGroundedIntoDoublePlay());
            assertNotNull(playerStats.getNameDisplayFirstLast());
            assertNotNull(playerStats.getDisplayNameRoster());
            // the given url by default should only pull qualifiers
            assertTrue(playerStats.isQualifier());
            assertNotNull(playerStats.getPosition());
            assertNotNull(playerStats.getRunsBattedIn());
            assertNotNull(playerStats.getRank());
            assertNotNull(playerStats.getTotalBases());
            assertNotNull(playerStats.getBats());
            assertNotNull(playerStats.getExtraBaseHits());
            assertNotNull(playerStats.getNameDisplayLastInitial());
            assertNotNull(playerStats.getSluggingPercentage());
            assertNotNull(playerStats.getBattingAverage());
            assertNotNull(playerStats.getWalks());
            assertNotNull(playerStats.getOnBasePlusSlugging());
            assertNotNull(playerStats.getHitByPitch());
            assertNotNull(playerStats.getGames());
            assertNotNull(playerStats.getBats());
            assertNotNull(playerStats.getDoubles());
            assertNotNull(playerStats.getTeamNameAbbrev());
            assertNotNull(playerStats.getStrikeouts());
            assertNotNull(playerStats.getTeamName());
            assertNotNull(playerStats.getLeagueID());
            assertNotNull(playerStats.getSacrificeFlies());
            assertNotNull(playerStats.getTeam());
            assertNotNull(playerStats.getLeague());
            assertNotNull(playerStats.getTotalPlateAppearances());
            assertNotNull(playerStats.getNameDisplayLastFirst());
            assertNotNull(playerStats.getHits());
            assertNotNull(playerStats.getCaughtStealing());
            assertNotNull(playerStats.getOnBasePercentage());
            assertNotNull(playerStats.getTriples());
            assertNotNull(playerStats.getFlyouts());
            assertNotNull(playerStats.getRuns());
            assertNotNull(playerStats.getGroundoutToFlyoutRatio());
            assertNotNull(playerStats.getStolenBases());
            assertNotNull(playerStats.getLastName());
            assertNotNull(playerStats.getPlayerID());
            assertNotNull(playerStats.getIntentionalWalks());
            assertNotNull(playerStats.getAtBats());
            assertNotNull(playerStats.getNameLast());
            assertNotNull(playerStats.getPlayerQualifierNumber());
            assertNotNull(playerStats.getTeamID());
            assertNotNull(playerStats.getGroundOuts());
        }
    }
}
