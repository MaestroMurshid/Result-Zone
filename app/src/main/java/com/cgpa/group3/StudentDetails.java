package com.cgpa.group3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cgpa.group3.Computer.ComputerStudents;

public class StudentDetails extends AppCompatActivity {

        public Button CTbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        CTbtn = findViewById(R.id.button6);
        CTbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(StudentDetails.this, ComputerStudents.class));

            }
        });

    }
}
