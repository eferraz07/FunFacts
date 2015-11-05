package insight.com.br.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Evandro on 15/10/2015.
 */

public class Colors {

    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // light red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7", // light gray
            "#000000", // black
            "#FFD700", // goldyellow
            "#B8860B", // goldblack
            "#FF0000", // red
            "#006400", // dark green
            "#9400D3", // dark violet
            "#191970", // midnightblue

    };

    public int getColor() {

        //The button was clicked, so update the fact with a new fact
        String color = "";

        //Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new random generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
