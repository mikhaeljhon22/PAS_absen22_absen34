package com.club.pas_absen22_absen34;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TeamApi {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    Call<TeamResponse> getEnglishPremierLeague(@Query("l") String league);
}
