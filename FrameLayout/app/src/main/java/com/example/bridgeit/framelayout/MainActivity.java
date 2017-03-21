package com.example.bridgeit.framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wb = (WebView) findViewById(R.id.web);
    }

        public void  op(View v)
        {
            wb.loadUrl("http://google.com");
        }



}
