package com.club.pas_absen22_absen34;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamResponse {
    @SerializedName("teams")
    private List<ItemModel> teams;

    public List<ItemModel> getTeams() {
        return teams;
    }
}
