package com.application.typhoisurvey;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Data {

    private DatabaseReference databaseReference;
   public Data(){
        FirebaseDatabase db=FirebaseDatabase.getInstance("https://typhoi-survey-default-rtdb.asia-southeast1.firebasedatabase.app/");
        databaseReference=db.getReference(Thyroidsymptoms.class.getSimpleName());

    }

    public Task<Void> add(Thyroidsymptoms ty){
        return databaseReference.push().setValue(ty);
    }
}
