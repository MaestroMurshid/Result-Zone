package com.cgpa.group3.Mechanical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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

public class Ms2Calc extends AppCompatActivity {


    TextView subtv1,subtv2,subtv3,subtv4,subtv5,subtv6, subtv7,subtv8,subtv9,subtv10,sgpatv;
    EditText subet1,subet2,subet3,subet4,subet5,subet6,subet7,subet8,subet9,subet10;
    DatabaseReference database;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("Result").child("Mechanical");
    Button button;
    String TAG = "Ac";



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ms2_calc);
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


         button = findViewById(R.id.button13);
         button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                root.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
                        s1 = subet1.getText().toString();
                        s2 = subet2.getText().toString();
                        s3 = subet3.getText().toString();
                        s4 = subet4.getText().toString();
                        s5 = subet5.getText().toString();
                        s6 = subet6.getText().toString();
                        s7 = subet7.getText().toString();
                        s8 = subet8.getText().toString();
                        s9 = subet9.getText().toString();
                        s10 = subet10.getText().toString();

                        int sub1cp = Calc(s1);
                        int sub2cp = Calc(s2);
                        int sub3cp = Calc(s3);
                        int sub4cp = Calc(s4);
                        int sub5cp = Calc(s5);
                        int sub6cp = Calc(s6);
                        int sub7cp = Calc(s7);
                        int sub8cp = Calc(s8);
                        int sub9cp = Calc(s9);
                        int sub10cp = Calc(s10);

                        String cp1 = dataSnapshot.child("CreditS2").child("2001").getValue().toString();
                        String cp2 = dataSnapshot.child("CreditS2").child("2002").getValue().toString();
                        String cp3 = dataSnapshot.child("CreditS2").child("2003").getValue().toString();
                        String cp4 = dataSnapshot.child("CreditS2").child("2004").getValue().toString();
                        String cp5 = dataSnapshot.child("CreditS2").child("2005").getValue().toString();
                        String cp6 = dataSnapshot.child("CreditS2").child("2007").getValue().toString();
                        String cp7 = dataSnapshot.child("CreditS2").child("2008").getValue().toString();
                        String cp8 = dataSnapshot.child("CreditS2").child("2009").getValue().toString();
                        String cp9 = dataSnapshot.child("CreditS2").child("2021").getValue().toString();
                        String cp10 = dataSnapshot.child("CreditS2").child("2029").getValue().toString();

                        int cp1int = Integer.parseInt(cp1);
                        int cp2int = Integer.parseInt(cp2);
                        int cp3int = Integer.parseInt(cp3);
                        int cp4int = Integer.parseInt(cp4);
                        int cp5int = Integer.parseInt(cp5);
                        int cp6int = Integer.parseInt(cp6);
                        int cp7int = Integer.parseInt(cp7);
                        int cp8int = Integer.parseInt(cp8);
                        int cp9int = Integer.parseInt(cp9);
                        int cp10int = Integer.parseInt(cp10);

                        double ttl_score = sub1cp * cp1int + sub2cp * cp2int + sub3cp * cp3int + sub4cp * cp4int + sub5cp * cp5int + sub6cp * cp6int + sub7cp * cp7int + sub8cp * cp8int + sub9cp * cp9int + sub10cp * cp10int;


                        Log.d(TAG, "Before calc");

                        if (sub1cp >= 0 && sub2cp >= 0 && sub3cp >= 0 && sub4cp >= 0 && sub5cp >= 0 && sub6cp >= 0 && sub7cp>=0 && sub8cp>=0 && sub9cp>=0 && sub10cp>=0) {
                            Log.d(TAG, "Inside Calc");

                            int ttl_credit = cp1int + cp2int + cp3int + cp4int + cp5int + cp6int + cp7int + cp8int + cp9int +cp10int;

                            double sgpa = ttl_score / ttl_credit;
                            sgpatv = findViewById(R.id.textView3);
                            String finalresult = String.format("%.2f", sgpa);
                            sgpatv.setText(finalresult);
                            Log.d(TAG, "final + sgpa " + finalresult + sgpa);



                        }
                        else {
                            Toast.makeText(getApplicationContext(), "You have an F in your grades", Toast.LENGTH_LONG);
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
        subet7 = findViewById(R.id.sub7et);
        subet8 = findViewById(R.id.sub8et);
        subet9 = findViewById(R.id.sub9et);
        subet10 = findViewById(R.id.sub10et);

        subtv1 = findViewById(R.id.sub1tv);
        subtv2 = findViewById(R.id.sub2tv);
        subtv3 = findViewById(R.id.sub3tv);
        subtv4 = findViewById(R.id.sub4tv);
        subtv5 = findViewById(R.id.sub5tv);
        subtv6 = findViewById(R.id.sub6tv);
        subtv7 = findViewById(R.id.sub7tv);
        subtv8 = findViewById(R.id.sub8tv);
        subtv9 = findViewById(R.id.sub9tv);
        subtv10 = findViewById(R.id.sub10tv);


        button = findViewById(R.id.button13);

        final String c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
        c1 = subtv1.getText().toString();
        c2 = subtv2.getText().toString();
        c3 = subtv3.getText().toString();
        c4 = subtv4.getText().toString();
        c5 = subtv5.getText().toString();
        c6 = subtv6.getText().toString();
        c7 = subtv7.getText().toString();
        c8 = subtv8.getText().toString();
        c9 = subtv9.getText().toString();
        c10 = subtv10.getText().toString();






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
