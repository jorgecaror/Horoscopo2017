package com.example.jorge.horoscopo2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Escorpion extends AppCompatActivity {
    TextView usua;
    Button vol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escorpion);
        usua=(TextView)findViewById(R.id.usuarioH);
        vol=(Button)findViewById(R.id.volver);

        Bundle bundle = getIntent().getExtras();
        usua.setText(bundle.getString("usuario"));

        vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Escorpion.this,Seleccionar.class);
                startActivity(i);
            }
        });
    }
}
