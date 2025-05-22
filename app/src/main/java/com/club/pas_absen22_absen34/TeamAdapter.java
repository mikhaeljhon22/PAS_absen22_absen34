package com.club.pas_absen22_absen34;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {
    private List<ItemModel> eventList;

    public TeamAdapter(List<ItemModel> eventList) {
        this.eventList = eventList;
    }

    @NonNull
    @Override
    public TeamAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamAdapter.ViewHolder holder, int position) {
        ItemModel team = eventList.get(position);
        holder.eventName.setText(team.getEventName());
        holder.dateEvent.setText(team.getDate());
        holder.time.setText(team.getTime());

    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView eventName;
        TextView dateEvent;
        TextView time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            eventName = itemView.findViewById(R.id.eventName);
            dateEvent = itemView.findViewById(R.id.dateEvent);
            time = itemView.findViewById(R.id.Time);
        }
    }
}
