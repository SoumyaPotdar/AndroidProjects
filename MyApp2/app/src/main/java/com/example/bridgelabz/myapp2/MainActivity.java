package com.example.bridgelabz.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView textViewName;
    EditText editTextName;
    Button buttonSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewName=(TextView) findViewById(R.id.textView2);
        editTextName=(EditText) findViewById(R.id.editText1);
        buttonSave=(Button) findViewById(R.id.button1);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textViewName.setText(editTextName.getText());

                    }
                });
            }
        });
    }
}
