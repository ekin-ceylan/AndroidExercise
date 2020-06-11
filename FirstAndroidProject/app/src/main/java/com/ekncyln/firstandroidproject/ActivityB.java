package com.ekncyln.firstandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {
    private Button btnGotoC;
    private TextView gelenMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        String gelenMesaj = getIntent().getStringExtra("MainMessage");

        btnGotoC = findViewById(R.id.gotoc);
        gelenMessage = findViewById(R.id.gelenMessage);
        gelenMessage.setText(gelenMesaj);

        btnGotoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Kisiler kisi = new Kisiler(123456,"Ekin", 1.85);
                Intent intentC = new Intent(ActivityB.this, ActivityC.class);
                intentC.putExtra("Kisi", kisi);
                startActivity(intentC);
            }
        });
    }
}