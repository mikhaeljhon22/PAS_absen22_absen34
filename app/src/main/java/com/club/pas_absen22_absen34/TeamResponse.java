package com.club.pas_absen22_absen34;

<<<<<<< HEAD

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TeamResponse {
    @SerializedName("event")
    private List<ItemModel> event;

    public List<ItemModel> getEventName() {
        return event;
    }
}
=======
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamResponse {
    @SerializedName("teams")
    private List<ItemModel> teams;

    public List<ItemModel> getTeams() {
        return teams;
    }
}
>>>>>>> origin/master
