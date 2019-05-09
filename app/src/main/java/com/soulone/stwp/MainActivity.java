package com.soulone.stwp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    Button si;
    Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        si=findViewById(R.id.button);
        no=findViewById(R.id.mainNobutton);

        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }


    public void register(){
        Intent intent =  new Intent(this, SingUpActivity.class);
        startActivity(intent);
    }

    public void login(){
        Intent intent =  new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
}
