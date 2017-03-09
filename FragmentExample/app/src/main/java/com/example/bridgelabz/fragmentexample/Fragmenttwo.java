package com.example.bridgelabz.fragmentexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.zip.Inflater;

public class Fragmenttwo extends Fragment {
     Button button4;

 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
     // Inflate the layout for this fragment
     View view = inflater.inflate(R.layout.fragment_fragmenttwo, container, false);
     button4 = (Button) view.findViewById(R.id.buttonf);

     button4.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Fragmentone fragmentone = new Fragmentone();
             getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentlay2,fragmentone,Fragmentone.TAG).commit();
         }
     });
     return view;
 }




    }


