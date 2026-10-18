package com.example.helloconstraint;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    TextView show_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show_count = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast",
                Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {

        // Povečamo števec
        count++;

        // Prikažemo število
        show_count.setText(String.valueOf(count));

        // Spremenimo barvo gumba Count
        if (count % 2 == 0) {
            view.setBackgroundColor(Color.GREEN);
        } else {
            view.setBackgroundColor(Color.RED);
        }

        // Gumb Zero označimo kot aktiven
        View button_zero = findViewById(R.id.button_zero);
        button_zero.setBackgroundColor(Color.YELLOW);
    }

    public void zero(View view) {

        // Ponastavimo števec
        count = 0;
        show_count.setText("0");

        // Gumb Zero vrnemo na sivo barvo
        view.setBackgroundColor(Color.LTGRAY);
    }
}
