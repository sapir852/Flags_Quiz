package com.sapir.flags_quiz;

import com.sapir.flags_quiz.R;

import java.util.ArrayList;

public class Level {
    private String levels = "";
    private int image;

    public Level() {
    }

    public String getLevels() {
        return levels;
    }

    public Level setLevels(String levels) {
        this.levels = levels;
        return this; // Return the Level object to allow chaining
    }

    public int getImage() {
        return image;
    }

    public Level setImage(int image) {
        this.image = image;
        return this; // Return the Level object to allow chaining
    }


}
