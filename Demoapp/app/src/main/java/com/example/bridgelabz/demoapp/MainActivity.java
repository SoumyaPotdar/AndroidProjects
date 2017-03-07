package com.example.bridgelabz.demoapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edittext1;
    EditText edittext2;
    Button buttonSum;
    Button buttondif;
    Button buttonmul;
    Button buttondiv;
    TextView textview;
    int temp=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addListenerOnButton();

    }
    public void addListenerOnButton(){
        edittext1=(EditText)findViewById(R.id.editText1);
        edittext2=(EditText)findViewById(R.id.editText2);
        buttonSum=(Button)findViewById(R.id.button);
        buttondif=(Button)findViewById(R.id.button2);
        buttonmul=(Button)findViewById(R.id.button3);
        buttondiv=(Button)findViewById(R.id.button4);

        textview=(TextView) findViewById(R.id.textview2);

        buttonSum.setOnClickListener(this);
        buttondif.setOnClickListener(this);
        buttonmul.setOnClickListener(this);
        buttondiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String value1=edittext1.getText().toString();
        String value2=edittext2.getText().toString();
        int a=Integer.parseInt(value1);
        int b=Integer.parseInt(value2);
        switch(view.getId())
        {
            case  R.id.button:

                temp=a+b;
                textview.setText(temp+"");
                break;
            case R.id.button2 :
                temp=a-b;
                textview.setText(temp+"");
                break;
            case R.id.button3:
                temp=a*b;
                textview.setText(temp+"");
                break;
            case R.id.button4:
                temp=a/b;
                textview.setText(temp+"");
                break;

            default:
                textview.setText("Invalid choice");
                break;





    }
    }
}
