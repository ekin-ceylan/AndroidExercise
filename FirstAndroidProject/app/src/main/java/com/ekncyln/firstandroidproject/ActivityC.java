package com.ekncyln.firstandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {
    private Button btnGotoD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coklu_dil);

        btnGotoD = findViewById(R.id.btnGotoD);

        Kisiler gelenKisi = (Kisiler) getIntent().getSerializableExtra("Kisi");

        btnGotoD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentD = new Intent(ActivityC.this, ActivityD.class);

                startActivity(intentD);
            }
        });
    }
}