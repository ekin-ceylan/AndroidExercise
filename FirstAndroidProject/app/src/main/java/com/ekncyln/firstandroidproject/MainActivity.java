package com.ekncyln.firstandroidproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnGotoB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.fragment_tutucu1, new FragmentBirinci());
        ft.add(R.id.fragment_Tutucu2, new FragmentIkinci());

        ft.commit();

        Log.e("Yaşam Döngüsü", "onCreate");
        btnGotoB = findViewById(R.id.gotob);

        btnGotoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentB = new Intent(MainActivity.this, ActivityB.class);
                intentB.putExtra("MainMessage", "Main'den gönderildi.");
                startActivity(intentB);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Yaşam Döngüsü", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Yaşam Döngüsü", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Yaşam Döngüsü", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Yaşam Döngüsü", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Yaşam Döngüsü", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Yaşam Döngüsü", "onRestart");
    }
}
