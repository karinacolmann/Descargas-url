package com.curso.android.app.practica.descargas_url;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class ImageDowloader extends AsyncTask<String, Integer, Bitmap>{

    private Bitmap imagenDescargada = null;
    private ImageView imageView;

    public ImageDowloader(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    protected Bitmap doInBackground(String... strings) {
        String URL_consulta = strings[0];
        try{
            URL consulta = new URL(URL_consulta);
            InputStream contenido = (InputStream) consulta.getContent();
            this.imagenDescargada = BitmapFactory.decodeStream(contenido);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return imagenDescargada;
    }

    protected void onPostExecute(Bitmap bitmap){
        super.onPostExecute(bitmap);

        if(imagenDescargada == null) return;

        this.imageView.setImageBitmap(bitmap);

    }

}
