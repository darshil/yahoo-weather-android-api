package com.darshilpatel.yahooapiweather.service;

import android.net.Uri;
import android.os.AsyncTask;

/**
 * Created by Darshil on 2/16/2016.
 */
public class YahooWeatherService{
    private WeatherServiceCallback callback;
    private String location;
    private Exception error;

    public YahooWeatherService(WeatherServiceCallback callback) {
        this.callback = callback;
    }

    public String getLocation(){
        return location;
    }
    public void refreshWeather(final String location){

        new AsyncTask<String, Void, String>() {
            @Override
            protected String doInBackground(String... params) {

            String YQL = String.format("select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"%s\")", location);
                String endpoint = String.format("https://query.yahooapis.com/v1/public/yql?q=%s&format=json", Uri.encode(YQL));


                return null;
            }

            @Override
            protected void onPostExecute(String s){
                super.onPostExecute(s);
            }
        }.execute(location);
    }
}
