package com.example.clock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b_alarm,b_stopwatch,b_timer;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_alarm= findViewById(R.id.b_alarm);
        b_stopwatch= findViewById(R.id.b_stopwatch);
        b_timer= findViewById(R.id.b_timer);
        textView=findViewById(R.id.textview);

        b_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,alarmactivity.class);
                startActivity(intent);

            }
        });
        b_stopwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,stopwatchactivity.class);
                startActivity(intent1);
            }
        });
        b_timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,timeractivity.class);
                startActivity(intent2);
            }
        });

        
    }
}
