package com.example.bencall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CallFailedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_failed);
    }

    public void Clickback(View view) {
        //콜벤 호출화면으로 이동
    }

    public void Recall(View view) {
        //콜밴 호출중인 화면,,,
    }

    public void Gomain(View view) {
        Intent intent = new Intent(getApplicationContext(), MMenuActivity.class);
        startActivity(intent);
    }
}
