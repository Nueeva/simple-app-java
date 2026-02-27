package com.example.simplecounterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Restore counter state if activity was recreated (e.g., screen rotation)
        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter", 0);
        }

        counterTextView = findViewById(R.id.tv_counter);
        Button incrementButton = findViewById(R.id.btn_increment);
        Button decrementButton = findViewById(R.id.btn_decrement);
        Button resetButton = findViewById(R.id.btn_reset);

        // Update display with current counter value
        updateCounterDisplay();

        // Increment button
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                updateCounterDisplay();
            }
        });

        // Decrement button
        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                updateCounterDisplay();
            }
        });

        // Reset button
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                updateCounterDisplay();
            }
        });
    }

    private void updateCounterDisplay() {
        counterTextView.setText(String.valueOf(counter));

        // Change text color based on counter value
        if (counter > 0) {
            counterTextView.setTextColor(getResources().getColor(R.color.counter_positive, getTheme()));
        } else if (counter < 0) {
            counterTextView.setTextColor(getResources().getColor(R.color.counter_negative, getTheme()));
        } else {
            counterTextView.setTextColor(getResources().getColor(R.color.counter_zero, getTheme()));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save counter state when activity is paused/destroyed
        outState.putInt("counter", counter);
    }
}
