package com.example.a21718908.noplanetb2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class BSplash extends AppCompatActivity {

    TextView txt1;
    TextView txt2;
    ImageView img;
    ImageView fondo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsplash);



        img = findViewById(R.id.imageView);
        txt1 = findViewById(R.id.txtG);
        txt2 =findViewById(R.id.txtP);
        fondo = findViewById(R.id.imgFondo);


        Glide.with(this)
                .load(R.drawable.planetearth)
                .apply(new RequestOptions()
                        .centerCrop()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(fondo);


        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.animacion_alpha_aparecer);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.traslacion_y_zoom);


        img.startAnimation(myanim);
        txt1.startAnimation(myanim2);
        txt2.startAnimation(myanim2);
        openApp(true);
    }
    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash.this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }, 7000);
    }
}
