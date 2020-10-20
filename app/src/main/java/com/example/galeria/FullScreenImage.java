package com.example.galeria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.galeria.Adaptadores.GaleriaImagenesAdapter;

public class FullScreenImage extends AppCompatActivity {
    ImageView imageViewDetqalle;
    GaleriaImagenesAdapter galeriaImagenesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);
        imageViewDetqalle=findViewById(R.id.imagen_detalle);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Full Screen Imagen");

        Intent i =getIntent();
        int posicion =i.getExtras().getInt("idimagen");
        galeriaImagenesAdapter=new GaleriaImagenesAdapter(this);
        imageViewDetqalle.setImageResource(
                galeriaImagenesAdapter.imagenesArray[posicion]
        );

    }
}