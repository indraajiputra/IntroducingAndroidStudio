package com.example.indrapro.indraajiputra_1202152164_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Indra Pro on 2/3/2018.
 */

public class Main2Activity extends AppCompatActivity {
    TextView namamenu,porsi,restauran,total;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        Intent x=getIntent();

        String makanan=x.getStringExtra("makanan");
        namamenu = findViewById(R.id.kolom4);
        namamenu.setText(makanan);


        int jumlah=x.getIntExtra("porsi",0);
        porsi=findViewById(R.id.kolom8);
        porsi.setText(String.valueOf(jumlah));

        String tempat1 = x.getStringExtra("namarest");
        restauran =findViewById(R.id.kolom3);
        restauran.setText(tempat1);

        int hasil=x.getIntExtra("totalx",0);
        total = findViewById(R.id.kolom9);
        total.setText(String.valueOf(hasil));










    }
























}







