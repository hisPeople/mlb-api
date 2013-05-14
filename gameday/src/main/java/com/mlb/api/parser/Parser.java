package com.mlb.api.parser;

import com.google.gson.Gson;

/**
 * User: devon
 * Date: 5/14/13
 * Time: 10:55 AM
 */
public class Parser<T> {

    private Gson gson;
    private Class<T> type;

    public Parser(Class<T> type ) {
        this.type = type;
        gson = new Gson();
    }

    public T parse(String json) {
        T obj;
        obj = (T) gson.fromJson(json, type);
        return obj;
    }
}