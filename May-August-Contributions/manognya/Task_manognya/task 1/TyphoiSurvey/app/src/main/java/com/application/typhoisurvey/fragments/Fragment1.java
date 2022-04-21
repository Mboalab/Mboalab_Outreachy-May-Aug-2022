package com.application.typhoisurvey.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.application.typhoisurvey.R;

public class Fragment1 extends Fragment {

    public  String name = "";
    public  String mail = "";
    public  String gender = "" ;
    public  int age;

    public Fragment1() {
        // Required empty public constructor
    }

    public static Fragment1 newInstance() {
        Fragment1 fragment = new Fragment1();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1, container, false);
        EditText e1 = v.findViewById(R.id.name_edit);
        EditText e2 = v.findViewById(R.id.age_edit);
        EditText e3 = v.findViewById(R.id.mail_edit);
        RadioGroup r1 = v.findViewById(R.id.rg);

        /*
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRadioButtonClicked(r1);
            }
        });*/

        this.name = (e1.getText()).toString();
        this.mail = (e3.getText()).toString();
        this.age = Integer.parseInt(e2.getText().toString());
        return v;
    }
/*
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.mail:
                if (checked)
                    this.gender = "male";
                    break;
            case R.id.female:
                if (checked)
                    this.gender = "female";
                    break;
            default:
                this.gender = "Prefer not to say";
        }
    }*/
}