package com.darshilpatel.yahooapiweather.service;

import com.darshilpatel.yahooapiweather.data.Channel;

/**
 * Created by Darshil on 2/16/2016.
 */
public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
