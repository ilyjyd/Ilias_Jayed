package com.example.ilias_jayed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ajoute extends AppCompatActivity {
    EditText txt1,txt2,txt3;
    MyDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajoute);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        db=new MyDatabase(this);
    }
    public void annuler(View view) {
        finish();
    }

    public void enregistrer(View view) {
        Societe c = new Societe();

        c.setNom(txt1.getText().toString());
        c.setSecteur_Activité(txt2.getText().toString());
        c.setNombre_employe(Double.parseDouble(txt3.getText().toString()));

        if(MyDatabase.AddSociete(db.getWritableDatabase(),c)==-1)
            Toast.makeText(this, "echoue", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "reussie", Toast.LENGTH_SHORT).show();
    }
}