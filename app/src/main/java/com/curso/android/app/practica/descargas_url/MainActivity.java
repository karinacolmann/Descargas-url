package com.curso.android.app.practica.descargas_url;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void download(View v){
    ImageDowloader descarga = new ImageDowloader();
    descarga.execute("https://cdn.akamai.steamstatic.com/steam/apps/813780/capsule_616x353.jpg?t=1699054682");
    }

    public void Free(View view) {
        Intent intent1 = new Intent(this, MainActivity2.class);
        startActivity(intent1);
    }


}