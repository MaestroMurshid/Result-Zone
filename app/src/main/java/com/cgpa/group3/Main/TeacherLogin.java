package com.cgpa.group3.Main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cgpa.group3.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class TeacherLogin extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText emailet,passwordet;
    public Button LoginBtn;



    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);
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

        mAuth = FirebaseAuth.getInstance();

        emailet= findViewById(R.id.editText2);
        passwordet= findViewById(R.id.editText4);
        LoginBtn = findViewById(R.id.button);
        progressDialog = new ProgressDialog(this);
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
    }

    private void Login(){
        final String email = emailet.getText().toString();
        String password=passwordet.getText().toString();
        if(TextUtils.isEmpty(email)){
            emailet.setError("Enter your email");
            return;
        }
        else if(TextUtils.isEmpty(password)){
            passwordet.setError("Enter your password");
            return;
        }
        progressDialog.setMessage("Please wait...");
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(TeacherLogin.this,"Login Successful",Toast.LENGTH_LONG).show();

                        if(emailet.getText().toString().equals("computer@gmail.com")){

                            Intent intent=new Intent(TeacherLogin.this,TeacherDashboard.class);
                            intent.putExtra("email",email);
                            startActivity(intent);
                            finish();
                        }

                    if(emailet.getText().toString().equals("electrical@gmail.com")){
                        Intent intent=new Intent(TeacherLogin.this,TeacherDashboard.class);
                        intent.putExtra("email",email);
                        startActivity(intent);
                        finish();
                    }
                    if(emailet.getText().toString().equals("architecture@gmail.com")){
                        Intent intent=new Intent(TeacherLogin.this,TeacherDashboard.class);
                        intent.putExtra("email",email);
                        startActivity(intent);
                        finish();
                    }
                    if(emailet.getText().toString().equals("mechanical@gmail.com")){
                        Intent intent=new Intent(TeacherLogin.this,TeacherDashboard.class);
                        intent.putExtra("email",email);
                        startActivity(intent);
                        finish();
                    }
                    if(emailet.getText().toString().equals("civil@gmail.com")){
                        Intent intent=new Intent(TeacherLogin.this,TeacherDashboard.class);
                        intent.putExtra("email",email);
                        startActivity(intent);
                        finish();
                    }
                    if(emailet.getText().toString().equals("automobile@gmail.com")){
                        Intent intent=new Intent(TeacherLogin.this,TeacherDashboard.class);
                        intent.putExtra("email",email);
                        startActivity(intent);
                        finish();
                    }
                }
                else{
                    Toast.makeText(TeacherLogin.this,"Sign In fail!",Toast.LENGTH_LONG).show();
                }
                progressDialog.dismiss();
            }
        });
    }

}
