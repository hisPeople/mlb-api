package com.mlb.api.stats.parameters;

/**
 * User: devon
 * Date: 5/7/13
 * Time: 10:08 AM
 */
public enum StatType {
    HITTING("hitting"),
    PITCHING("pitching"),
    FIELDING("fielding");

    private static final String STAT_TYPE_STRING = "statType=";
    private String statType;

    private StatType(String statType) {
        this.statType = statType;
    }

    public String getQueryText() {
        return STAT_TYPE_STRING + statType;
    }
}
