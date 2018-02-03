package com.example.indrapro.indraajiputra_1202152164_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText namamenu, porsi;
    private Button eatbus1;
    private Button abnormal1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namamenu = (EditText) findViewById(R.id.kolom1);
        porsi = (EditText) findViewById(R.id.kolom2);
        abnormal1 = (Button) findViewById(R.id.abnormal1);
        eatbus1 = (Button) findViewById(R.id.eatbus1);


    }


    public void pindah(View view) {

        int uang = 65500;
        Intent i = new Intent(this, Main2Activity.class);


        String makanan = namamenu.getText().toString();
        i.putExtra("makanan", makanan);

//                String jumlah=porsi.getText().toString();
//                i.putExtra("porsi",jumlah);

        int jumlah1 = Integer.parseInt(porsi.getText().toString());
        int total = 30000 * jumlah1;

        i.putExtra("totalx", total);

        i.putExtra("porsi", jumlah1);

        String namarest = abnormal1.getText().toString();
        i.putExtra("namarest", namarest);


        startActivity(i);
        if (total > uang) {
            Toast.makeText(this, "uang kamu tidak mencukupi", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "makan disini coy,uang mu mencukupi", Toast.LENGTH_LONG).show();
        }


    }

    public void pindah1(View view) {


        int uang = 65500;
        Intent i = new Intent(this, Main2Activity.class);


        String makanan = namamenu.getText().toString();
        i.putExtra("makanan", makanan);

//                String jumlah=porsi.getText().toString();
//                i.putExtra("porsi",jumlah);

        int jumlah1 = Integer.parseInt(porsi.getText().toString());
        int total = 50000 * jumlah1;

        i.putExtra("totalx", total);

        i.putExtra("porsi", jumlah1);

        String namarest = eatbus1.getText().toString();
        i.putExtra("namarest", namarest);


        startActivity(i);
        if (total > uang) {
            Toast.makeText(this, "uang kamu tidak mencukupi", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "makan disini coy,uang mu mencukupi", Toast.LENGTH_LONG).show();
        }


    }
}



