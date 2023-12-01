package com.curso.android.app.practica.descargas_url;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import java.net.URL;

public class ImageDowloader extends AsyncTask<String, Integer, Bitmap>{

    private Bitmap ImagenDescargada = null;

    @Override
    protected Bitmap doInBackground(String... strings) {
        String URL_consulta = strings[0];
        try{
            URL consulta = new URL(URL_consulta);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return ImagenDescargada;
    }
}
