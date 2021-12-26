package com.cgpa.group3.Electrical;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.cgpa.group3.Main.TeacherDashboard;
import com.cgpa.group3.R;
import com.cgpa.group3.Students;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EaddStudent extends AppCompatActivity {
    EditText et1,et2,et3;
    DatabaseReference database,database1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_add_student);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        et1 = findViewById(R.id.regET);
        et2 = findViewById(R.id.nameET);
        et3 = findViewById(R.id.dobET);

        database = FirebaseDatabase.getInstance().getReference().child("Student");
        database1 = FirebaseDatabase.getInstance().getReference().child("Student").child("Electrical");
    }

    public void submit(View view){
        final String Regi_no, name, dob;
        Regi_no = et1.getText().toString();
        name = et2.getText().toString();
        dob = et3.getText().toString();

        Students students = new Students();
        students.setReg_no(Regi_no);
        students.setName(name);
        students.setDob(dob);

        database1.child(students.getReg_no()).setValue(students).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){

                }
                else{

                }
            }
        });
        database.child(students.getReg_no()).setValue(students).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    database.child(Regi_no).child("Department").setValue("Electrical");
                    Toast.makeText(EaddStudent.this, "Student Registered Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), ElectricalStudents.class));
                }
                else{
                    Toast.makeText(EaddStudent.this, "Registration Unsuccessful", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
