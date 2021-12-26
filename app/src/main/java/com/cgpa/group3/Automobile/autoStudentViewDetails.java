package com.cgpa.group3.Automobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cgpa.group3.R;
import com.cgpa.group3.StudentAllsem;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.concurrent.TimeUnit;

public class autoStudentViewDetails extends AppCompatActivity {

    private EditText regTV,nameTV,dobTV;
    private TextView cgpaTV,sgpa1tv,sgpa2tv,sgpa3tv,sgpa4tv,sgpa5tv,sgpa6tv;
    private Button addResultbtn;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference();

    private static final String TAG = "ViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_student_view_details);

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
        final String dep = getIntent().getStringExtra("dep");
        Log.d(TAG, "reg" + reg_no);


        regTV = findViewById(R.id.regnotv);
        nameTV = findViewById(R.id.nametv);
        dobTV = findViewById(R.id.dobtv);
        cgpaTV = findViewById(R.id.CGPAtv);
        sgpa1tv = findViewById(R.id.SGPA1tv);
        sgpa2tv = findViewById(R.id.SGPA2tv);
        sgpa3tv = findViewById(R.id.SGPA3tv);
        sgpa4tv = findViewById(R.id.SGPA4tv);
        sgpa5tv = findViewById(R.id.SGPA5tv);
        sgpa6tv = findViewById(R.id.SGPAtv6);



        addResultbtn = findViewById(R.id.button11);

        root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                String dob = snapshot.child("Student").child(reg_no).child("dob").getValue().toString();
                String name = snapshot.child("Student").child(reg_no).child("name").getValue().toString();

                nameTV.setText(name);
                dobTV.setText(dob);


                Log.d(TAG, "Inside");
                if(snapshot.child("Result").child("Automobile").child(reg_no).child("S1").child("ttlsscore").getValue() !=null
                        && snapshot.child("Result").child("Automobile").child(reg_no).child("S1").child("SGPA").getValue() != null) {

                    Log.d(TAG, "S1");

                    String sem1ttlscore = snapshot.child("Result").child("Automobile").child(reg_no).child("S1").child("ttlsscore").getValue().toString();
                    int sem1ttlint = Integer.parseInt(sem1ttlscore);

                    String sem1ttlcredit = snapshot.child("Result").child("Automobile").child("CreditS1").child("ttl").getValue().toString();
                    int s1creditint = Integer.parseInt(sem1ttlcredit);

                    String sgpa1 = snapshot.child("Result").child("Automobile").child(reg_no).child("S1").child("SGPA").getValue().toString();
                    sgpa1tv.setText(sgpa1);
                    float userttl = sem1ttlint;
                    float creditttl = s1creditint;
                    float CGPA = userttl / creditttl;

                    cgpaTV.setText(String.format("%.2f",CGPA));

                    if (snapshot.child("Result").child("Automobile").child(reg_no).child("S2").child("ttlsscore").getValue() != null
                            && snapshot.child("Result").child("Automobile").child(reg_no).child("S2").child("SGPA").getValue() != null
                    ) {
                        Log.d(TAG, "s2");

                        String sem2ttlcredit = snapshot.child("Result").child("Automobile").child("CreditS2").child("ttl").getValue().toString();
                        float s2creditint = Integer.parseInt(sem2ttlcredit);

                        String sgpa2 = snapshot.child("Result").child("Automobile").child(reg_no).child("S2").child("SGPA").getValue().toString();
                        sgpa2tv.setText(sgpa2);
                        String sem2ttlscore = snapshot.child("Result").child("Automobile").child(reg_no).child("S2").child("ttlsscore").getValue().toString();
                        float sem2ttlint = Integer.parseInt(sem2ttlscore);

                        userttl = sem1ttlint + sem2ttlint ;

                        creditttl = s1creditint + s2creditint;
                        CGPA = userttl / creditttl;

                        cgpaTV.setText(String.format("%.2f",CGPA));
                        if (snapshot.child("Result").child("Automobile").child(reg_no).child("S3").child("ttlsscore").getValue() != null
                                && snapshot.child("Result").child("Automobile").child(reg_no).child("S3").child("SGPA").getValue() != null ) {
                            Log.d(TAG, "s3");

                            String sem3ttlcredit = snapshot.child("Result").child("Automobile").child("CreditS3").child("ttl").getValue().toString();
                            float s3creditint = Integer.parseInt(sem3ttlcredit);

                            String sem3ttlscore = snapshot.child("Result").child("Automobile").child(reg_no).child("S3").child("ttlsscore").getValue().toString();
                            float sem3ttlint = Integer.parseInt(sem3ttlscore);
                            String sgpa3 = snapshot.child("Result").child("Automobile").child(reg_no).child("S3").child("SGPA").getValue().toString();
                            sgpa3tv.setText(sgpa3);

                            userttl = sem1ttlint + sem2ttlint + sem3ttlint;

                            creditttl = s1creditint + s2creditint + s3creditint;
                            CGPA = userttl / creditttl;

                            cgpaTV.setText(String.format("%.2f",CGPA));

                            if (snapshot.child("Result").child("Automobile").child(reg_no).child("S4").child("ttlsscore").getValue() != null
                                    && snapshot.child("Result").child("Automobile").child(reg_no).child("S4").child("SGPA").getValue() != null) {

                                Log.d(TAG, "s4");

                                String sem4ttlcredit = snapshot.child("Result").child("Automobile").child("Credits4").child("ttl").getValue().toString();
                                float s4creditint = Integer.parseInt(sem4ttlcredit);

                                String sem4ttlscore = snapshot.child("Result").child("Automobile").child(reg_no).child("S4").child("ttlsscore").getValue().toString();
                                float sem4ttlint = Integer.parseInt(sem4ttlscore);

                                String sgpa4 = snapshot.child("Result").child("Automobile").child(reg_no).child("S4").child("SGPA").getValue().toString();
                                sgpa4tv.setText(sgpa4);

                                userttl = sem1ttlint + sem2ttlint + sem3ttlint + sem4ttlint;
                                creditttl = s1creditint + s2creditint + s3creditint + s4creditint;
                                CGPA = userttl / creditttl;

                                cgpaTV.setText(String.format("%.2f",CGPA));
                                if (snapshot.child("Result").child("Automobile").child(reg_no).child("S5").child("ttlsscore").getValue() != null
                                        && snapshot.child("Result").child("Automobile").child(reg_no).child("S5").child("SGPA").getValue() != null) {
                                    Log.d(TAG, "w5");

                                    String sem5ttlcredit = snapshot.child("Result").child("Automobile").child("CreditS5").child("ttl").getValue().toString();
                                    float s5creditint = Integer.parseInt(sem5ttlcredit);

                                    String sem5ttlscore = snapshot.child("Result").child("Automobile").child(reg_no).child("S5").child("ttlsscore").getValue().toString();
                                    float sem5ttlint = Integer.parseInt(sem5ttlscore);
                                    String sgpa5 = snapshot.child("Result").child("Automobile").child(reg_no).child("S5").child("SGPA").getValue().toString();
                                    sgpa5tv.setText(sgpa5);

                                    userttl = sem1ttlint + sem2ttlint + sem3ttlint + sem4ttlint + sem5ttlint;
                                    creditttl = s1creditint + s2creditint + s3creditint + s4creditint + s5creditint;

                                    CGPA = userttl / creditttl;

                                    cgpaTV.setText(String.format("%.2f",CGPA));

                                    if (snapshot.child("Result").child("Automobile").child(reg_no).child("S6").child("ttlsscore").getValue() != null
                                            && snapshot.child("Result").child("Automobile").child(reg_no).child("S6").child("SGPA").getValue() != null) {
                                        Log.d(TAG, "s6");

                                        String sem6ttlscore = snapshot.child("Result").child("Automobile").child(reg_no).child("S6").child("ttlsscore").getValue().toString();
                                        float sem6ttlint = Integer.parseInt(sem6ttlscore);

                                        userttl = sem1ttlint + sem2ttlint + sem3ttlint + sem4ttlint + sem5ttlint + sem6ttlint;


                                        String sem6ttlcredit = snapshot.child("Result").child("Automobile").child("CreditS6").child("ttl").getValue().toString();
                                        float s6creditint = Integer.parseInt(sem6ttlcredit);

                                        String sgpa6 = snapshot.child("Result").child("Automobile").child(reg_no).child("S6").child("SGPA").getValue().toString();


                                        Log.d(TAG, "set");



                                        sgpa6tv.setText(sgpa6);



                                        if(snapshot.child("Result").child("Automobile").child(reg_no).child("S1").child("ttlsscore").getValue() ==null){
                                            sem1ttlint = 0;
                                            s1creditint = 0;
                                        }
                                        if(snapshot.child("Result").child("Automobile").child(reg_no).child("S2").child("ttlsscore").getValue() ==null){
                                            sem2ttlint = 0;
                                            s2creditint = 0;
                                        }if(snapshot.child("Result").child("Automobile").child(reg_no).child("S3").child("ttlsscore").getValue() ==null){
                                            sem3ttlint = 0;
                                            s3creditint = 0;
                                        }
                                        if(snapshot.child("Result").child("Automobile").child(reg_no).child("S4").child("ttlsscore").getValue() ==null){
                                            sem4ttlint = 0;
                                            s4creditint = 0;
                                        }
                                        if(snapshot.child("Result").child("Automobile").child(reg_no).child("S5").child("ttlsscore").getValue() ==null){
                                            sem5ttlint = 0;
                                            s5creditint = 0;
                                        }
                                        if(snapshot.child("Result").child("Automobile").child(reg_no).child("S6").child("ttlsscore").getValue() ==null){
                                            sem6ttlint = 0;
                                            s6creditint = 0;
                                        }




                                        creditttl = s1creditint + s2creditint + s3creditint + s4creditint + s5creditint + s6creditint;
                                        CGPA = userttl / creditttl;

                                        cgpaTV.setText(String.format("%.2f",CGPA));


                                    }
                                }
                            }
                        }
                    }

                }
                else{


                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        addResultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String reg = reg_no;
                Intent intent = new Intent(autoStudentViewDetails.this, StudentAllsem.class);
                intent.putExtra("reg_no", reg);
                intent.putExtra("dep", dep);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);


            }
        });

        regTV.setText(reg_no);


    }
}
