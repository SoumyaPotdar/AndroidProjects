package com.example.bridgelabz.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TextView textview1;
    TimePicker timepicker1;
    Button changetime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview1=(TextView)findViewById(R.id.textView1main);
        timepicker1=(TimePicker)findViewById(R.id.timePickermain);

        timepicker1.setIs24HourView(true);
        changetime=(Button)findViewById(R.id.changetimemain);

        textview1.setText(getCurrentTime());
        changetime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textview1.setText(getCurrentTime());
            }
        });

    }

    public String getCurrentTime(){
        String currentTime="current Time: "+timepicker1.getHour()+":"+timepicker1.getMinute();
        return currentTime;
    }


}


