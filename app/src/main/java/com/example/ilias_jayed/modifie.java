package com.example.ilias_jayed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class modifie extends AppCompatActivity {
    Spinner spnr;
    MyDatabase db;
    EditText txt1,txt2,txt3;
    ArrayList<Societe> soc;
    ArrayAdapter n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifie);
        spnr=findViewById(R.id.spnr);
        txt1=findViewById(R.id.txt1);
        soc= MyDatabase.getAllSociete(db.getReadableDatabase());
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        db=new MyDatabase(this);
        ArrayList<Societe> a =MyDatabase.getAllSociete(db.getReadableDatabase());
        ArrayList<String> s =new ArrayList<>();
        for(Societe e : a){
            s.add(e.getId()+"-"+e.getNom());
        }
        n = new ArrayAdapter(this,R.layout.activity_modifie,s);
        spnr.setAdapter(n);
        spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Societe p = soc.get(i);
                txt1.setText(p.getNom());
                txt2.setText(p.getSecteur_Activité());
                txt3.setText(String.format("%f",p.getNombre_employe()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}