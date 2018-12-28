package com.example.vicky.lec7dynamicfragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class FragmentA extends Fragment {

    String name;

    @SuppressLint("ValidFragment")
    public FragmentA(String name) {
        this.name = name;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_a,container,false);
        TextView tv=view.findViewById(R.id.tvFragmentA);
        tv.setText(" "+ name);
//        tv.setText("I was modified in Java");
        return view;
    }
}
