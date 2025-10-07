package com.ridho.resepku;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class NasiGorengActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasi_goreng);

        findViewById(R.id.btn_back_to_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
