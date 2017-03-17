package com.hanslagrovegmail.sisteminformasikesehatan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class apotek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apotek);
    }

    public void ke_deskripsi_apotik (View view){
        Intent next = new Intent(apotek.this, deskripsiApotek.class);
        startActivity(next);
    }
}
