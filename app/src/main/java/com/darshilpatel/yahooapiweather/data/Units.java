package com.darshilpatel.yahooapiweather.data;

import org.json.JSONObject;

/**
 * Created by  Darshil on 2/16/2016.
 */
public class Units implements JSONPopulator {
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");
    }
}