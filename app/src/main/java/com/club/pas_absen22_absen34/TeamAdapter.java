package com.club.pas_absen22_absen34;

<<<<<<< HEAD

=======
>>>>>>> origin/master
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
<<<<<<< HEAD
    private List<ItemModel> eventList;

    public TeamAdapter(List<ItemModel> eventList) {
        this.eventList = eventList;
=======
    private List<ItemModel> teamList;

    public TeamAdapter(List<ItemModel> teamList) {
        this.teamList = teamList;
>>>>>>> origin/master
    }

    @NonNull
    @Override
    public TeamAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamAdapter.ViewHolder holder, int position) {
<<<<<<< HEAD
        ItemModel team = eventList.get(position);
        holder.eventName.setText(team.getEventName());
        holder.dateEvent.setText(team.getDate());
        holder.time.setText(team.getTime());

=======
        ItemModel team = teamList.get(position);
        holder.tvTeamName.setText(team.getTeamName());
        holder.tvTeamStadium.setText(team.getStadiumName());

        Glide.with(holder.itemView.getContext())
                .load(team.getLogo())
                .into(holder.ivTeamLogo);
>>>>>>> origin/master
    }

    @Override
    public int getItemCount() {
<<<<<<< HEAD
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
=======
        return teamList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTeamName;
        TextView tvTeamStadium;
        ImageView ivTeamLogo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTeamName = itemView.findViewById(R.id.tvTeamName);
            tvTeamStadium = itemView.findViewById(R.id.tvTeamStadium);
            ivTeamLogo = itemView.findViewById(R.id.ivTeamLogo);
        }
    }
}

>>>>>>> origin/master
