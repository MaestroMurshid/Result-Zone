package com.cgpa.group3.Main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cgpa.group3.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StudentLogin extends AppCompatActivity {

    private FirebaseDatabase mFirebaseDatabase;

    private static final String TAG = "RegisterActivity";

    private EditText mReg_no, mDOB;
    public Button LoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
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

            mReg_no = findViewById(R.id.editText2);
            mDOB = findViewById(R.id.editText4);
            LoginBtn = findViewById(R.id.button);

            mFirebaseDatabase = FirebaseDatabase.getInstance();


            LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
                Log.d(TAG, "Button Pressed");
                 }
             });
    }

    private void Login() {
        Log.d(TAG, "In login");
        final String reg_no = mReg_no.getText().toString();
        final String DOB = mDOB.getText().toString();
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Student").child(reg_no);
        DatabaseReference databaseReference1 = FirebaseDatabase.getInstance().getReference().child("Student").child(reg_no);




        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d(TAG, "snap=" + snapshot.getValue() );

                if(snapshot.getValue()== null){
                    Toast.makeText(getApplicationContext(), "Your Register Number isn't Correct",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                String dob = snapshot.child("dob").getValue().toString();
                String r = snapshot.child("reg_no").getValue().toString();
                String dep = snapshot.child("Department").getValue().toString();

                Log.d(TAG, "dob = "+ dob );
                Log.d(TAG, "r = "+ r );
                Log.d(TAG, "dep = "+ dep );

                if(r.equals(reg_no)){

                    if(dob.equals(DOB) ){
                        Log.d(TAG, "W W");

                            Intent intent=new Intent(StudentLogin.this,StudentDashboard.class);
                            intent.putExtra("reg_no", reg_no);
                            intent.putExtra("dep", dep);
                            startActivity(intent);
                            finish();

                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Your Date of Birth isn't Correct",
                                Toast.LENGTH_LONG).show();
                        Log.d(TAG, "W F");
                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }

}



