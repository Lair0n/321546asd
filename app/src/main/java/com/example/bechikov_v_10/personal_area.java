package com.example.bechikov_v_10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class personal_area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
    }
    public void onClickNoti(View view) {
        startActivity(new Intent(this, notifications.class));
    }
    public void onClickInter(View v){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com")));
    }
    public void onClickLogin(View view) {
        startActivity(new Intent(this, Login.class));
    }
}
