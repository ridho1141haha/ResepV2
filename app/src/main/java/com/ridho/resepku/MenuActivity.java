package com.ridho.resepku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

import java.util.List;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.img_gudeg).setOnClickListener(this);
        findViewById(R.id.img_bakso).setOnClickListener(this);
        findViewById(R.id.img_telur_balado).setOnClickListener(this);
        findViewById(R.id.img_klepon).setOnClickListener(this);
        findViewById(R.id.img_sate_babi).setOnClickListener(this);
        findViewById(R.id.img_mie_ayam).setOnClickListener(this);
        findViewById(R.id.img_rendang).setOnClickListener(this);
        findViewById(R.id.img_nasi_goreng).setOnClickListener(this);
        findViewById(R.id.btn_back_to_team).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        int id = v.getId();
        if (id == R.id.img_gudeg) {
            intent = new Intent(this, GudegActivity.class);
        } else if (id == R.id.img_bakso) {
            intent = new Intent(this, BaksoActivity.class);
        } else if (id == R.id.img_telur_balado) {
            intent = new Intent(this, TelurBaladoActivity.class);
        } else if (id == R.id.img_klepon) {
            intent = new Intent(this, KleponActivity.class);
        } else if (id == R.id.img_sate_babi) {
            intent = new Intent(this, SateBabiActivity.class);
        } else if (id == R.id.img_mie_ayam) {
            intent = new Intent(this, MieAyamActivity.class);
        } else if (id == R.id.img_rendang) {
            intent = new Intent(this, RendangActivity.class);
        } else if (id == R.id.img_nasi_goreng) {
            intent = new Intent(this, NasiGorengActivity.class);
        } else if (id == R.id.btn_back_to_team) {
            finish();
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}