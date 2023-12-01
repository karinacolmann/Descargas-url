package com.curso.android.app.practica.descargas_url;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;

public class ImageDowloader extends AsyncTask<String, Integer, Bitmap>{

    private Bitmap ImagenDescargada = null;

    @Override
    protected Bitmap doInBackground(String... strings) {
        return ImagenDescargada;
    }
}