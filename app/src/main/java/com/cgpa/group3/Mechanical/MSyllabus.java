package com.cgpa.group3.Mechanical;

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

public class MSyllabus extends AppCompatActivity {

    FirebaseStorage firebaseStorage;
    StorageReference storageReference,ref;

    Button B1001,B1002,B1003,B1004,B1008,B1009,
            B2001,B2002,B2003,B2004,B2005,B2007,B2008,B2009,B2021,B2029
            ,B3021,B3022,B3023,B3024,B3027,B3001,B3028,B3029,
            B4021,B4022,B4023,B4024,B4026,B4027,B4028,B4029,
            B5001,B5021,B5022,B5027,B5028,B5029,B5018,B5019,B5009,
            B6009,B6021,B6022,B6023,B6027,B6028,B6029,B6018,B6019;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_syllabus);
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
        B2021 = findViewById(R.id.b2021);
        B2029 = findViewById(R.id.b2029);

        B3001 = findViewById(R.id.b3001);
        B3021 =findViewById(R.id.b3021);
        B3023 = findViewById(R.id.b3023);
        B3022 = findViewById(R.id.b3022);
        B3027 = findViewById(R.id.b3027);
        B3028 = findViewById(R.id.b3028);
        B3029 = findViewById(R.id.b3029);
        B3024 = findViewById(R.id.b3024);

        B4021 = findViewById(R.id.b4021);
        B4022 =findViewById(R.id.b4022);
        B4023 = findViewById(R.id.b4023);
        B4024 = findViewById(R.id.b4024);
        B4026 = findViewById(R.id.b4026);
        B4027 = findViewById(R.id.b4027);
        B4028 = findViewById(R.id.b4028);
        B4029 = findViewById(R.id.b4029);

        B5009 = findViewById(R.id.b5009);
        B5001 =findViewById(R.id.b5001);
        B5022 = findViewById(R.id.b5022);
        B5027 = findViewById(R.id.b5027);
        B5028 = findViewById(R.id.b5028);
        B5029 = findViewById(R.id.b5029);
        B5018 = findViewById(R.id.b5018);
        B5021 = findViewById(R.id.b5021);
        B5019 = findViewById(R.id.b5019);

        B6009 = findViewById(R.id.b6009);
        B6021 =findViewById(R.id.b6021);
        B6022 = findViewById(R.id.b6022);
        B6023 = findViewById(R.id.b6023);
        B6027 = findViewById(R.id.b6027);
        B6028 = findViewById(R.id.b6028);
        B6029 = findViewById(R.id.b6029);
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
        B2021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("2021");
            }
        });
        B2029.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("2029");
            }
        });
        B3001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3001");
            }
        });
        B3021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3021");
            }
        });
        B3022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3022");
            }
        });
        B3023.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3023");
            }
        });
        B3024.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3024");
            }
        });
        B3027.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3027");
            }
        });
        B3028.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3028");
            }
        });
        B3029.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3029");
            }
        });
        B4021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4021");
            }
        });
        B4022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4022");
            }
        });
        B4023.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4023");
            }
        });
        B4024.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4024");
            }
        });
        B4026.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4026");
            }
        });
        B4027.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4027");
            }
        });
        B4028.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4028");
            }
        });
        B4029.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4029");
            }
        });
        B5009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5009");
            }
        });
        B5001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5001");
            }
        });
        B5021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5021");
            }
        });
        B5022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5022");
            }
        });
        B5027.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5027");
            }
        });
        B5028.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5028");
            }
        });
        B5029.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5029");
            }
        });

        B6009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6009");
            }
        });
        B6021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6021");
            }
        });
        B6022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6022");
            }
        });
        B6023.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6023");
            }
        });
        B6027.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6027");
            }
        });
        B6028.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6028");
            }
        });
        B6029.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6029");
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
                downloadFiles(MSyllabus.this,b,".pdf",DIRECTORY_DOWNLOADS,url);

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
