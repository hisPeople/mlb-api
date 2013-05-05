package com.mlb.api.parser;

import com.mlb.api.model.FantasyLookup;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * User: devon
 * Date: 5/3/13
 * Time: 11:41 PM
 */
public class FantasyLookupParserTest {

    @Test
    public void fantasyLookupParseTest() {
        FantasyLookupParser fantasyLookupParser = new FantasyLookupParser();
        FantasyLookup fantasyLookup = fantasyLookupParser.parse("425545");
        assertNotNull(fantasyLookup);
        assertNotNull(fantasyLookup.isCold());
        assertNotNull(fantasyLookup.getDisplayTimeCloserFormat());
        assertNotNull(fantasyLookup.getDisplayTimeString());
        assertNotNull(fantasyLookup.getItemID());
        assertNotNull(fantasyLookup.getPlayerID());
        assertNotNull(fantasyLookup.getRank());
        assertNotNull(fantasyLookup.getSpin());
        assertNotNull(fantasyLookup.getStory());
        assertNotNull(fantasyLookup.getTeaser());
        assertNotNull(fantasyLookup.isHot());
        assertNotNull(fantasyLookup.isInjured());
    }
}
