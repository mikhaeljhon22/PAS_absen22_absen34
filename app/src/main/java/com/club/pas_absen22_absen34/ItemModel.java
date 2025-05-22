package com.club.pas_absen22_absen34;

import com.google.gson.annotations.SerializedName;

public class ItemModel {


    @SerializedName("strEvent")
    private String event;

    @SerializedName("dateEvent")
    private String dateEvent;

    @SerializedName("strTime")
    private String time;


    public String getEventName(){return dateEvent;}
    public String getDate(){return dateEvent;}
    public String getTime(){return time;}

}
