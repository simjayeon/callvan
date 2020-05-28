package com.example.bencall;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

public class PaytableActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paytable);
    }

    public void Clickback(View view) {
        Intent intent = new Intent(getApplicationContext(), MMenuActivity.class);
        startActivity(intent);
    }
}
