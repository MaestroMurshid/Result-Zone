package com.cgpa.group3.Civil;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cgpa.group3.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class CivilSyllabus extends AppCompatActivity {

    FirebaseStorage firebaseStorage;
    StorageReference storageReference,ref;

    Button B1001,B1002,B1003,B1004,B1008,B1009,
            B2001,B2002,B2003,B2004,B2005,B2007,B2008,B2009,B2011,B2019
            ,B3013,B3012,B3011,B3014,B3017,B3001,B3019,B3018,
            B4014,B4013,B4011,B4012,B4019,B4018,B4017,B4009,
            B5012,B5015,B5013,B5016,B5011,B5017,B5018,B5019,B5009,
            B6009,B6013,B6014,B6015,B6016,B6017,B6011,B6018,B6019;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_syllabus);
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
        B1001 = findViewById(R.id.b1001);
        B1002 =findViewById(R.id.b1002);
        B1003 = findViewById(R.id.b1003);
        B1004 = findViewById(R.id.b1004);
        B1008 = findViewById(R.id.b1008);
        B1009 = findViewById(R.id.b1009);

        B2001 = findViewById(R.id.b2001);
        B2002 =findViewById(R.id.b2002);
        B2003 = findViewById(R.id.b2003);
        B2004 = findViewById(R.id.b2004);
        B2005 = findViewById(R.id.b2005);
        B2007 = findViewById(R.id.b2007);
        B2008 = findViewById(R.id.b2008);
        B2009 = findViewById(R.id.b2009);
        B2011 = findViewById(R.id.b2011);
        B2019 = findViewById(R.id.b2019);

        B3001 = findViewById(R.id.b3001);
        B3013 =findViewById(R.id.b3013);
        B3011 = findViewById(R.id.b3011);
        B3012 = findViewById(R.id.b3012);
        B3017 = findViewById(R.id.b3017);
        B3019 = findViewById(R.id.b3019);
        B3018 = findViewById(R.id.b3018);
        B3014 = findViewById(R.id.b3014);

        B4014 = findViewById(R.id.b4014);
        B4013 =findViewById(R.id.b4013);
        B4011 = findViewById(R.id.b4011);
        B4012 = findViewById(R.id.b4012);
        B4019 = findViewById(R.id.b4019);
        B4018 = findViewById(R.id.b4018);
        B4017 = findViewById(R.id.b4017);
        B4009 = findViewById(R.id.b4009);

        B5009 = findViewById(R.id.b5009);
        B5012 =findViewById(R.id.b5012);
        B5013 = findViewById(R.id.b5013);
        B5016 = findViewById(R.id.b5016);
        B5011 = findViewById(R.id.b5011);
        B5017 = findViewById(R.id.b5017);
        B5018 = findViewById(R.id.b5018);
        B5015 = findViewById(R.id.b5015);
        B5019 = findViewById(R.id.b5019);

        B6009 = findViewById(R.id.b6009);
        B6013 =findViewById(R.id.b6013);
        B6014 = findViewById(R.id.b6014);
        B6015 = findViewById(R.id.b6015);
        B6016 = findViewById(R.id.b6016);
        B6017 = findViewById(R.id.b6017);
        B6011 = findViewById(R.id.b6011);
        B6018 = findViewById(R.id.b6018);
        B6019 = findViewById(R.id.b6019);


        B1001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("1001");
            }
        });
        B1002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("1002");
            }
        });
        B1003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("1003");
            }
        });
        B1004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("1004");
            }
        });
        B1008.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("1008");
            }
        });
        B1009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("1009");
            }
        });

        B2001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("2001");
            }
        });
        B2002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("2002");
            }
        });
        B2003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("2003");
            }
        });
        B2004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("2004");
            }
        });
        B2005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("2005");
            }
        });
        B2007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("2007");
            }
        });
        B2008.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("2008");
            }
        });
        B2009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("2009");
            }
        });
        B3001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3001");
            }
        });
        B3013.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3013");
            }
        });
        B3012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3012");
            }
        });
        B3011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3011");
            }
        });
        B3014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3014");
            }
        });
        B3017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3017");
            }
        });
        B3019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3019");
            }
        });
        B3018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3018");
            }
        });
        B4014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4014");
            }
        });
        B4013.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4013");
            }
        });
        B4011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4011");
            }
        });
        B4012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4012");
            }
        });
        B4019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4019");
            }
        });
        B4018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4018");
            }
        });
        B4017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4017");
            }
        });
        B4009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4009");
            }
        });
        B5009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5009");
            }
        });
        B5012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5012");
            }
        });
        B5015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5015");
            }
        });
        B5013.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5013");
            }
        });
        B5016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5016");
            }
        });
        B5011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5011");
            }
        });
        B5017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5017");
            }
        });
        B5018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5018");
            }
        });

        B5019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5019");
            }
        });


        B6009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6009");
            }
        });
        B6013.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6013");
            }
        });
        B6014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6014");
            }
        });
        B6015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6015");
            }
        });
        B6016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6016");
            }
        });
        B6017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6017");
            }
        });
        B6011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6011");
            }
        });
        B6018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6018");
            }
        });
        B6019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6019");
            }
        });


    }

    private void download(final String b) {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child(b+".pdf");
        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadFiles(CivilSyllabus.this,b,".pdf",DIRECTORY_DOWNLOADS,url);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }

    private void downloadFiles(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context,destinationDirectory,fileName + fileExtension);

        downloadManager.enqueue(request);
    }
}
