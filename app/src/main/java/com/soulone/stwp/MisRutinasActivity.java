package com.soulone.stwp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.soulone.stwp.ui.misrutinas.MisRutinasFragment;

public class MisRutinasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mis_rutinas_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MisRutinasFragment.newInstance())
                    .commitNow();
        }
    }
}
