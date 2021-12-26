package com.cgpa.group3.Electrical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cgpa.group3.R;

public class EsAllSem extends AppCompatActivity {

        Button sem1button,sem2button,sem3button,sem4button,sem5button,sem6button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_es_all_sem);
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
        final String reg_no = getIntent().getStringExtra("reg_no");

        sem1button = findViewById(R.id.sem1);
        sem1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String reg = reg_no;
                Intent intent = new Intent(EsAllSem.this, Es1Add.class);
                intent.putExtra("reg_no", reg);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        sem2button = findViewById(R.id.sem2);
        sem2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String reg = reg_no;
                Intent intent = new Intent(EsAllSem.this, Es2Add.class);
                intent.putExtra("reg_no", reg);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        sem3button = findViewById(R.id.sem3);
        sem3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String reg = reg_no;
                Intent intent = new Intent(EsAllSem.this, Es3Add.class);
                intent.putExtra("reg_no", reg);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        sem4button = findViewById(R.id.sem4);
        sem4button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String reg = reg_no;
                Intent intent = new Intent(EsAllSem.this, Es4Add.class);
                intent.putExtra("reg_no", reg);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        sem5button = findViewById(R.id.sem5);
        sem5button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String reg = reg_no;
                Intent intent = new Intent(EsAllSem.this, Es5Add.class);
                intent.putExtra("reg_no", reg);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        sem6button = findViewById(R.id.sem6);
        sem6button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String reg = reg_no;
                Intent intent = new Intent(EsAllSem.this, Es6Add.class);
                intent.putExtra("reg_no", reg);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
}
