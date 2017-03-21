package com.example.mike.taller1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    private EditText cajaNombre;
    private EditText cajaSegundoNombre;
    private EditText cajaApellido;
    private EditText cajaSegundoApellido;
    private EditText cajaEdad;
    private EditText cajaSexo;
    private Intent i;
    private Bundle b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaNombre = (EditText)findViewById(R.id.txtNombre);
        cajaSegundoNombre = (EditText)findViewById(R.id.txtSegundoNombre);
        cajaApellido = (EditText)findViewById(R.id.txtApellido);
        cajaSegundoApellido = (EditText)findViewById(R.id.txtSegundoApellido);
        cajaEdad = (EditText)findViewById(R.id.txtEdad);
        cajaSexo = (EditText)findViewById(R.id.txtSexo);

        i = new Intent(this,Mostrar.class);

        b = new Bundle();

    }

    public void mostrar(View v){
        String nomb, apell, segNom ,segApelli, edad , sexo;
        if(validar()) {
            //Tomo el valor que la persona ingresó tanto en nombre como en apellido
            nomb = cajaNombre.getText().toString();
            apell = cajaApellido.getText().toString();
            segNom = cajaSegundoNombre.getText().toString();
            segApelli = cajaSegundoApellido.getText().toString();
            edad = cajaEdad.getText().toString();
            sexo = cajaSexo.getText().toString();

            //Encapsulo los valores previamente tomados
            b.putString("Nombre", nomb);
            b.putString("Apellido", apell);
            b.putString("SegundoApellido", segApelli);
            b.putString("SegundoNombre", segNom);
            b.putString("Edad", edad);
            b.putString("Sexo", sexo);
            //Le paso al intent todos los datos en forma encapsulada con el bundle
            i.putExtras(b);
            //Arranco la actividad que le intent me diga
            startActivity(i);
        }
    }


    public boolean validar() {
        if (cajaNombre.getText().toString().isEmpty()) {
            cajaNombre.setError(getResources().getString(R.string.error_1));

            return false;
        }
        if (cajaApellido.getText().toString().isEmpty()) {
            cajaApellido.setError(getResources().getString(R.string.error_3));

            return false;
        }
        if (cajaSegundoNombre.getText().toString().isEmpty()) {
            cajaSegundoNombre.setError(getResources().getString(R.string.error_2));

            return false;
        }
        if (cajaSegundoApellido.getText().toString().isEmpty()){
            cajaSegundoApellido.setError(getResources().getString(R.string.error_4));

            return false;
        }
        if (cajaSexo.getText().toString().isEmpty()){
            cajaSexo.setError(getResources().getString(R.string.error_5));

            return false;
        }
        if (cajaEdad.getText().toString().isEmpty()){
            cajaEdad.setError(getResources().getString(R.string.error_6));

            return false;
        }
        return true;

    }


}
