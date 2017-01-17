package com.example.midominio.miprimeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botonsaludo;
    TextView textviewsaludo, textviewpage;
    EditText edittextnombre;
    String nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonsaludo = (Button) findViewById(R.id.BotonSaludo);
        edittextnombre = (EditText) findViewById(R.id.EditTextNombre);
        textviewsaludo = (TextView) findViewById(R.id.TextViewSaludo);
        textviewpage = (TextView) findViewById(R.id.TextViewPB);
        textviewpage.setText("programmingblocks.com");

        botonsaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittextnombre.getText().length()>0){
                    nombre = edittextnombre.getText().toString();
                    textviewsaludo.setText("Hola "+nombre);
                } else {
                    textviewsaludo.setText("Ingresa tu nombre");
                }


            }
        });
    }
}
