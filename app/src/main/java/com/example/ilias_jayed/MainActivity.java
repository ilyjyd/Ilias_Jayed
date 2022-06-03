package com.example.ilias_jayed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void affiche(View view) {
        Intent j=null;
        switch (view.getId()){
            case R.id.btn1:j=new Intent(MainActivity.this,Ajouter.class);break;
            case R.id.btn2:j=new Intent(MainActivity.this,Modifier.class);break;
            case R.id.btn3:j=new Intent(MainActivity.this,Liste.class);break;
        }
        startActivity(j);
    }
}