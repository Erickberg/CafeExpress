package com.example.erick.cafeexpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Bebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);
    }
    public void onClick(View view){
        Intent i = new Intent(this, Refrescos.class);
        startActivity(i);
    }
}
