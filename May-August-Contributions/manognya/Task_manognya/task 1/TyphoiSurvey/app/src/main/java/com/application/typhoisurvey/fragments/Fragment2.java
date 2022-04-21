package com.application.typhoisurvey.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.application.typhoisurvey.Data;
import com.application.typhoisurvey.R;
import com.application.typhoisurvey.Thyroidsymptoms;

import java.util.ArrayList;

public class Fragment2 extends Fragment {

    public String fever = "";
    public  String street = "";
    public ArrayList<String> symp = new ArrayList<>();
    public Fragment2() {
        // Required empty public constructor
    }

    public static Fragment2 newInstance() {
        Fragment2 fragment = new Fragment2();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, container, false);
        EditText e1 =v.findViewById(R.id.fever_edit);
        EditText e2 =v.findViewById(R.id.street_edit);

        Button b = v.findViewById(R.id.sub);
/*
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data dt=new Data();
                //String name,int age ,String mail,String gender,String fever, String street
                Thyroidsymptoms ty = new Thyroidsymptoms(
                        Fragment1.newInstance().name, Fragment1.newInstance().age,
                        Fragment1.newInstance().mail, Fragment1.newInstance().gender,
                        fever, street, symp);
                dt.add(ty).addOnSuccessListener(suc->{

                    Toast.makeText(getContext(), "Record is inserted!! ", Toast.LENGTH_SHORT).show();

                }).addOnFailureListener(er->{
                    Toast.makeText(getContext(), ""+er.getMessage(), Toast.LENGTH_SHORT).show();
                });            }
        });*/

        return v;
    }

    /*
    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.c1:
                if (checked)
                    symp.add("Headache");
            else
                    symp.remove("Headache");
            break;
            case R.id.c2:
                if (checked)
                    symp.add("Cough");
                else
                    symp.remove("Cough");
                break;
            case  R.id.c3:
                if (checked)
                    symp.add("Fatigue");
                else
                    symp.remove("Fatigue");
                break;
            case  R.id.c4:
                if (checked)
                    symp.add("Aches and Pain");
                else
                    symp.remove("Aches and Pain");
                break;
            case  R.id.c5:
                if (checked)
                    symp.add("Constipation");
                else
                    symp.add("Constipation");
                break;
            default:
                symp.add("None of the above");
        }
    }*/
}