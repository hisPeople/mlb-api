package com.mlb.api.stats.parameters;

/**
 * User: devon
 * Date: 5/7/13
 * Time: 10:13 AM
 */
public enum QueryParameters {
    CID("c_id"),
    TCID("tcid"),
    STAT_TYPE("statType"),
    ELEMENT("elem"),
    TAB_LEVEL("tab_level"),
    CLICK_TEXT("click_text"),
    // %23167%3BionType=sp     --- wtf is this?
    PAGE("page"),
    TS("ts"),
    SEASON("season"),
    SEASON_TYPE("season_type"),
    PLAYER_TYPE("playerType"),
    SPORT_CODE("sportCode"),
    LEAGUE_CODE("league_code"),
    SPLIT("split"),
    TEAM_ID("team_id"),
    ACTIVE_SW("active_sw"),
    GAME_TYPE("game_type"),
    POSITION("position"),
    PAGE_TYPE("page_type"),
    SORT_ORDER("sortOrder"),
    SORT_COLUMN("sortColumn"),
    RESULTS("results"),
    PER_PAGE("perPage"),
    TIMEFRAME("timeframe"),
    LAST_X_DAYS("last_x_days"),
    EXTENDED("extended"),
    SECTION_TYPE("sectionType");

    private String text;

    private QueryParameters(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
