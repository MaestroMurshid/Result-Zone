package com.cgpa.group3.Computer;

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

public class Syllabus extends AppCompatActivity {

    FirebaseStorage firebaseStorage;
    StorageReference storageReference,ref;

    Button B1001,B1002,B1003,B1004,B1008,B1009,
            B2001,B2002,B2003,B2004,B2005,B2007,B2008,B2009,B2131,B2139
            ,B3001,B3131,B3132,B3133,B3134,B3137,B3138,B3139,
            B4131,B4132,B4133,B4134,B4136,B4137,B4138,B4139,
            B5009,B5001,B5131,B5132,B5133,B5134,B5135,B5136,B5137,B5138,B5139,
            B6009,B6131,B6132,B6133,B6134,B6135,B6136,B6138,B6139;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
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
        B2131 = findViewById(R.id.b2131);
        B2139 = findViewById(R.id.b2139);

        B3001 = findViewById(R.id.b3001);
        B3131 =findViewById(R.id.b3131);
        B3132 = findViewById(R.id.b3132);
        B3133 = findViewById(R.id.b3133);
        B3134 = findViewById(R.id.b3134);
        B3137 = findViewById(R.id.b3137);
        B3138 = findViewById(R.id.b3138);
        B3139 = findViewById(R.id.b3139);

        B4131 = findViewById(R.id.b4131);
        B4132 =findViewById(R.id.b4132);
        B4133 = findViewById(R.id.b4133);
        B4134 = findViewById(R.id.b4134);
        B4136 = findViewById(R.id.b4136);
        B4137 = findViewById(R.id.b4137);
        B4138 = findViewById(R.id.b4138);
        B4139 = findViewById(R.id.b4139);

        B5001 = findViewById(R.id.b5001);
        B5009 = findViewById(R.id.b5009);
        B5131 =findViewById(R.id.b5131);
        B5132 = findViewById(R.id.b5132);
        B5133 = findViewById(R.id.b5133);
        B5134 = findViewById(R.id.b5134);
        B5135 = findViewById(R.id.b5135);
        B5136 = findViewById(R.id.b5136);
        B5137 = findViewById(R.id.b5137);
        B5138 = findViewById(R.id.b5138);
        B5139 = findViewById(R.id.b5139);

        B6009 = findViewById(R.id.b6009);
        B6131 =findViewById(R.id.b6131);
        B6132 = findViewById(R.id.b6132);
        B6133 = findViewById(R.id.b6133);
        B6134 = findViewById(R.id.b6134);
        B6135 = findViewById(R.id.b6135);
        B6136 = findViewById(R.id.b6136);
        B6138 = findViewById(R.id.b6138);
        B6139 = findViewById(R.id.b6139);


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
        B2131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                download("2131");
            }
        });
        B2139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                download("2139");
            }
        });
        B3001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3001");
            }
        });
        B3131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3131");
            }
        });
        B3132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3132");
            }
        });
        B3133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3133");
            }
        });
        B3134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3134");
            }
        });
        B3137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3137");
            }
        });
        B3138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3138");
            }
        });
        B3139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3139");
            }
        });
        B4131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4131");
            }
        });
        B4132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4132");
            }
        });
        B4133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4133");
            }
        });
        B4134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4134");
            }
        });
        B4136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4136");
            }
        });
        B4137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4137");
            }
        });
        B4138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4138");
            }
        });
        B4139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4139");
            }
        });
        B5001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5001");
            }
        });
        B5009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5009");
            }
        });
        B5131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5131");
            }
        });
        B5132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5132");
            }
        });
        B5133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5133");
            }
        });
        B5134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5134");
            }
        });
        B5135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5135");
            }
        });
        B5136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5136");
            }
        });
        B5137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5137");
            }
        });
        B5138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5138");
            }
        });
        B5139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5139");
            }
        });
        B6009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6009");
            }
        });
        B6131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6131");
            }
        });
        B6132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6132");
            }
        });
        B6133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6133");
            }
        });
        B6134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6134");
            }
        });
        B6135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6135");
            }
        });
        B6136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6136");
            }
        });
        B6138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6138");
            }
        });
        B6139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6139");
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
                downloadFiles(Syllabus.this,b,".pdf",DIRECTORY_DOWNLOADS,url);

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
