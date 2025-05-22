package com.club.pas_absen22_absen34;


import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TeamResponse {
    @SerializedName("event")
    private List<ItemModel> event;

    public List<ItemModel> getEventName() {
        return event;
    }
}