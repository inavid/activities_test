package com.dfuentes.tareaactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class confirmacion_datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);

        //Elementos vista
        TextView tvnombre = (TextView) findViewById(R.id.tvNombre);
        TextView tvfecha = (TextView) findViewById(R.id.tvFechab);
        TextView tvtelefono = (TextView) findViewById(R.id.tvTelefono);
        TextView tvemail = (TextView) findViewById(R.id.tvEmail);
        TextView tvdescripcion = (TextView) findViewById(R.id.tvDescripcion);


        //Obtencion de datos de vista anterior
        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("Nombre");
        String fecha = parametros.getString("Fecha");
        String telefono = parametros.getString("Telefono");
        String email = parametros.getString("Email");
        String descripcion = parametros.getString("Descripcion");

        //Se ponen los datos recibidos
        tvnombre.setText(nombre);
        tvfecha.setText(fecha);
        tvtelefono.setText(telefono);
        tvemail.setText(email);
        tvdescripcion.setText(descripcion);
    }
}
