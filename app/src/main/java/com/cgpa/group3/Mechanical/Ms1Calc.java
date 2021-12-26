package com.cgpa.group3.Mechanical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cgpa.group3.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashSet;
import java.util.Set;

public class Ms1Calc extends AppCompatActivity {


    TextView subtv1,subtv2,subtv3,subtv4,subtv5,subtv6, sgpatv;
    EditText subet1,subet2,subet3,subet4,subet5,subet6;
    DatabaseReference database;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("Result").child("Mechanical");
    Button sgpabutton;
    String TAG = "Ac";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ms1_calc);
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


        database = FirebaseDatabase.getInstance().getReference();

        sgpabutton = findViewById(R.id.sgpa);
        sgpabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                root.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        String s1,s2,s3,s4,s5,s6;
                        s1 = subet1.getText().toString();
                        s2 = subet2.getText().toString();
                        s3 = subet3.getText().toString();
                        s4 = subet4.getText().toString();
                        s5 = subet5.getText().toString();
                        s6 = subet6.getText().toString();


                        int sub1cp = Calc(s1);
                        int sub2cp = Calc(s2);
                        int sub3cp = Calc(s3);
                        int sub4cp = Calc(s4);
                        int sub5cp = Calc(s5);
                        int sub6cp = Calc(s6);

                        String cp1 = dataSnapshot.child("CreditS1").child("1001").getValue().toString();
                        String cp2 = dataSnapshot.child("CreditS1").child("1002").getValue().toString();
                        String cp3 = dataSnapshot.child("CreditS1").child("1003").getValue().toString();
                        String cp4 = dataSnapshot.child("CreditS1").child("1004").getValue().toString();
                        String cp5 = dataSnapshot.child("CreditS1").child("1008").getValue().toString();
                        String cp6 = dataSnapshot.child("CreditS1").child("1009").getValue().toString();

                        int cp1int = Integer.parseInt(cp1);
                        int cp2int = Integer.parseInt(cp2);
                        int cp3int = Integer.parseInt(cp3);
                        int cp4int = Integer.parseInt(cp4);
                        int cp5int = Integer.parseInt(cp5);
                        int cp6int = Integer.parseInt(cp6);

                        double ttl_score = (sub1cp * cp1int) + (sub2cp * cp2int )+ (sub3cp * cp3int) + (sub4cp * cp4int) + (sub5cp * cp5int) + (sub6cp * cp6int);



                        Log.d(TAG, "Before calc");

                        if (sub1cp >= 0 && sub2cp >= 0 && sub3cp >= 0 && sub4cp >= 0 && sub5cp >= 0 && sub6cp >= 0) {
                            Log.d(TAG, "Inside Calc");

                            int ttl_credit = cp1int + cp2int + cp3int + cp4int + cp5int + cp6int;

                            double sgpa = ttl_score / ttl_credit;
                            sgpatv = findViewById(R.id.textView3);
                            String finalresult = String.format("%.2f", sgpa);
                            sgpatv.setText(finalresult);



                        }
                        else {
                            Toast.makeText(getApplicationContext(), "You have a F in your grades", Toast.LENGTH_LONG);
                        }
                    }


                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });


        subet1 = findViewById(R.id.sub1et);
        subet2 = findViewById(R.id.sub2et);
        subet3 = findViewById(R.id.sub3et);
        subet4 = findViewById(R.id.sub4et);
        subet5 = findViewById(R.id.sub5et);
        subet6 = findViewById(R.id.sub6et);

        subtv1 = findViewById(R.id.sub1tv);
        subtv2 = findViewById(R.id.sub2tv);
        subtv3 = findViewById(R.id.sub3tv);
        subtv4 = findViewById(R.id.sub4tv);
        subtv5 = findViewById(R.id.sub5tv);
        subtv6 = findViewById(R.id.sub6tv);




    }

    public int Calc(String a){

        if(a.equals("S")){
            return 10;
        }

        if(a.equals("A")){
            return 9;
        }
        if(a.equals("B")){
            return 8;
        }
        if(a.equals("C")){
            return 7;
        }
        if(a.equals("D")){
            return 6;
        }
        if(a.equals("E")){
            return 5;
        }
        if(a.equals("F")){
            return 0;
        }
        else{
            return -1;
        }
    }

}
