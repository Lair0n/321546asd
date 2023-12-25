package com.example.bechikov_v_10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class notifications extends AppCompatActivity {
    public void onClickPers(View view) {
        startActivity(new Intent(this, personal_area.class));
    }
}

