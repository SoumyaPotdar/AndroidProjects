package com.example.bridgelabz.fragmentexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.bridgelabz.fragmentexample.R;


public class Fragmentone extends Fragment {
Button button;
    public static final String TAG = "Fragmentone";

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_fragmentone, container, false);
        }

    }

