package com.example.bridgeit.demot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        TextView t1=new TextView(this);
        LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        t1.setText("textview 1\t");
        TextView t2=new TextView(this);
        t2.setText("textview2");

        LinearLayout l=new LinearLayout(this);
        l.addView(t1);

        l.addView(t2);
        setContentView(l);

    }
}
