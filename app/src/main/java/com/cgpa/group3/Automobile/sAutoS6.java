package com.cgpa.group3.Automobile;

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

public class sAutoS6 extends AppCompatActivity{


    TextView subtv1,subtv2,subtv3,subtv4,subtv5,subtv6, subtv7,subtv8,sgpatv;
    EditText subet1,subet2,subet3,subet4,subet5,subet6,subet7,subet8;
    DatabaseReference database;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("Result").child("Automobile");
    Button button;
    String TAG = "Ac";
    private Spinner spinner;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_autos6);
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

        database.child("Result").child("Automobile").child(reg_no).child("S6");

        root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.child(reg_no).child("S6").child("6009").getValue() != null
                        && dataSnapshot.child(reg_no).child("S6").child("Esub").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S6").child("6051").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S6").child("6052").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S6").child("6053").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S6").child("6058").getValue() !=null
                        && dataSnapshot.child(reg_no).child("S6").child("6059").getValue() !=null



                ) {
                    String sub1 = dataSnapshot.child(reg_no).child("S6").child("6009").getValue().toString();
                    int sub1cp = Calc(sub1);
                    Log.d(TAG, "Sub1cp" + sub1cp + sub1);
                    String sub2 = dataSnapshot.child(reg_no).child("S6").child("Esub").getValue().toString();
                    int sub2cp = Calc(sub2);
                    Log.d(TAG, "Sub2cp" + sub2cp + sub2);
                    String sub3 = dataSnapshot.child(reg_no).child("S6").child("6051").getValue().toString();
                    int sub3cp = Calc(sub3);
                    Log.d(TAG, "Sub3cp" + sub3cp + sub3);
                    String sub4 = dataSnapshot.child(reg_no).child("S6").child("6052").getValue().toString();
                    int sub4cp = Calc(sub4);
                    Log.d(TAG, "Sub4cp" + sub4cp + sub4);
                    String sub5 = dataSnapshot.child(reg_no).child("S6").child("6053").getValue().toString();
                    int sub5cp = Calc(sub5);
                    Log.d(TAG, "Sub5cp" + sub5cp + sub5);
                    String sub6 = dataSnapshot.child(reg_no).child("S6").child("6058").getValue().toString();
                    int sub6cp = Calc(sub6);
                    Log.d(TAG, "Sub6cp" + sub6cp + sub6);
                    String sub7 = dataSnapshot.child(reg_no).child("S6").child("6059").getValue().toString();
                    int sub7cp = Calc(sub7);



                    String cp1 = dataSnapshot.child("CreditS6").child("6009").getValue().toString();
                    String cp2 = dataSnapshot.child("CreditS6").child("Esub").getValue().toString();
                    String cp3 = dataSnapshot.child("CreditS6").child("6051").getValue().toString();
                    String cp4 = dataSnapshot.child("CreditS6").child("6052").getValue().toString();
                    String cp5 = dataSnapshot.child("CreditS6").child("6053").getValue().toString();
                    String cp6 = dataSnapshot.child("CreditS6").child("6058").getValue().toString();
                    String cp7 = dataSnapshot.child("CreditS6").child("6059").getValue().toString();


                    int cp1int = Integer.parseInt(cp1);
                    int cp2int = Integer.parseInt(cp2);
                    int cp3int = Integer.parseInt(cp3);
                    int cp4int = Integer.parseInt(cp4);
                    int cp5int = Integer.parseInt(cp5);
                    int cp6int = Integer.parseInt(cp6);
                    int cp7int = Integer.parseInt(cp7);



                    double ttl_score = (sub1cp * cp1int) + (sub2cp * cp2int) + (sub3cp * cp3int) + (sub4cp * cp4int) + (sub5cp * cp5int) + (sub6cp * cp6int) + (sub7cp * cp7int);

                    int ttlsubscore = sub1cp + sub2cp + sub3cp + sub4cp + sub5cp + sub6cp + sub7cp;

                    subet1.setText(sub1);
                    subet2.setText(sub2);
                    subet3.setText(sub3);
                    subet4.setText(sub4);
                    subet5.setText(sub5);
                    subet6.setText(sub6);
                    subet7.setText(sub7);

                    Log.d(TAG, "Before calc");

                    if (sub1cp >= 0 && sub2cp >= 0 && sub3cp >= 0 && sub4cp >= 0 && sub5cp >= 0 && sub6cp >= 0 && sub7cp>=0) {
                        Log.d(TAG, "Inside Calc");

                        int ttl_credit = cp1int + cp2int + cp3int + cp4int + cp5int + cp6int + cp7int ;

                        double sgpa = ttl_score / ttl_credit;
                        sgpatv = findViewById(R.id.textView3);
                        String finalresult = String.format("%.2f", sgpa);
                        sgpatv.setText(finalresult);
                        Log.d(TAG, "final + sgpa " + finalresult + sgpa);

                        database.child("Result").child("Automobile").child(reg_no).child("S6").child("ttlsscore").setValue(ttl_score);

                        database.child("Result").child("Automobile").child(reg_no).child("S6").child("SGPA").setValue(finalresult);

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


        subtv1 = findViewById(R.id.sub1tv);
        spinner = findViewById(R.id.spinner);
        subtv3 = findViewById(R.id.sub3tv);
        subtv4 = findViewById(R.id.sub4tv);
        subtv5 = findViewById(R.id.sub5tv);
        subtv6 = findViewById(R.id.sub6tv);
        subtv7 = findViewById(R.id.sub7tv);



        List<String> subE = new ArrayList<>();
        subE.add("6025");
        subE.add("6054");
        subE.add("6055");

        ArrayAdapter<String>subEAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,subE);
        subEAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(subEAdapter);





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
