package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /* Deklarasi Layout activity_main name */

    Button btnMoveActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Inisiasi R.id Layout activity_main menjadi String ada MainActivity */

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
    }

    @Override
    public  void onClick(View v) {
        switch (v.getId()) {

            /*
            Deklarasi R.id.move_activity sebagai key untuk pindah halaman class
            dari MainActivity.class ke MoveActivity.class
            */

            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
        }
    }

}
