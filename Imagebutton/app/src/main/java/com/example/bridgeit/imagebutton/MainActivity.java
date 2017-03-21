package com.example.bridgeit.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void button(View v)
    {
        Toast.makeText(getApplicationContext(),"Gooooood afternoooon\n Android.......",Toast.LENGTH_SHORT).show();

    }
}
