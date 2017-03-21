package com.example.mike.taller1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Mostrar extends AppCompatActivity {

    private TextView mostrar;
    private Bundle b;
    private String aux, nomb, apell, segNom, segApell, edad, sexo;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        mostrar = (TextView)findViewById(R.id.txtMostrar);
        b = getIntent().getExtras();
        nomb = b.getString("Nombre");
        apell = b.getString("Apellido");
        segApell = b.getString("SegundoApellido");
        segNom = b.getString("SegundoNombre");
        edad = b.getString("Edad");
        sexo = b.getString("Sexo");
        res = this.getResources();

        aux = res.getString(R.string.Saludo)+" "+nomb+" "+segNom+" "+apell+" "+segApell+ " "
                +res.getString(R.string.Tu)+" "+res.getString(R.string.Edad)+res.getString(R.string.Es)+" "+ edad+" "+
                res.getString(R.string.Y_)+res.getString(R.string.Tu)+ res.getString(R.string.Sexo) + res.getString(R.string.Es)+sexo;
    }
}
