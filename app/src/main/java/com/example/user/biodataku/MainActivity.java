package com.example.user.biodataku;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void phone (View view){
        Uri uri = Uri.parse("tel:0082324343810");
        Intent it = new Intent (Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void maps (View view){
        Uri uri = Uri.parse("geo:-6.979849, 110.410165");
        Intent it = new Intent (android.content.Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void email (View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"alvianieva079@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android Studio");

        try {
            startActivity(Intent.createChooser(intent, "Kirim Email?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}
