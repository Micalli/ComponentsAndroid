package com.example.fragmentsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bSair, bFrag1, bFrag2;
    Fragment frag1 = new Frangmento1();
    Fragment frag2 = new Fragmento2();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSair = findViewById(R.id.btnSair);
        bFrag1 = findViewById(R.id.btnFrag1);
        bFrag2 = findViewById(R.id.btnFrag2);

        bSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(frag1.isVisible()){
                    getSupportFragmentManager().beginTransaction().remove(frag1).commit();
                }

                if(frag2.isVisible()){
                    getSupportFragmentManager().beginTransaction().remove(frag2).commit();
                }

            }
        });
        bFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                getSupportFragmentManager().beginTransaction().replace(R.id.container,frag1).commit();

            }
        });
        bFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                getSupportFragmentManager().beginTransaction().replace(R.id.container, frag2).commit();

            }
        });

    }
}