package com.ualr.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

// TODO 3: Define the alternative resources needed to have different content and look n feel depending on the device language.
// TODO 4: Get the description string value from resources
// TODO 5: Initialize the text property of the TextView element with the "country_description_text" id by using the value retrieved in the previous TODO point

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setting country image
        ImageView imageView = findViewById(R.id.country_image);
        imageView.setImageResource(R.drawable.ic_country);

        // getting and initializing description string
        String description = getResources().getString(R.string.description);
        TextView msgTextView = findViewById(R.id.country_description_text);
        msgTextView.setText(description);

        Button buttonA = (Button) findViewById(R.id.lesson_learnt_button);
        buttonA.setBackgroundResource(R.color.buttonColor);
    }

    public void changeColor(View view) {
        Button buttonA = (Button) findViewById(R.id.lesson_learnt_button);
        buttonA.setBackgroundResource(R.color.pressedButtonColor);
        TextView txtView=(TextView)findViewById(R.id.congrats_text);
        txtView.setText(getResources().getString(R.string.congrats_text));
    }
}
