package com.mlb.api.model.masterscoreboard;

/**
 * User: devon
 * Date: 5/14/13
 * Time: 9:57 AM
 */
public class MasterScoreboardLinescore {

    Homeruns hr;
    Errors e;
    Strikeouts so;
    Runs r;
    StolenBases sb;
    Inning[] inning;
    Hits h;

    public Homeruns getHr() {
        return hr;
    }

    public Errors getE() {
        return e;
    }

    public Strikeouts getSo() {
        return so;
    }

    public Runs getR() {
        return r;
    }

    public StolenBases getSb() {
        return sb;
    }

    public Inning[] getInning() {
        return inning;
    }

    public Hits getH() {
        return h;
    }

    public static class Homeruns {
        String home;
        String away;

        public String getHome() {
            return home;
        }

        public String getAway() {
            return away;
        }
    }

    public static class Errors {
        String home;
        String away;

        public String getHome() {
            return home;
        }

        public String getAway() {
            return away;
        }
    }

    public static class Strikeouts {
        String home;
        String away;

        public String getHome() {
            return home;
        }

        public String getAway() {
            return away;
        }
    }

    public static class Runs {
        String home;
        String away;
        String diff;

        public String getHome() {
            return home;
        }

        public String getAway() {
            return away;
        }

        public String getDiff() {
            return diff;
        }
    }

    public static class StolenBases {
        String home;
        String away;

        public String getHome() {
            return home;
        }

        public String getAway() {
            return away;
        }
    }

    public static class Hits {
        String home;
        String away;

        public String getHome() {
            return home;
        }

        public String getAway() {
            return away;
        }
    }

    public static class Inning {
        String home;
        String away;

        public String getHome() {
            return home;
        }

        public String getAway() {
            return away;
        }
    }

}
