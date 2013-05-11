package com.mlb.api.stats.parameters;

/**
 * User: devon
 * Date: 5/7/13
 * Time: 10:05 AM
 */
public enum TabLevel {
    CHILD("child");

    private static final String QUERY_PARAM_STRING = "tab_level=";
    private String queryText;
    private TabLevel(String queryText){
        this.queryText = queryText;
    }

    public String getQueryText() {
        return QUERY_PARAM_STRING + queryText;
    }
}
