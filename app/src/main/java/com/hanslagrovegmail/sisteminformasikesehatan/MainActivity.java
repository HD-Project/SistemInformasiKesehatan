package com.hanslagrovegmail.sisteminformasikesehatan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

public class MainActivity extends AppCompatActivity {

    CircleMenu circleMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleMenu = (CircleMenu) findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.icon_menu, R.drawable.icon_cancel);
        circleMenu.addSubMenu(Color.parseColor("#258CFF"), R.drawable.icon_rs)
                .addSubMenu(Color.parseColor("#30A400"), R.drawable.icon_klinik)
                .addSubMenu(Color.parseColor("#FF4B32"), R.drawable.icon_forum)
                .addSubMenu(Color.parseColor("#8A39FF"), R.drawable.icon_regis)
                .addSubMenu(Color.parseColor("#FF6A00"), R.drawable.icon_apotek);

        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {

                                                 @Override
                                                 public void onMenuSelected(int index) {
                                                     switch (index) {
                                                         case 0:
                                                             Toast.makeText(MainActivity.this, "Menu Rumah Sakit telah dipilih", Toast.LENGTH_SHORT).show();

                                                             Handler handler = new Handler();
                                                             handler.postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                                     Intent next = new Intent(MainActivity.this, rs_terdekat.class);
                                                                     startActivity(next);
                                                                 }
                                                             },1000);

                                                             break;
                                                         case 1:
                                                             Toast.makeText(MainActivity.this, "Menu Klinik telah dipilih", Toast.LENGTH_SHORT).show();

                                                             Handler handler1 = new Handler();
                                                             handler1.postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                                     Intent next = new Intent(MainActivity.this, klinik.class);
                                                                     startActivity(next);
                                                                 }
                                                             },1000);

                                                             break;
                                                         case 2:
                                                             Toast.makeText(MainActivity.this, "Menu Forum telah dipilih", Toast.LENGTH_SHORT).show();

                                                             Handler handler2 = new Handler();
                                                             handler2.postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                                     Intent next = new Intent(MainActivity.this, forum.class);
                                                                     startActivity(next);
                                                                 }
                                                             },1000);

                                                             break;
                                                         case 3:
                                                             Toast.makeText(MainActivity.this, "Menu Registrasi telah dipilih", Toast.LENGTH_SHORT).show();

                                                             Handler handler3 = new Handler();
                                                             handler3.postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                                     Intent next = new Intent(MainActivity.this, registrasi.class);
                                                                     startActivity(next);
                                                                 }
                                                             },1000);

                                                             break;
                                                         case 4:
                                                             Toast.makeText(MainActivity.this, "Menu Apotek telah dipilih", Toast.LENGTH_SHORT).show();

                                                             Handler handler4 = new Handler();
                                                             handler4.postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                                     Intent next = new Intent(MainActivity.this, apotek.class);
                                                                     startActivity(next);
                                                                 }
                                                             },1000);

                                                             break;
                                                     }
                                                 }
                                             }

        );

        circleMenu.setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

                                                     @Override
                                                     public void onMenuOpened() {
                                                         //Toast.makeText(MainActivity.this, "Menu Opend", Toast.LENGTH_SHORT).show();
                                                     }

                                                     @Override
                                                     public void onMenuClosed() {
                                                         //Toast.makeText(MainActivity.this, "Menu Closed", Toast.LENGTH_SHORT).show();
                                                     }
                                                 }
        );

    }

    @Override
    public void onBackPressed() {
        if (circleMenu.isOpened())
            circleMenu.closeMenu();
        else
            finish();
    }

    public void ke_rs_terdekat(View view){
        Intent next = new Intent(MainActivity.this, rs_terdekat.class);
        startActivity(next);
    }
}
