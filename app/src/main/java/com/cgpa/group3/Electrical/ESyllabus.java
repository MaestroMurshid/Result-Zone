package com.cgpa.group3.Electrical;

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

public class ESyllabus extends AppCompatActivity {

    FirebaseStorage firebaseStorage;
    StorageReference storageReference,ref;

    Button B1001,B1002,B1003,B1004,B1008,B1009,
            B2001,B2002,B2003,B2004,B2005,B2007,B2008,B2009,B2039,B2031
            ,B3032,B3031,B3033,B3034,B3038,B3001,B3039,B3037,
            B4034,B4033,B4031,B4032,B4037,B4039,B4038,B4036,B4009,
            B5001,B5031,B5032,B5035,B5033,B5034,B5039,B5038,B5009,
            B6009,B6033,B6031,B6032,B6034,B6035,B6036,B6038,B6039;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_syllabus);
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
        B2039 = findViewById(R.id.b2039);
        B2031 = findViewById(R.id.b2031);

        B3001 = findViewById(R.id.b3001);
        B3031 =findViewById(R.id.b3031);
        B3032 = findViewById(R.id.b3032);
        B3033 = findViewById(R.id.b3033);
        B3034 = findViewById(R.id.b3034);
        B3037 = findViewById(R.id.b3037);
        B3038 = findViewById(R.id.b3038);
        B3039 = findViewById(R.id.b3039);

        B4031 = findViewById(R.id.b4031);
        B4032 =findViewById(R.id.b4032);
        B4033 = findViewById(R.id.b4033);
        B4034 = findViewById(R.id.b4034);
        B4036 = findViewById(R.id.b4036);
        B4037 = findViewById(R.id.b4037);
        B4038 = findViewById(R.id.b4038);
        B4039 = findViewById(R.id.b4039);

        B5009 = findViewById(R.id.b5009);
        B5031 =findViewById(R.id.b5031);
        B5032 = findViewById(R.id.b5032);
        B5033 = findViewById(R.id.b5033);
        B5034 = findViewById(R.id.b5034);
        B5035 = findViewById(R.id.b5035);
        B5039 = findViewById(R.id.b5039);
        B5001 = findViewById(R.id.b5001);
        B5038 = findViewById(R.id.b5038);
        B5039 = findViewById(R.id.b5039);

        B6009 = findViewById(R.id.b6009);
        B6031 =findViewById(R.id.b6031);
        B6032 = findViewById(R.id.b6032);
        B6033 = findViewById(R.id.b6033);
        B6034 = findViewById(R.id.b6034);
        B6035 = findViewById(R.id.b6035);
        B6036 = findViewById(R.id.b6036);
        B6038 = findViewById(R.id.b6038);
        B6039 = findViewById(R.id.b6039);


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
        B3031.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3031");
            }
        });
        B3032.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3032");
            }
        });
        B3033.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3033");
            }
        });
        B3034.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3034");
            }
        });
        B3037.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3037");
            }
        });
        B3038.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3038");
            }
        });
        B3039.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3039");
            }
        });
        B4031.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4031");
            }
        });
        B4032.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4032");
            }
        });
        B4033.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4033");
            }
        });
        B4034.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4034");
            }
        });
        B4036.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4036");
            }
        });
        B4037.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4037");
            }
        });
        B4038.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4038");
            }
        });
        B4039.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4039");
            }
        });
        B5009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5009");
            }
        });
        B5031.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5031");
            }
        });
        B5032.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5032");
            }
        });
        B5033.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5033");
            }
        });
        B5034.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5034");
            }
        });
        B5035.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5035");
            }
        });
        B5039.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5039");
            }
        });
        B5001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                download("5001");
            }
        });
        B5038.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5038");
            }
        });
        B5039.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5039");
            }
        });
        B6009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6009");
            }
        });
        B6031.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6031");
            }
        });
        B6032.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6032");
            }
        });
        B6033.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6033");
            }
        });
        B6034.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6034");
            }
        });
        B6035.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6035");
            }
        });
        B6036.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6036");
            }
        });
        B6038.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6038");
            }
        });
        B6039.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6039");
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
                downloadFiles(ESyllabus.this,b,".pdf",DIRECTORY_DOWNLOADS,url);

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
