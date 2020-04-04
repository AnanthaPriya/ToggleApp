package com.example.toggleapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.toggleapp.R.id.ShapeSelectorView_selector;

public class MainActivity extends AppCompatActivity {


    private ShapeSelectorView shapeSelectorView = findViewById (ShapeSelectorView_selector);

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMe = findViewById(R.id.button_click_me);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMessage();
            }
        });

    }

    private void ShowMessage() {
        Toast.makeText(this,shapeSelectorView.getSelectedShape(),Toast.LENGTH_LONG).show();
    }
}