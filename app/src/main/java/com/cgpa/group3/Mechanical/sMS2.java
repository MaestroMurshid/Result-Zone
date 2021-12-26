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

public class sMS2 extends AppCompatActivity {


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
        setContentView(R.layout.activity_s_ms2);
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

        database = FirebaseDatabase.getInstance().getReference();

        database.child("Result").child("Mechanical").child(reg_no).child("S2");

        root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.child(reg_no).child("S2").child("2001").getValue() != null && dataSnapshot.child(reg_no).child("S2").child("2002").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S2").child("2003").getValue() !=null && dataSnapshot.child(reg_no).child("S2").child("2004").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S2").child("2005").getValue() !=null && dataSnapshot.child(reg_no).child("S2").child("2007").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S2").child("2008").getValue() !=null&& dataSnapshot.child(reg_no).child("S2").child("2009").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S2").child("2021").getValue() !=null && dataSnapshot.child(reg_no).child("S2").child("2029").getValue() !=null

                ) {
                    String sub1 = dataSnapshot.child(reg_no).child("S2").child("2001").getValue().toString();
                    int sub1cp = Calc(sub1);
                    Log.d(TAG, "Sub1cp" + sub1cp + sub1);
                    String sub2 = dataSnapshot.child(reg_no).child("S2").child("2002").getValue().toString();
                    int sub2cp = Calc(sub2);
                    Log.d(TAG, "Sub2cp" + sub2cp + sub2);
                    String sub3 = dataSnapshot.child(reg_no).child("S2").child("2003").getValue().toString();
                    int sub3cp = Calc(sub3);
                    Log.d(TAG, "Sub3cp" + sub3cp + sub3);
                    String sub4 = dataSnapshot.child(reg_no).child("S2").child("2004").getValue().toString();
                    int sub4cp = Calc(sub4);
                    Log.d(TAG, "Sub4cp" + sub4cp + sub4);
                    String sub5 = dataSnapshot.child(reg_no).child("S2").child("2021").getValue().toString();
                    int sub5cp = Calc(sub5);
                    Log.d(TAG, "Sub5cp" + sub5cp + sub5);
                    String sub6 = dataSnapshot.child(reg_no).child("S2").child("2005").getValue().toString();
                    int sub6cp = Calc(sub6);
                    Log.d(TAG, "Sub6cp" + sub6cp + sub6);
                    String sub7 = dataSnapshot.child(reg_no).child("S2").child("2008").getValue().toString();
                    int sub7cp = Calc(sub7);
                    String sub8 = dataSnapshot.child(reg_no).child("S2").child("2007").getValue().toString();
                    int sub8cp = Calc(sub8);
                    String sub9 = dataSnapshot.child(reg_no).child("S2").child("2029").getValue().toString();
                    int sub9cp = Calc(sub9);
                    String sub10 = dataSnapshot.child(reg_no).child("S2").child("2009").getValue().toString();
                    int sub10cp = Calc(sub10);

                    String cp1 = dataSnapshot.child("CreditS2").child("2001").getValue().toString();
                    String cp2 = dataSnapshot.child("CreditS2").child("2002").getValue().toString();
                    String cp3 = dataSnapshot.child("CreditS2").child("2003").getValue().toString();
                    String cp4 = dataSnapshot.child("CreditS2").child("2004").getValue().toString();
                    String cp5 = dataSnapshot.child("CreditS2").child("2021").getValue().toString();
                    String cp6 = dataSnapshot.child("CreditS2").child("2005").getValue().toString();
                    String cp7 = dataSnapshot.child("CreditS2").child("2008").getValue().toString();
                    String cp8 = dataSnapshot.child("CreditS2").child("2007").getValue().toString();
                    String cp9 = dataSnapshot.child("CreditS2").child("2029").getValue().toString();
                    String cp10 = dataSnapshot.child("CreditS2").child("2009").getValue().toString();

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


                    subet1.setText(sub1);
                    subet2.setText(sub2);
                    subet3.setText(sub3);
                    subet4.setText(sub4);
                    subet5.setText(sub5);
                    subet6.setText(sub6);
                    subet7.setText(sub7);
                    subet8.setText(sub8);
                    subet9.setText(sub9);
                    subet10.setText(sub10);


                    Log.d(TAG, "Before calc");

                    if (sub1cp >= 0 && sub2cp >= 0 && sub3cp >= 0 && sub4cp >= 0 && sub5cp >= 0 && sub6cp >= 0 && sub7cp>=0 && sub8cp>=0 && sub9cp>=0 && sub10cp>=0) {
                        Log.d(TAG, "Inside Calc");

                        int ttl_credit = cp1int + cp2int + cp3int + cp4int + cp5int + cp6int + cp7int + cp8int + cp9int +cp10int;

                        double sgpa = ttl_score / ttl_credit;
                        sgpatv = findViewById(R.id.textView3);
                        String finalresult = String.format("%.2f", sgpa);
                        sgpatv.setText(finalresult);
                        Log.d(TAG, "final + sgpa " + finalresult + sgpa);

                        database.child("Result").child("Mechanical").child(reg_no).child("S2").child("ttlsscore").setValue(ttl_score);

                        database.child("Result").child("Mechanical").child(reg_no).child("S2").child("SGPA").setValue(finalresult);

                    }
                    else {

                    }
                }
                else{

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.d(TAG, error.getMessage());
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
