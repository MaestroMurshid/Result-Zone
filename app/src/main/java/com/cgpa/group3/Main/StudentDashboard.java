package com.cgpa.group3.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cgpa.group3.Architecture.ArchSyllabus;
import com.cgpa.group3.Architecture.CalculatorArchall;
import com.cgpa.group3.Architecture.archStudentViewDetails;
import com.cgpa.group3.Automobile.AutoSyllabus;
import com.cgpa.group3.Automobile.CalculatorAutoall;
import com.cgpa.group3.Automobile.autoStudentViewDetails;
import com.cgpa.group3.Civil.CalculatorCivilall;
import com.cgpa.group3.Civil.CivilStudentViewDetails;
import com.cgpa.group3.Civil.CivilSyllabus;
import com.cgpa.group3.Computer.CalculatorCTall;
import com.cgpa.group3.Computer.Syllabus;
import com.cgpa.group3.Electrical.CalculatorEEEall;
import com.cgpa.group3.Electrical.EStudentViewDetails;
import com.cgpa.group3.Electrical.ESyllabus;
import com.cgpa.group3.Mechanical.CalculatorMall;
import com.cgpa.group3.Mechanical.MStudentViewDetails;
import com.cgpa.group3.Mechanical.MSyllabus;
import com.cgpa.group3.R;
import com.cgpa.group3.StudentViewDetails;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StudentDashboard extends AppCompatActivity {



    private Button buttonView,Cbtn,Sbtn,LogBtn;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("Student");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);
        final String reg_no = getIntent().getStringExtra("reg_no");
        final String dep = getIntent().getStringExtra("dep");


        buttonView = findViewById(R.id.sBtn);
        Cbtn = findViewById(R.id.sBtn4);
        Sbtn = findViewById(R.id.sBtn3);
        LogBtn = findViewById(R.id.sBtn2);

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dep.equals("Computer")){
                    String reg = reg_no;
                    String dep1 = dep;
                    Intent intent = new Intent(StudentDashboard.this, StudentViewDetails.class);
                    intent.putExtra("reg_no", reg_no);
                    intent.putExtra("dep", dep);
                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Electrical")){
                    String reg = reg_no;
                    String dep1 = dep;
                    Intent intent = new Intent(StudentDashboard.this, EStudentViewDetails.class);
                    intent.putExtra("reg_no", reg_no);
                    intent.putExtra("dep", dep);
                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Architecture")){
                    String reg = reg_no;
                    String dep1 = dep;
                    Intent intent = new Intent(StudentDashboard.this, archStudentViewDetails.class);
                    intent.putExtra("reg_no", reg_no);
                    intent.putExtra("dep", dep);
                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Automobile")){
                    String reg = reg_no;
                    String dep1 = dep;
                    Intent intent = new Intent(StudentDashboard.this, autoStudentViewDetails.class);
                    intent.putExtra("reg_no", reg_no);
                    intent.putExtra("dep", dep);
                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Mechanical")){
                    String reg = reg_no;
                    String dep1 = dep;
                    Intent intent = new Intent(StudentDashboard.this, MStudentViewDetails.class);
                    intent.putExtra("reg_no", reg_no);
                    intent.putExtra("dep", dep);
                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }if(dep.equals("civil")){
                    String reg = reg_no;
                    String dep1 = dep;
                    Intent intent = new Intent(StudentDashboard.this, CivilStudentViewDetails.class);
                    intent.putExtra("reg_no", reg_no);
                    intent.putExtra("dep", dep);
                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });
        Cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dep.equals("Computer")) {
                    startActivity(new Intent(StudentDashboard.this, CalculatorCTall.class));
                }
                if (dep.equals("Electrical")) {
                    startActivity(new Intent(StudentDashboard.this, CalculatorEEEall.class));
                }
                if (dep.equals("Automobile")) {
                    startActivity(new Intent(StudentDashboard.this, CalculatorAutoall.class));
                }
                if (dep.equals("Architecture")) {
                    startActivity(new Intent(StudentDashboard.this, CalculatorArchall.class));
                }
                if (dep.equals("Mechanical")) {
                    startActivity(new Intent(StudentDashboard.this, CalculatorMall.class));
                }
                if (dep.equals("civil")) {
                    startActivity(new Intent(StudentDashboard.this, CalculatorCivilall.class));
                }
            }
        });

        Sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dep.equals("Computer")) {
                    startActivity(new Intent(StudentDashboard.this, Syllabus.class));
                }
                if (dep.equals("Electrical")) {
                    startActivity(new Intent(StudentDashboard.this, ESyllabus.class));
                }
                if (dep.equals("Automobile")) {
                    startActivity(new Intent(StudentDashboard.this, AutoSyllabus.class));
                }
                if (dep.equals("Architecture")) {
                    startActivity(new Intent(StudentDashboard.this, ArchSyllabus.class));
                }
                if (dep.equals("Mechanical")) {
                    startActivity(new Intent(StudentDashboard.this, MSyllabus.class));
                }
                if (dep.equals("civil")) {
                    startActivity(new Intent(StudentDashboard.this, CivilSyllabus.class));
                }
            }

        });
        LogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentDashboard.this, MainActivity.class));
            }
        });

    }






}
