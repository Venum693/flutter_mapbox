package com.example.flutter_mapbox;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class YourNewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_new);

        // Get the text to show from the intent
        String textToShow = getIntent().getStringExtra("textToShow");

        // Display the text in a TextView
        TextView textView = findViewById(R.id.textView);
        textView.setText(textToShow);
    }
}
