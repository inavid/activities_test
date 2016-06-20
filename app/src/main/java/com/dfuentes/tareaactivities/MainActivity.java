package com.dfuentes.tareaactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nombre   = (EditText)findViewById(R.id.tietNombre);
        final EditText fecha   = (EditText)findViewById(R.id.date);
        final EditText telefono   = (EditText)findViewById(R.id.tietTelefono);
        final EditText email   = (EditText)findViewById(R.id.tietEmail);
        final EditText descripcion   = (EditText)findViewById(R.id.tietDescripcion);
        Button button= (Button) findViewById(R.id.btnEjemplo);
        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, confirmacion_datos.class);
                intent.putExtra("Nombre", nombre.getText().toString());
                intent.putExtra("Fecha", fecha.getText().toString());
                intent.putExtra("Telefono", telefono.getText().toString());
                intent.putExtra("Email", email.getText().toString());
                intent.putExtra("Descripcion", descripcion.getText().toString());
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
