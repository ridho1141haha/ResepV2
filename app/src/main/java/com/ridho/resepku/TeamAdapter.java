package com.ridho.resepku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    private final List<TeamActivity.TeamMember> memberList;
    private final Context context;

    public TeamAdapter(Context context, List<TeamActivity.TeamMember> memberList) {
        this.context = context;
        this.memberList = memberList;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        TeamActivity.TeamMember member = memberList.get(position);
        holder.name.setText(member.name);
        holder.avatar.setImageResource(member.avatarRes);
        holder.avatar.setContentDescription("Avatar " + member.name);
    }

    @Override
    public int getItemCount() {
        return memberList.size();
    }

    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        ImageView avatar;
        TextView name;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.team_member_avatar);
            name = itemView.findViewById(R.id.team_member_name);
        }
    }
}
