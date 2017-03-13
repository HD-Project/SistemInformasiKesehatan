package com.hanslagrovegmail.sisteminformasikesehatan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rs_terdekat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs_terdekat);
    }

    public void ke_daftar_rs(View view){
        Intent next = new Intent(rs_terdekat.this, daftar_rs.class);
        startActivity(next);
    }

    public void ke_menu_rs(View view){
        Intent next = new Intent(rs_terdekat.this, menu_rs.class);
        startActivity(next);
    }

}
