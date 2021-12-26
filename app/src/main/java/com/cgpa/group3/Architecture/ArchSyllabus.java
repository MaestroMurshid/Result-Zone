package com.cgpa.group3.Architecture;

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

public class ArchSyllabus extends AppCompatActivity {

    FirebaseStorage firebaseStorage;
    StorageReference storageReference,ref;

    Button B1001,B1002,B1003,B1004,B1008,B1009,
            B2001,B2002,B2003,B2004,B2005,B2007,B2008,B2009,B2181,B2189
            ,B3013,B3182,B3011,B3181,B3183,B3001,B3188,B3189,
            B4014,B4183,B4181,B4182,B4186,B4187,B4188,B4189,
            B5012,B5015,B5181,B5016,B5184,B5182,B5183,B5189,B5009,
            B6009,B6013,B6181,B6183,B6184,B6185,B6182,B6189,B6188;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arch_syllabus);
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
        B2181 = findViewById(R.id.b2181);
        B2189 = findViewById(R.id.b2189);

        B3001 = findViewById(R.id.b3001);
        B3013 =findViewById(R.id.b3013);
        B3011 = findViewById(R.id.b3011);
        B3182 = findViewById(R.id.b3182);
        B3183 = findViewById(R.id.b3183);
        B3188 = findViewById(R.id.b3188);
        B3189 = findViewById(R.id.b3189);
        B3181 = findViewById(R.id.b3181);

        B4014 = findViewById(R.id.b4014);
        B4183 =findViewById(R.id.b4183);
        B4181 = findViewById(R.id.b4181);
        B4182 = findViewById(R.id.b4182);
        B4186 = findViewById(R.id.b4186);
        B4187 = findViewById(R.id.b4187);
        B4188 = findViewById(R.id.b4188);
        B4189 = findViewById(R.id.b4189);

        B5009 = findViewById(R.id.b5009);
        B5012 =findViewById(R.id.b5012);
        B5181 = findViewById(R.id.b5181);
        B5016 = findViewById(R.id.b5016);
        B5184 = findViewById(R.id.b5184);
        B5182 = findViewById(R.id.b5182);
        B5183 = findViewById(R.id.b5183);
        B5015 = findViewById(R.id.b5015);
        B5189 = findViewById(R.id.b5189);

        B6009 = findViewById(R.id.b6009);
        B6013 =findViewById(R.id.b6013);
        B6181 = findViewById(R.id.b6181);
        B6183 = findViewById(R.id.b6183);
        B6184 = findViewById(R.id.b6184);
        B6185 = findViewById(R.id.b6185);
        B6182 = findViewById(R.id.b6182);
        B6189 = findViewById(R.id.b6189);
        B6188 = findViewById(R.id.b6188);


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
        B3182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3182");
            }
        });
        B3011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3011");
            }
        });
        B3181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3181");
            }
        });
        B3183.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3183");
            }
        });
        B3188.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3188");
            }
        });
        B3189.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("3189");
            }
        });
        B4014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4014");
            }
        });
        B4183.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4183");
            }
        });
        B4181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4181");
            }
        });
        B4182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4182");
            }
        });
        B4186.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4186");
            }
        });
        B4187.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4187");
            }
        });
        B4188.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4188");
            }
        });
        B4189.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("4189");
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
        B5181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5181");
            }
        });
        B5016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5016");
            }
        });
        B5184.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5184");
            }
        });
        B5182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5182");
            }
        });
        B5183.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5183");
            }
        });

        B5189.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("5189");
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
        B6181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6181");
            }
        });
        B6183.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6183");
            }
        });
        B6184.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6184");
            }
        });
        B6185.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6185");
            }
        });
        B6182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6182");
            }
        });
        B6189.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6189");
            }
        });
        B6188.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                download("6188");
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
                downloadFiles(ArchSyllabus.this,b,".pdf",DIRECTORY_DOWNLOADS,url);

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
