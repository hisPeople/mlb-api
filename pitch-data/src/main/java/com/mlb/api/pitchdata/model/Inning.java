package com.mlb.api.pitchdata.model;

import java.util.List;

/**
 * User: devon
 * Date: 5/18/13
 * Time: 11:26 AM
 */
public class Inning {
    String away_team;
    String home_team;
    String next;
    int num;
    List<AtBat> top;
    List<AtBat> bottom;
}
