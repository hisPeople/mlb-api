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
    private boolean isInjured;
    private Date displayDate;
    private int itemID;
    private String teaser;
    private boolean isCold;
    private String spin;
    private boolean isHot;
    private int playerID;

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    public Date getDisplayDate() {
        return displayDate;
    }

    public void setDisplayDate(Date displayDate) {
        this.displayDate = displayDate;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getTeaser() {
        return teaser;
    }

    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }

    public String getSpin() {
        return spin;
    }

    public void setSpin(String spin) {
        this.spin = spin;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }
}
