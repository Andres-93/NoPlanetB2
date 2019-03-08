package com.example.a21718908.noplanetb2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blogin);
    }

    public void pasar_main(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}
