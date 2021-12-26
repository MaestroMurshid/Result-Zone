package com.cgpa.group3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cgpa.group3.Architecture.sArchS1;
import com.cgpa.group3.Architecture.sArchS2;
import com.cgpa.group3.Architecture.sArchS3;
import com.cgpa.group3.Architecture.sArchS4;
import com.cgpa.group3.Architecture.sArchS5;
import com.cgpa.group3.Architecture.sArchS6;
import com.cgpa.group3.Automobile.sAutoS1;
import com.cgpa.group3.Automobile.sAutoS2;
import com.cgpa.group3.Automobile.sAutoS3;
import com.cgpa.group3.Automobile.sAutoS4;
import com.cgpa.group3.Automobile.sAutoS5;
import com.cgpa.group3.Automobile.sAutoS6;
import com.cgpa.group3.Civil.sCivilS1;
import com.cgpa.group3.Civil.sCivilS2;
import com.cgpa.group3.Civil.sCivilS3;
import com.cgpa.group3.Civil.sCivilS4;
import com.cgpa.group3.Civil.sCivilS5;
import com.cgpa.group3.Civil.sCivilS6;
import com.cgpa.group3.Computer.sCTS1;
import com.cgpa.group3.Computer.sCTS2;
import com.cgpa.group3.Computer.sCTS3;
import com.cgpa.group3.Computer.sCTS4;
import com.cgpa.group3.Computer.sCTS5;
import com.cgpa.group3.Computer.sCTS6;
import com.cgpa.group3.Electrical.sEEES1;
import com.cgpa.group3.Electrical.sEEES2;
import com.cgpa.group3.Electrical.sEEES3;
import com.cgpa.group3.Electrical.sEEES4;
import com.cgpa.group3.Electrical.sEEES5;
import com.cgpa.group3.Electrical.sEEES6;
import com.cgpa.group3.Mechanical.sMS1;
import com.cgpa.group3.Mechanical.sMS2;
import com.cgpa.group3.Mechanical.sMS3;
import com.cgpa.group3.Mechanical.sMS4;
import com.cgpa.group3.Mechanical.sMS5;
import com.cgpa.group3.Mechanical.sMS6;

public class StudentAllsem extends AppCompatActivity {

    Button sem1button,sem2button,sem3button,sem4button,sem5button,sem6button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_allsem);

        final String reg_no = getIntent().getStringExtra("reg_no");
        final String dep = getIntent().getStringExtra("dep");

        sem1button = findViewById(R.id.sem1);
        sem1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dep.equals("Computer")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCTS1.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Architecture")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sArchS1.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Electrical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sEEES1.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Automobile")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sAutoS1.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Mechanical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sMS1.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("civil")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCivilS1.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }

            }
        });

        sem2button = findViewById(R.id.sem2);
        sem2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dep.equals("Computer")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCTS2.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Architecture")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sArchS2.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Electrical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sEEES2.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Automobile")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sAutoS2.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("civil")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCivilS2.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Mechanical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sMS2.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }

            }
        });

        sem3button = findViewById(R.id.sem3);
        sem3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dep.equals("Computer")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCTS3.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Architecture")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sArchS3.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Electrical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sEEES3.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Automobile")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sAutoS3.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("civil")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCivilS3.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Mechanical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sMS3.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });
        sem4button = findViewById(R.id.sem4);
        sem4button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dep.equals("Computer")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCTS4.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Architecture")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sArchS4.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Electrical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sEEES4.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Automobile")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sAutoS4.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Mechanical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sMS4.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("civil")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCivilS4.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });
        sem5button = findViewById(R.id.sem5);
        sem5button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dep.equals("Computer")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCTS5.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Architecture")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sArchS5.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Electrical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sEEES5.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Automobile")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sAutoS5.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Mechanical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sMS5.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("civil")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCivilS5.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });
        sem6button = findViewById(R.id.sem6);
        sem6button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dep.equals("Computer")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCTS6.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Architecture")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sArchS6.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Electrical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sEEES6.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Automobile")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sAutoS6.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("Mechanical")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sMS6.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if(dep.equals("civil")){
                    String reg = reg_no;
                    Intent intent = new Intent(StudentAllsem.this, sCivilS6.class);
                    intent.putExtra("reg_no", reg);

                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });
    }
}
