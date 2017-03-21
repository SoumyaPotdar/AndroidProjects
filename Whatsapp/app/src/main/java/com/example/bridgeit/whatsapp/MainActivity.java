package com.example.bridgeit.whatsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void callsb(View v)
    {
        Fragment_call cl=new Fragment_call();
        getFragmentManager().beginTransaction().replace(R.id.framecont,cl).commit();
    }

    public void chatsb(View v)
    {
        Fragment_chats ch=new Fragment_chats();
        getFragmentManager().beginTransaction().replace(R.id.framecont,ch).commit();

    }
    public void contactsb(View v)
    {
        Fragment_contacts ct=new Fragment_contacts();
        getFragmentManager().beginTransaction().replace(R.id.framecont,ct
    }
    }


