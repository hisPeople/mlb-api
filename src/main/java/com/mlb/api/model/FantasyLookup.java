package com.mlb.api.model;

import java.util.Date;

/**
 * User: devon
 * Date: 5/3/13
 * Time: 8:37 PM
 */
public class FantasyLookup {
    private String story;
    private int rank;
    private boolean is_injury;
    private String display_ts;
    private int item_id;
    private String teaser;
    private boolean is_cold;
    private String spin;
    private boolean is_hot;
    private int player_id;
    private String display_ts_closer_fmt;

    public String getStory() {
        return story;
    }

    public int getRank() {
        return rank;
    }

    public boolean isInjured() {
        return is_injury;
    }

    public String getDisplayTimeString() {
        return display_ts;
    }

    public int getItemID() {
        return item_id;
    }

    public String getTeaser() {
        return teaser;
    }

    public boolean isCold() {
        return is_cold;
    }

    public String getSpin() {
        return spin;
    }

    public boolean isHot() {
        return is_hot;
    }

    public int getPlayerID() {
        return player_id;
    }

    public String getDisplayTimeCloserFormat() {
        return display_ts_closer_fmt;
    }
}
