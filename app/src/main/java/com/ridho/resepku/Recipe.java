package com.ridho.resepku;

public class Recipe {
    public final String id;              // contoh: "gudeg"
    public final String title;           // "Gudeg"
    public final int imageRes;           // R.drawable.gudeg
    public final java.util.List<String> ingredients;
    public final java.util.List<String> steps;

    public Recipe(String id, String title, int imageRes,
                  java.util.List<String> ingredients,
                  java.util.List<String> steps) {
        this.id = id;
        this.title = title;
        this.imageRes = imageRes;
        this.ingredients = ingredients;
        this.steps = steps;
    }
}
