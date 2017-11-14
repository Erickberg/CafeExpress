package com.example.erick.cafeexpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) findViewById(R.id.button);
        Button two = (Button) findViewById(R.id.button2);
        Button three = (Button) findViewById(R.id.button3);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
    }
    @Override
    public void onClick (View v){

        switch(v.getId()){

            case R.id.button:
            startActivity(new Intent(MainActivity.this, Comidas.class));

            break;
            case R.id.button2:
                startActivity(new Intent(MainActivity.this, Bebidas.class));

                break;
            case R.id.button3:
                startActivity(new Intent(MainActivity.this, Botanas.class));

                break;
        }
    }
}