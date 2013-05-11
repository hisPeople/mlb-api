package com.mlb.api.parser;

import com.mlb.api.model.PlayerInfo;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * User: devon
 * Date: 5/5/13
 * Time: 4:34 PM
 */
public class PlayerInfoParserTest {

    @Test
    public void playerInfoParseTest() {
        PlayerInfoParser playerInfoParser = new PlayerInfoParser();
        PlayerInfo playerInfo = playerInfoParser.parse("425545");
        assertNotNull(playerInfo);
        assertNotNull(playerInfo.getBirthCountry());
        assertNotNull(playerInfo.getNamePrefix());
        assertNotNull(playerInfo.getDisplayNameFirstLast());
        assertNotNull(playerInfo.getCollege());
        assertNotNull(playerInfo.getHeightInches());
        assertNotNull(playerInfo.getDeathCountry());
        assertNotNull(playerInfo.getAge());
        assertNotNull(playerInfo.getDisplayNameFirstLastHTML());
        assertNotNull(playerInfo.getGender());
        assertNotNull(playerInfo.getHeightFeet());
        assertNotNull(playerInfo.getProDebutDate());
        assertNotNull(playerInfo.getDeathDate());
        assertNotNull(playerInfo.getPrimaryPosition());
        assertNotNull(playerInfo.getBirthDate());
        assertNotNull(playerInfo.getTeamNameAbbrev());
        assertNotNull(playerInfo.getStatus());
        assertNotNull(playerInfo.getDisplayNameLastFirstHTML());
        assertNotNull(playerInfo.getThrows());
        assertNotNull(playerInfo.getDeathCity());
        assertNotNull(playerInfo.getPrimaryPositionText());
        assertNotNull(playerInfo.getHighSchool());
        assertNotNull(playerInfo.getDisplayNameRosterHTML());
        assertNotNull(playerInfo.getUsedName());
        assertNotNull(playerInfo.getPlayerID());
        assertNotNull(playerInfo.getStatusDate());
        assertNotNull(playerInfo.getPrimaryStatType());
        assertNotNull(playerInfo.getTeamID());
        assertNotNull(playerInfo.getActiveSW());
        assertNotNull(playerInfo.getPrimarySportCode());
        assertNotNull(playerInfo.getBirthState());
        assertNotNull(playerInfo.getWeight());
        assertNotNull(playerInfo.getMiddleName());
        assertNotNull(playerInfo.getNameDisplayRoster());
        assertNotNull(playerInfo.getJerseyNumber());
        assertNotNull(playerInfo.getEndDate());
        assertNotNull(playerInfo.getDeathState());
        assertNotNull(playerInfo.getNameFirst());
        assertNotNull(playerInfo.getBats());
        assertNotNull(playerInfo.getTeamCode());
        assertNotNull(playerInfo.getBirthCity());
        assertNotNull(playerInfo.getNickName());
        assertNotNull(playerInfo.getStatusCode());
        assertNotNull(playerInfo.getMatrilinealName());
        assertNotNull(playerInfo.getTeamName());
        assertNotNull(playerInfo.getDisplayNameLastFirst());
        assertNotNull(playerInfo.getNameTitle());
        assertNotNull(playerInfo.getFileCode());
        assertNotNull(playerInfo.getLastName());
        assertNotNull(playerInfo.getStartDate());
        assertNotNull(playerInfo.getFullName());
    }
}
