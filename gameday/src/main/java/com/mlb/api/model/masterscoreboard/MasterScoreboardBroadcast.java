package com.mlb.api.model.masterscoreboard;

/**
 * User: devon
 * Date: 5/14/13
 * Time: 8:59 AM
 */
public class MasterScoreboardBroadcast {

    private Away away;
    private Home home;

    public Away getAway() {
        return away;
    }

    public Home getHome() {
        return home;
    }

    public static class Away {
        private String tv;
        private String radio;

        public String getTv() {
            return tv;
        }

        public String getRadio() {
            return radio;
        }
    }

    public static class Home {
        private String tv;
        private String radio;

        public String getTv() {
            return tv;
        }

        public String getRadio() {
            return radio;
        }
    }
}
