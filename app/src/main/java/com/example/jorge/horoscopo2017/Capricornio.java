package com.example.jorge.horoscopo2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Capricornio extends AppCompatActivity {
    TextView usua;
    Button vol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capricornio);
        usua=(TextView)findViewById(R.id.usuarioH);
        vol=(Button)findViewById(R.id.volver);

        Bundle bundle = getIntent().getExtras();
        usua.setText(bundle.getString("usuario"));

        vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Capricornio.this,Seleccionar.class);
                i.putExtra("usuario",usua.getText());
                startActivity(i);
            }
        });
    }
}
