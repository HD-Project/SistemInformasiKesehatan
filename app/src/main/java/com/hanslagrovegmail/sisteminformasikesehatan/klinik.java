package com.hanslagrovegmail.sisteminformasikesehatan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class klinik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klinik);
    }

    public void ke_deskripsi_klinik (View view){
        Intent next = new Intent(klinik.this, deskripsi_klinik.class);
        startActivity(next);
    }
}
