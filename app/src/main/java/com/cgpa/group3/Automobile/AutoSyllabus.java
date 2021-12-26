package com.cgpa.group3.Automobile;

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

public class AutoSyllabus extends AppCompatActivity {

    FirebaseStorage firebaseStorage;
    StorageReference storageReference,ref;

    Button B1001,B1002,B1003,B1004,B1008,B1009,
            B2001,B2002,B2003,B2004,B2005,B2007,B2008,B2009,B2051,B2059
            ,B3021,B3024,B3051,B3052,B3057,B3058,B3059,B3001,
            B4051,B4052,B4053,B4055,B4056,B4057,B4058,B4059,
            B5001,B5009,B5051,B5052,B5057,B5058,B5059,B5053,B5055,B5054,
            B6009,B6053,B6052,B6025,B6054,B6055,B6058,B6059,B6051;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_syllabus);
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
        B2051 = findViewById(R.id.b2051);
        B2059 = findViewById(R.id.b2059);

        B3001 = findViewById(R.id.b3001);
        B3021 =findViewById(R.id.b3021);
        B3052 = findViewById(R.id.b3052);
        B3051 = findViewById(R.id.b3051);
        B3024 = findViewById(R.id.b3024);
        B3059 = findViewById(R.id.b3059);
        B3057 = findViewById(R.id.b3057);
        B3058 = findViewById(R.id.b3058);

        B4051 = findViewById(R.id.b4051);
        B4053 =findViewById(R.id.b4053);
        B4052 = findViewById(R.id.b4052);
        B4053 = findViewById(R.id.b4053);
        B4055 = findViewById(R.id.b4055);
        B4056 = findViewById(R.id.b4056);
        B4057 = findViewById(R.id.b4057);
        B4058 = findViewById(R.id.b4058);

        B5009 = findViewById(R.id.b5009);
        B5051 =findViewById(R.id.b5051);
        B5053 = findViewById(R.id.b5053);
        B5054 = findViewById(R.id.b5054);
        B5055 = findViewById(R.id.b5055);
        B5057 = findViewById(R.id.b5057);
        B5058 = findViewById(R.id.b5058);
        B5052 = findViewById(R.id.b5052);
        B5059 = findViewById(R.id.b5059);

        B6009 = findViewById(R.id.b6009);
        B6053 =findViewById(R.id.b6053);
        B6052 = findViewById(R.id.b6052);
        B6051 = findViewById(R.id.b6051);
        B6025 = findViewById(R.id.b6025);
        B6054 = findViewById(R.id.b6054);
        B6055 = findViewById(R.id.b6055);
        B6058 = findViewById(R.id.b6058);
        B6059 = findViewById(R.id.b6059);


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
        B3052.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3052");
            }
        });
        B3051.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3051");
            }
        });
        B3024.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3024");
            }
        });
        B3058.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3058");
            }
        });
        B3021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3021");
            }
        });
        B3059.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3059");
            }
        });
        B3057.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3057");
            }
        });
        B4051.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4051");
            }
        });
        B4053.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4053");
            }
        });
        B4052.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4052");
            }
        });
        B4053.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4053");
            }
        });
        B4055.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4055");
            }
        });
        B4056.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4056");
            }
        });
        B4057.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4057");
            }
        });
        B4058.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4058");
            }
        });
        B5009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5009");
            }
        });
        B5051.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5051");
            }
        });
        B5052.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5052");
            }
        });
        B5053.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5053");
            }
        });
        B5054.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5054");
            }
        });
        B5055.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5055");
            }
        });
        B5057.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5057");
            }
        });
        B5058.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5058");
            }
        });

        B5059.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5059");
            }
        });


        B6009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6009");
            }
        });
        B6053.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6053");
            }
        });
        B6052.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6052");
            }
        });
        B6051.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6051");
            }
        });
        B6025.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6025");
            }
        });
        B6054.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6054");
            }
        });
        B6055.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6055");
            }
        });
        B6058.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6058");
            }
        });
        B6059.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6059");
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
                downloadFiles(AutoSyllabus.this,b,".pdf",DIRECTORY_DOWNLOADS,url);

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
