package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link the image to java code
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        final int[] ballArray = new int[]{R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        // link ask button to java code
        Button myButton = findViewById(R.id.askButton);

        // install the listener to button

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenertator = new Random();
                int myNumber = randomNumberGenertator.nextInt(5);
                ballDisplay.setImageResource(ballArray[myNumber]);
            }
        });







    }
}
