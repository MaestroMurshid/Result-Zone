package com.cgpa.group3.Architecture;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.cgpa.group3.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Archs5Add extends AppCompatActivity{


    TextView subtv1,subtv2,subtv3,subtv4,subtv5,subtv6, subtv7,subtv8,sgpatv;
    EditText subet1,subet2,subet3,subet4,subet5,subet6,subet7,subet8;
    DatabaseReference database;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("Result").child("Architecture");
    Button button;
    String TAG = "Ac";
    private Spinner spinner;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archs5_add);
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

        database.child("Result").child("Architecture").child(reg_no).child("S5");

        root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.child(reg_no).child("S5").child("5009").getValue() != null
                        && dataSnapshot.child(reg_no).child("S5").child("Esub").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S5").child("5012").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S5").child("5015").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S5").child("5181").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S5").child("5182").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S5").child("5189").getValue() !=null


                ) {
                    String sub1 = dataSnapshot.child(reg_no).child("S5").child("5009").getValue().toString();
                    int sub1cp = Calc(sub1);
                    Log.d(TAG, "Sub1cp" + sub1cp + sub1);
                    String sub2 = dataSnapshot.child(reg_no).child("S5").child("Esub").getValue().toString();
                    int sub2cp = Calc(sub2);
                    Log.d(TAG, "Sub2cp" + sub2cp + sub2);
                    String sub3 = dataSnapshot.child(reg_no).child("S5").child("5012").getValue().toString();
                    int sub3cp = Calc(sub3);
                    Log.d(TAG, "Sub3cp" + sub3cp + sub3);
                    String sub4 = dataSnapshot.child(reg_no).child("S5").child("5015").getValue().toString();
                    int sub4cp = Calc(sub4);
                    Log.d(TAG, "Sub4cp" + sub4cp + sub4);
                    String sub5 = dataSnapshot.child(reg_no).child("S5").child("5181").getValue().toString();
                    int sub5cp = Calc(sub5);
                    Log.d(TAG, "Sub5cp" + sub5cp + sub5);
                    String sub6 = dataSnapshot.child(reg_no).child("S5").child("5182").getValue().toString();
                    int sub6cp = Calc(sub6);
                    Log.d(TAG, "Sub6cp" + sub6cp + sub6);
                    String sub7 = dataSnapshot.child(reg_no).child("S5").child("5183").getValue().toString();
                    int sub7cp = Calc(sub7);
                    String sub8 = dataSnapshot.child(reg_no).child("S5").child("5189").getValue().toString();
                    int sub8cp = Calc(sub8);

                    String cp1 = dataSnapshot.child("CreditS5").child("5009").getValue().toString();
                    Log.d(TAG, "cp1" + cp1);
                    String cp2 = dataSnapshot.child("CreditS5").child("Esub").getValue().toString();
                    String cp3 = dataSnapshot.child("CreditS5").child("5012").getValue().toString();
                    String cp4 = dataSnapshot.child("CreditS5").child("5015").getValue().toString();
                    String cp5 = dataSnapshot.child("CreditS5").child("5181").getValue().toString();
                    String cp6 = dataSnapshot.child("CreditS5").child("5182").getValue().toString();
                    String cp7 = dataSnapshot.child("CreditS5").child("5183").getValue().toString();
                    String cp8 = dataSnapshot.child("CreditS5").child("5189").getValue().toString();

                    int cp1int = Integer.parseInt(cp1);
                    int cp2int = Integer.parseInt(cp2);
                    int cp3int = Integer.parseInt(cp3);
                    int cp4int = Integer.parseInt(cp4);
                    int cp5int = Integer.parseInt(cp5);
                    int cp6int = Integer.parseInt(cp6);
                    int cp7int = Integer.parseInt(cp7);
                    int cp8int = Integer.parseInt(cp8);

                    double ttl_score = sub1cp * cp1int + sub2cp * cp2int + sub3cp * cp3int + sub4cp * cp4int + sub5cp * cp5int + sub6cp * cp6int + sub7cp * cp7int + sub8cp * cp8int;

                    int ttlsubscore = sub1cp + sub2cp + sub3cp + sub4cp + sub5cp + sub6cp + sub7cp;

                    subet1.setText(sub1);
                    subet2.setText(sub2);
                    subet3.setText(sub3);
                    subet4.setText(sub4);
                    subet5.setText(sub5);
                    subet6.setText(sub6);
                    subet7.setText(sub7);
                    subet8.setText(sub8);


                    Log.d(TAG, "Before calc");

                    if (sub1cp >= 0 && sub2cp >= 0 && sub3cp >= 0 && sub4cp >= 0 && sub5cp >= 0 && sub6cp >= 0 && sub7cp>=0 && sub8cp>=0) {
                        Log.d(TAG, "Inside Calc");

                        int ttl_credit = cp1int + cp2int + cp3int + cp4int + cp5int + cp6int + cp7int + cp8int;

                        double sgpa = ttl_score / ttl_credit;
                        sgpatv = findViewById(R.id.textView3);
                        String finalresult = String.format("%.2f", sgpa);
                        sgpatv.setText(finalresult);
                        Log.d(TAG, "final + sgpa " + finalresult + sgpa);

                        database.child("Result").child("Architecture").child(reg_no).child("S5").child("ttlsscore").setValue(ttl_score);

                        database.child("Result").child("Architecture").child(reg_no).child("S5").child("SGPA").setValue(finalresult);


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

        subtv1 = findViewById(R.id.sub1tv);
        spinner = findViewById(R.id.spinner);
        subtv3 = findViewById(R.id.sub3tv);
        subtv4 = findViewById(R.id.sub4tv);
        subtv5 = findViewById(R.id.sub5tv);
        subtv6 = findViewById(R.id.sub6tv);
        subtv7 = findViewById(R.id.sub7tv);
        subtv8 = findViewById(R.id.sub8tv);


        List<String> subE = new ArrayList<>();
        subE.add("5016");
        subE.add("5184");


        ArrayAdapter<String>subEAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,subE);
        subEAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(subEAdapter);


        button = findViewById(R.id.button13);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final String c1,c2,c3,c4,c5,c6,c7,c8;
                c1 = subtv1.getText().toString();
                c2 = "Esub";
                c3 = subtv3.getText().toString();
                c4 = subtv4.getText().toString();
                c5 = subtv5.getText().toString();
                c6 = subtv6.getText().toString();
                c7 = subtv7.getText().toString();
                c8 = subtv8.getText().toString();


                String s1,s2,s3,s4,s5,s6,s7,s8;
                s1 = subet1.getText().toString();
                s2 = subet2.getText().toString();
                s3 = subet3.getText().toString();
                s4 = subet4.getText().toString();
                s5 = subet5.getText().toString();
                s6 = subet6.getText().toString();
                s7 = subet7.getText().toString();
                s8 = subet8.getText().toString();


                Set<String> Grades = new HashSet<String>();
                Grades.add("S");
                Grades.add("A");
                Grades.add("B");
                Grades.add("C");
                Grades.add("D");
                Grades.add("E");
                Grades.add("F");


                if (Grades.contains(s1) && Grades.contains(s2) && Grades.contains(s3) && Grades.contains(s4) && Grades.contains(s5) && Grades.contains(s6)&& Grades.contains(s7)&& Grades.contains(s8)) {
                    Log.d(TAG, "Inside");
                    database.child("Result").child("Architecture").child(reg_no).child("S5").child(c1).setValue(s1);
                    database.child("Result").child("Architecture").child(reg_no).child("S5").child(c2).setValue(s2);
                    database.child("Result").child("Architecture").child(reg_no).child("S5").child(c3).setValue(s3);
                    database.child("Result").child("Architecture").child(reg_no).child("S5").child(c4).setValue(s4);
                    database.child("Result").child("Architecture").child(reg_no).child("S5").child(c5).setValue(s5);
                    database.child("Result").child("Architecture").child(reg_no).child("S5").child(c6).setValue(s6);
                    database.child("Result").child("Architecture").child(reg_no).child("S5").child(c7).setValue(s7);
                    database.child("Result").child("Architecture").child(reg_no).child("S5").child(c8).setValue(s8);


                }
                else{
                    Toast.makeText(getApplicationContext(),"Recheck Your Grades",Toast.LENGTH_SHORT).show();
                }

            }
        });




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
