package com.cgpa.group3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.cgpa.group3.Computer.ComputerStudents;
import com.cgpa.group3.Main.TeacherDashboard;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addStudent extends AppCompatActivity {
    EditText et1,et2,et3;
    DatabaseReference database,database1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        et1 = findViewById(R.id.regET);
        et2 = findViewById(R.id.nameET);
        et3 = findViewById(R.id.dobET);

        database = FirebaseDatabase.getInstance().getReference().child("Student");
        database1 = FirebaseDatabase.getInstance().getReference().child("Student").child("Computer");
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
                        database.child(Regi_no).child("Department").setValue("Computer");
                        Toast.makeText(addStudent.this, "Student Registered Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), ComputerStudents.class));
                    }
                    else{
                        Toast.makeText(addStudent.this, "Registration Unsuccessful", Toast.LENGTH_SHORT).show();
                    }
            }
        });

    }
}
