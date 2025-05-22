package com.club.pas_absen22_absen34;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TeamApi {
    @GET("api/v1/json/3/searchevents.php?e=Arsenal_vs_Chelsea&s=2016-2017")
    Call<TeamResponse> getEventSchedule();
}
