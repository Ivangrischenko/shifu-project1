package com.first.anew;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import pl.fanfatal.swipecontrollerdemo.R;

class PlayersDataAdapter extends RecyclerView.Adapter<PlayersDataAdapter.PlayerViewHolder> {
    public List<Player> players;

    public class PlayerViewHolder extends RecyclerView.ViewHolder {
        private TextView name;

        public PlayerViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);

        }
    }

    public PlayersDataAdapter(List<Player> players) {
        this.players = players;
    }

    @Override
    public PlayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_view, parent, false);

        return new PlayerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PlayerViewHolder holder, int position) {
        Player player = players.get(position);
        holder.name.setText(player.getName());

    }

    @Override
    public int getItemCount() {
        return players.size();
    }
}
