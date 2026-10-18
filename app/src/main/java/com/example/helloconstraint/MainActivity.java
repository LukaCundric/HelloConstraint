package com.example.helloconstraint;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView show_count;
    private View button_zero;
    private View button_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show_count = findViewById(R.id.show_count);
        button_zero = findViewById(R.id.button_zero);
        button_count = findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        count++;

        if (show_count != null) {
            show_count.setText(String.valueOf(count));
        }

        // Change Count button color depending on whether count is even or odd
        if (count % 2 == 0) {
            view.setBackgroundColor(Color.parseColor("#00FF00"));
        } else {
            view.setBackgroundColor(Color.parseColor("#3F51B5"));
        }

        // Activate Zero button (change color from gray to active pink/magenta)
        if (button_zero != null) {
            button_zero.setBackgroundColor(Color.parseColor("#FF4081"));
        }
    }

    public void zero(View view) {
        count = 0;

        if (show_count != null) {
            show_count.setText("0");
        }

        // Reset Zero button color back to gray
        view.setBackgroundColor(Color.parseColor("#A0A0A0"));

        // Reset Count button color back to default primary blue
        if (button_count != null) {
            button_count.setBackgroundColor(Color.parseColor("#3F51B5"));
        }
    }
}