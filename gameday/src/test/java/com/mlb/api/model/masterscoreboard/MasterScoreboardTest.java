package com.mlb.api.model.masterscoreboard;

import com.mlb.api.parser.MasterScoreboardParser;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * User: devon
 * Date: 5/13/13
 * Time: 9:45 AM
 */
public class MasterScoreboardTest {

    @Test
    public void masterScoreboardParseTest() {
        String month = null;
        String day = null;
        for(int i = 4; i < 6; i++) {
            month = "0" + i;
            for(int j = 1; j < 31; j++) {
                if(j < 10) {
                    day = "0" + j;
                } else {
                    day = String.valueOf(j);
                }
                MasterScoreboardParser masterScoreboardParser = new MasterScoreboardParser();
                MasterScoreboard masterScoreboard = masterScoreboardParser.parse("http://gd2.mlb.com/components/game/mlb/year_2013/month_" + month + "/day_" + day + "/master_scoreboard.json");
                System.out.println(masterScoreboard.getSubject() + ":\t" + masterScoreboard.getGames().length + " games");
                assertNotNull(masterScoreboard);
            }
        }

    }
}
