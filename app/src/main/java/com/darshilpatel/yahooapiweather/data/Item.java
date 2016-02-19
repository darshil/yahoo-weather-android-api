package com.darshilpatel.yahooapiweather.data;

import org.json.JSONObject;

/**
 * Created by Darshil on 2/16/2016.
 */
public class Item implements JSONPopulator{
    private Condition condition;

    @Override
    public void populate(JSONObject data) {
        condition= new Condition();
        condition.populate(data.optJSONObject("condition"));

    }
}
