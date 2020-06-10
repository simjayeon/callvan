package com.example.bencall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class S_StartActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s__start);
    }


    public void cancel(View view) {
        Toast.makeText( getApplicationContext(), "호출이 취소되었습니다.", Toast.LENGTH_SHORT ).show();
        Intent intent = new Intent( S_StartActivity.this, MapsActivity.class );
        startActivity( intent );
    }
}
