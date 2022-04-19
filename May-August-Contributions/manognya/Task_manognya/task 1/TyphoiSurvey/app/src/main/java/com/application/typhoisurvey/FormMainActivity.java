package com.application.typhoisurvey;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FormMainActivity extends AppCompatActivity {

    public  String gender = "" ;
    public ArrayList<String> symp = new ArrayList<>();
    public ArrayList<String> test = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_main);


        EditText name = findViewById(R.id.name_edit);
        EditText mail = findViewById(R.id.mail_edit);
        EditText pname = findViewById(R.id.editTextTextPersonName2);
        EditText pid = findViewById(R.id.patientid_edit);
        EditText age = findViewById(R.id.age_edit);

        EditText fever =findViewById(R.id.fever_edit);
        Button b = findViewById(R.id.sub);
        RadioGroup r = findViewById(R.id.rg);

        EditText r1 = findViewById(R.id.feverrate1);
        EditText r2 = findViewById(R.id.headacherate);
        EditText r3 = findViewById(R.id.r3);
        EditText r4 = findViewById(R.id.r4);
        EditText r5 = findViewById(R.id.r5);
        EditText r6 = findViewById(R.id.r6);
        EditText r7 = findViewById(R.id.r7);

        Data dt=new Data();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String name,int age ,String pname, String pId, String mail,String gender,String fever, ArrayList<String> arr, ArrayList<String> test,
                //                           int r1, int r2,int r3, int r4, int r5,int r6,int r7
                Thyroidsymptoms ty=new Thyroidsymptoms(
                        name.getText().toString(), Integer.parseInt(age.getText().toString()),
                        pname.getText().toString(),pid.getText().toString(),
                        mail.getText().toString(),gender, fever.getText().toString(),
                        symp, test,  Integer.parseInt(r1.getText().toString()),
                        Integer.parseInt(r2.getText().toString()) , Integer.parseInt(r3.getText().toString() ),
                        Integer.parseInt(r4.getText().toString()), Integer.parseInt(r5.getText().toString()),
                        Integer.parseInt(r6.getText().toString()), Integer.parseInt(r7.getText().toString())
                        );
                
                dt.add(ty).addOnSuccessListener(suc->{

                    Toast.makeText(getApplicationContext(), "Record is inserted!! ", Toast.LENGTH_SHORT).show();

                }).addOnFailureListener(er->{
                    Toast.makeText(getApplicationContext(), ""+er.getMessage(), Toast.LENGTH_SHORT).show();
                });

            }
        });

    }


    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

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
    }


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
                    symp.add("High Fever");
                else
                    symp.remove("High Fever");
                break;
            case R.id.c3:
                if (checked)
                    symp.add("Arthalgia");
                else
                    symp.remove("Arthalgia");
                break;
            case  R.id.c4:
                if (checked)
                    symp.add("Pharyngitis");
                else
                    symp.remove("Pharyngitis");
                break;
            case  R.id.c5:
                if (checked)
                    symp.add("Constipation");
                else
                    symp.remove("Constipation");
                break;
            case  R.id.c6:
                if (checked)
                    symp.add("Anorexia");
                else
                    symp.add("Anorexia");
                break;
                case  R.id.c7:
                if (checked)
                    symp.add("Abdominal Pain");
                else
                    symp.add("Abdominal Pain");
                break;
            default:
                symp.add("None of the above");
        }
    }

    public void onTestCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkBox:
                if (checked)
                    test.add("Blood");
                else
                    test.remove("Blood");
                break;
            case R.id.checkBox2:
                if (checked)
                    test.add("Urine");
                else
                    test.remove("Urine");
                break;
            case R.id.checkBox3:
                if (checked)
                    test.add("Bone marrow");
                else
                    test.remove("Bone marrow");
                break;
            case  R.id.checkBox4:
                if (checked)
                    test.add("Stool");
                else
                    test.remove("Stool");
                break;
        }
    }
    
}
