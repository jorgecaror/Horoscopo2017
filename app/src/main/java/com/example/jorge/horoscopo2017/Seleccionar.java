package com.example.jorge.horoscopo2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Seleccionar extends AppCompatActivity {
    ListView horos;
    TextView usuarioh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar);
        horos = (ListView)findViewById(R.id.ListaSignos);
        usuarioh = (TextView)findViewById(R.id.usu);

        Bundle bundle = getIntent().getExtras();
        usuarioh.setText(bundle.getString("usuario"));

        ArrayList<String> listHoro = new ArrayList<String>();

        listHoro.add("Aries");
        listHoro.add("Tauro");
        listHoro.add("Geminis");
        listHoro.add("Cancer");
        listHoro.add("Leo");
        listHoro.add("Virgo");
        listHoro.add("Libra");
        listHoro.add("Escorpión");
        listHoro.add("Sagitario");
        listHoro.add("Capricornio");
        listHoro.add("Acuario");
        listHoro.add("Piscis");

        ArrayAdapter adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listHoro);

        horos.setAdapter(adaptador);

        horos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String signo = parent.getItemAtPosition(i).toString();

                if(signo.equals("Aries")){
                    Intent in= new Intent(Seleccionar.this,Aries.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }else if(signo.equals("Tauro")){
                    Intent in= new Intent(Seleccionar.this,Tauro.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }else if(signo.equals("Geminis")){
                    Intent in= new Intent(Seleccionar.this,Geminis.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }else if(signo.equals("Cancer")){
                    Intent in= new Intent(Seleccionar.this,Cancer.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }else if(signo.equals("Leo")){
                    Intent in= new Intent(Seleccionar.this,Leo.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }else if(signo.equals("Virgo")){
                    Intent in= new Intent(Seleccionar.this,Virgo.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }else if(signo.equals("Libra")){
                    Intent in= new Intent(Seleccionar.this,Libra.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }else if(signo.equals("Escorpión")){
                    Intent in= new Intent(Seleccionar.this,Escorpion.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }else if(signo.equals("Sagitario")){
                    Intent in= new Intent(Seleccionar.this,Sagitario.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }else if(signo.equals("Capricornio")){
                    Intent in= new Intent(Seleccionar.this,Capricornio.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }else if(signo.equals("Acuario")){
                    Intent in= new Intent(Seleccionar.this,Acuario.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }else if(signo.equals("Piscis")){
                    Intent in= new Intent(Seleccionar.this,Piscis.class);
                    in.putExtra("usuario",usuarioh.getText().toString());
                    startActivity(in);
                }
            }
        });
    }
}
