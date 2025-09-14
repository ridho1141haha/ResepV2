package com.ridho.resepku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class TeamActivity extends AppCompatActivity {

    // Simple inner class for team member data
    public static class TeamMember {
        final String name;
        final int avatarRes;

        TeamMember(String name, int avatarRes) {
            this.name = name;
            this.avatarRes = avatarRes;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Prepare data
        List<TeamMember> members = new ArrayList<>();
        members.add(new TeamMember("Ridho Alhasan", R.drawable.ridho));
        members.add(new TeamMember("Muhammad Farel", R.drawable.farel));
        members.add(new TeamMember("Alfian Dafari", R.drawable.alfian));
        members.add(new TeamMember("Adrian Farela", R.drawable.adrian));

        // Setup RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view_team);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        TeamAdapter adapter = new TeamAdapter(this, members);
        recyclerView.setAdapter(adapter);

        // Setup button
        MaterialButton btnLanjut = findViewById(R.id.btn_lanjut);
        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeamActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
