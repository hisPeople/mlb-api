package com.mlb.api.parser;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * User: devon
 * Date: 5/4/13
 * Time: 3:19 PM
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
