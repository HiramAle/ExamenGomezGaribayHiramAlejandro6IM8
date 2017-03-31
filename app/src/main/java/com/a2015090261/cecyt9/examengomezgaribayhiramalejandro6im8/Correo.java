package com.a2015090261.cecyt9.examengomezgaribayhiramalejandro6im8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by magic on 30/03/2017.
 */

public class Correo extends Activity {
    Double NumeroRec;
    TextView Muestrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Muestrame = (TextView) findViewById(R.id.Muestrame);
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();
        NumeroRec = recibe.getDouble("Numero");
        Muestrame.setText("Nombre: Gomez Garibay Hiram Alejandro" + "\n" +
                "Resultado: " + NumeroRec.toString()
        );
    }

    public void Compartir(View correo)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Examen");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo: Gomez Garibay Hiram Alejandro :3 :3 ;)   Resultado: " + NumeroRec );
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "magicalex@outlook.es"} );
        startActivity(intent);
    }
}
