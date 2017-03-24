package com.example.bridgelabz.validation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private TextView textView;
    private  EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private Button button1;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView2);
        editText1 = (EditText) findViewById(R.id.editText4);
        editText2 = (EditText) findViewById(R.id.editText5);
        editText3 = (EditText) findViewById(R.id.editText8);
        editText4 = (EditText) findViewById(R.id.editText9);
        button1 = (Button) findViewById(R.id.button2);
        button2 = (Button) findViewById(R.id.button);

//to save content
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MyFirstIntrent.class);
                intent.putExtra("name",editText1.getText().toString());
                intent.putExtra("email",editText2.getText().toString());
                intent.putExtra("phno",editText3.getText().toString());
                intent.putExtra("address",editText4.getText().toString());

                startActivity(intent);
            }

        });

        //to clear content

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                StringBuilder result = new StringBuilder();
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");


            }

        });

    }
    }

