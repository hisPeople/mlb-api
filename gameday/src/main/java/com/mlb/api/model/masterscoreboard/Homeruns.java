package com.mlb.api.model.masterscoreboard;

/**
 * User: devon
 * Date: 5/14/13
 * Time: 10:34 AM
 */
public class Homeruns {

    HomerunsPlayer[] player;

    public static class HomerunsPlayer {
        private String std_hr;
        private String hr;
        private String id;
        private String last;
        private String team_code;
        private String inning;
        private String runners;
        private String number;
        private String name_display_roster;
        private String first;

        public String getStd_hr() {
            return std_hr;
        }

        public String getHr() {
            return hr;
        }

        public String getId() {
            return id;
        }

        public String getLast() {
            return last;
        }

        public String getTeam_code() {
            return team_code;
        }

        public String getInning() {
            return inning;
        }

        public String getRunners() {
            return runners;
        }

        public String getNumber() {
            return number;
        }

        public String getName_display_roster() {
            return name_display_roster;
        }

        public String getFirst() {
            return first;
        }
    }
}
