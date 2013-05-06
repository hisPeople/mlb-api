package com.mlb.api.parser;

import com.mlb.api.model.Award;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * User: devon
 * Date: 5/5/13
 * Time: 6:46 PM
 */
public class PlayerAwardsParserTest {

    @Test
    public void playerAwardParseTest() {
        PlayerAwardsParser playerAwardsParser = new PlayerAwardsParser();
        Award[] awards = playerAwardsParser.parse("425545");
        assertNotNull(awards);
        for(Award award : awards) {
            assertNotNull(award.getPosition());
            assertNotNull(award.getAwardDate());
            assertNotNull(award.getLeagueAbbrev());
            assertNotNull(award.getPlayer());
            assertNotNull(award.getDisplayDate());
            assertNotNull(award.getAward());
            assertNotNull(award.getPlayerID());
            assertNotNull(award.getTeam());
            assertNotNull(award.getNotes());
            assertNotNull(award.getLeague());
            assertNotNull(award.getTeamID());
        }
    }
}
