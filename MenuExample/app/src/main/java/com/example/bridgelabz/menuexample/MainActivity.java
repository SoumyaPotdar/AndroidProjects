package com.example.bridgelabz.menuexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
//import com.example.bridgelabz.T

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menuexa, menu);//Menu Resource, Menu
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.m_bookm:
                Toast.makeText(getApplicationContext(), "bookmark Selected", Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
                return true;
            case R.id.m_delete:
                Toast.makeText(getApplicationContext(), " deleted ", Toast.LENGTH_LONG).show();
                return true;
            case R.id.m_save:
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                return true;
            case R.id.m_share:
                Toast.makeText(getApplicationContext(), "Shared", Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);


        }
    }

}
