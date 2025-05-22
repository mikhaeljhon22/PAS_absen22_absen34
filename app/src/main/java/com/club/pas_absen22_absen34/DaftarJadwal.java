package com.club.pas_absen22_absen34;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DaftarJadwal extends Fragment {
    RecyclerView rvEvent;
    TeamAdapter teamAdapter;

    ProgressBar pbLoading;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daftartim, container, false);
        pbLoading = view.findViewById(R.id.pbLoading);
        rvEvent = view.findViewById(R.id.rvEventName);
        rvEvent.setLayoutManager(new LinearLayoutManager(getContext()));

        fetchEvent();
        return view;
    }

    private void fetchEvent(){
        TeamApi api =RetrofitClient.getInstance().create(TeamApi.class);
        api.getEventSchedule().enqueue(new Callback<TeamResponse>() {
            @Override
            public void onResponse(Call<TeamResponse> call, Response<TeamResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<ItemModel> event = response.body().getEventName();
                    teamAdapter = new TeamAdapter(event);
                    rvEvent.setAdapter(teamAdapter);
                    rvEvent.setVisibility(View.VISIBLE);
                    pbLoading.setVisibility(View.GONE);

                }
            }

            @Override
            public void onFailure(Call<TeamResponse> call, Throwable t) {

            }
        });
    }
}