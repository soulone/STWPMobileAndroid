package com.soulone.stwp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
//import com.google.firebase.auth.FirebaseAuth;

public class SingUpActivity extends AppCompatActivity {

    private TextInputLayout usuarioText;
    private Button singUpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        usuarioText = findViewById(R.id.su_input_usuario);
        singUpButton =  findViewById(R.id.SingUpButton);

        singUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registro();
            }
        });

    }



    public void Registro() {
        if (usuarioText.toString().isEmpty()) {
            Toast.makeText(this, "Escriba todos los datos correctamente", Toast.LENGTH_SHORT).show();
            usuarioText.requestFocus();
        }else {
            Intent intent =  new Intent(this, RutinasActivity.class);
            startActivity(intent);
        }
    }
}