package com.hanslagrovegmail.sisteminformasikesehatan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class post_saya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_saya);
    }

    public void ke_detail_post_saya (View view){
        Intent next = new Intent(post_saya.this, detail_post_saya.class);
        startActivity(next);
    }
}
