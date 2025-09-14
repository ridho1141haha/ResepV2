package com.ridho.resepku;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsing_toolbar);
        ImageView detailImage = findViewById(R.id.detail_image);
        TextView detailIngredients = findViewById(R.id.detail_ingredients);
        TextView detailSteps = findViewById(R.id.detail_steps);
        MaterialButton btnKembali = findViewById(R.id.btn_kembali_detail);

        String recipeId = getIntent().getStringExtra("EXTRA_ID");
        Recipe recipe = RecipeRepository.byId(recipeId);

        if (recipe != null) {
            collapsingToolbar.setTitle(recipe.title);
            detailImage.setImageResource(recipe.imageRes);
            detailImage.setContentDescription("Foto " + recipe.title);
            detailIngredients.setText(TextUtils.bullets(recipe.ingredients));
            detailSteps.setText(TextUtils.numbered(recipe.steps));
        }

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToMenu();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            navigateToMenu();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        // Override hardware back press to always go to MenuActivity
        navigateToMenu();
    }

    private void navigateToMenu() {
        Intent intent = new Intent(DetailActivity.this, MenuActivity.class);
        // Clears the activity stack so that pressing back from MenuActivity will exit the app.
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }
}