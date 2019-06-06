package com.example.gerenciamentocliente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewLogin;
    TextView textViewSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        textViewLogin = findViewById( R.id.textViewLogin );
        textViewSenha = findViewById( R.id.textViewLogin );

        textViewSenha.setInputType( InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);


    }
}
