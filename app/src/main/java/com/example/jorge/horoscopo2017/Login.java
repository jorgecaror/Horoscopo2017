package com.example.jorge.horoscopo2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Login extends AppCompatActivity {
    EditText edUsuario;
    EditText edPassword;
    Button btningresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edUsuario=(EditText)findViewById(R.id.usuario);
        edPassword=(EditText)findViewById(R.id.password);
        btningresar=(Button)findViewById(R.id.ingresar);

        Usuario usu1 = new Usuario("jorge","12345");
        Usuario usu2 = new Usuario("mauricio","12345");
        Usuario usu3 = new Usuario("felipe","12345");
        Usuario usu4 = new Usuario("eduardo","12345");
        Usuario usu5 = new Usuario("camilo","12345");


        final ArrayList<Usuario> listUsuario = new ArrayList<Usuario>();

        listUsuario.add(usu1);
        listUsuario.add(usu2);
        listUsuario.add(usu3);
        listUsuario.add(usu4);
        listUsuario.add(usu5);

        btningresar.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                for (int i = 0; i<listUsuario.size();i++) {

                    if (edUsuario.getText().toString().equals(listUsuario.get(i).getNombre()) && edPassword.getText().toString().equals(listUsuario.get(i).getClave())){

                        Intent in = new Intent(Login.this,Seleccionar.class);
                        in.putExtra("usuario",listUsuario.get(i).getNombre());
                        startActivity(in);

                    }else{
                       Toast.makeText(getBaseContext(),"Usuario no Registrado",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
