package com.darshilpatel.yahooapiweather.data;

import org.json.JSONObject;

/**
 * Created by Darshil  on 2/16/2016.
 */
public class Condition implements JSONPopulator{
    private int code;
    private int temprature;
    private String description;

    public int getCode() {
        return code;
    }

    public int getTemprature() {
        return temprature;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void populate(JSONObject data) {
        code = data.optInt("code");
        temprature = data.optInt("temp");
        description = data.optString("text");
    }
}
