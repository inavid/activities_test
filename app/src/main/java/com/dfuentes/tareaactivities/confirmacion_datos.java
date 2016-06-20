package com.dfuentes.tareaactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class confirmacion_datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);

        //Elementos vista
        Button edicion = (Button) findViewById(R.id.btnEdicion);
        TextView tvnombre = (TextView) findViewById(R.id.tvNombre);
        TextView tvfecha = (TextView) findViewById(R.id.tvFechab);
        TextView tvtelefono = (TextView) findViewById(R.id.tvTelefono);
        TextView tvemail = (TextView) findViewById(R.id.tvEmail);
        TextView tvdescripcion = (TextView) findViewById(R.id.tvDescripcion);


        //Obtencion de datos de vista anterior
        Bundle parametros = getIntent().getExtras();
        final String nombre = parametros.getString("Nombre");
        final String fecha = parametros.getString("Fecha");
        final String telefono = parametros.getString("Telefono");
        final String email = parametros.getString("Email");
        final String descripcion = parametros.getString("Descripcion");

        //Se ponen los datos recibidos
        tvnombre.setText(nombre);
        tvfecha.setText(fecha);
        tvtelefono.setText(telefono);
        tvemail.setText(email);
        tvdescripcion.setText(descripcion);

        assert edicion != null;
        edicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(confirmacion_datos.this, MainActivity.class);
                intent.putExtra("Nombre", nombre);
                intent.putExtra("Fecha", fecha);
                intent.putExtra("Telefono", telefono);
                intent.putExtra("Email", email);
                intent.putExtra("Descripcion", descripcion);
                startActivity(intent);
            }
        });
    }
}
