package com.cgpa.group3.Main;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cgpa.group3.Architecture.ArchSyllabus;
import com.cgpa.group3.Architecture.ArchitectureStudents;
import com.cgpa.group3.Architecture.CalculatorArchall;
import com.cgpa.group3.Automobile.AutoSyllabus;
import com.cgpa.group3.Automobile.AutomobileStudents;
import com.cgpa.group3.Automobile.CalculatorAutoall;
import com.cgpa.group3.Civil.CalculatorCivilall;
import com.cgpa.group3.Civil.CivilStudents;
import com.cgpa.group3.Civil.CivilSyllabus;
import com.cgpa.group3.Computer.CalculatorCTall;
import com.cgpa.group3.Computer.ComputerStudents;
import com.cgpa.group3.Computer.Syllabus;
import com.cgpa.group3.Electrical.CalculatorEEEall;
import com.cgpa.group3.Electrical.ESyllabus;
import com.cgpa.group3.Electrical.ElectricalStudents;
import com.cgpa.group3.Mechanical.CalculatorMall;
import com.cgpa.group3.Mechanical.MStudents;
import com.cgpa.group3.Mechanical.MSyllabus;
import com.cgpa.group3.R;
import com.cgpa.group3.StudentDetails;
import com.google.firebase.auth.FirebaseAuth;

public class TeacherDashboard extends AppCompatActivity {

    public Button LogoutBtn,SDbtn,Sbtn,Cbtn;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_dashboard);
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
        final String email = getIntent().getExtras().getString("email"  );
        LogoutBtn = findViewById(R.id.tBtn5);
        SDbtn = findViewById(R.id.tBtn2);
        Sbtn = findViewById(R.id.tBtn3);
        Cbtn = findViewById(R.id.tBtn4);

        mAuth = FirebaseAuth.getInstance();
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity( new Intent(TeacherDashboard.this, MainActivity.class));
                finish();
            }
        });

        SDbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.equals("computer@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, ComputerStudents.class));
                }
                if(email.equals("electrical@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, ElectricalStudents.class));
                }
                if(email.equals("automobile@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, AutomobileStudents.class));
                }
                if(email.equals("architecture@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, ArchitectureStudents.class));
                }
                if(email.equals("mechanical@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, MStudents.class));
                }
                if(email.equals("civil@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, CivilStudents.class));
                }


            }
        });

        Sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.equals("computer@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, Syllabus.class));
                }
                if(email.equals("electrical@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, ESyllabus.class));
                }
                if(email.equals("automobile@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, AutoSyllabus.class));
                }
                if(email.equals("architecture@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, ArchSyllabus.class));
                }
                if(email.equals("mechanical@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, MSyllabus.class));
                }
                if(email.equals("civil@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, CivilSyllabus.class));
                }

            }
        });

        Cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.equals("computer@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, CalculatorCTall.class));
                }
                if(email.equals("electrical@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, CalculatorEEEall.class));
                }
                if(email.equals("automobile@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, CalculatorAutoall.class));
                }
                if(email.equals("architecture@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, CalculatorArchall.class));
                }
                if(email.equals("mechanical@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, CalculatorMall.class));
                }
                if(email.equals("civil@gmail.com")){
                    startActivity( new Intent(TeacherDashboard.this, CalculatorCivilall.class));
                }

            }
        });
    }
    }
