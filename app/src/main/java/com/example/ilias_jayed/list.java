package com.example.ilias_jayed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class list extends AppCompatActivity {
    ListView lst;
    MyDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lst=findViewById(R.id.lst);
        db=new MyDatabase(this);
        ArrayList<Societe> e =MyDatabase.getAllSociete(db.getReadableDatabase());
        ArrayList<HashMap<String,Object>> h = new ArrayList<>();
        for(Societe ec : e){
            HashMap<String,Object> b =new HashMap<>();
            b.put("Societe",ec.getNom());
            b.put("employer",ec.getNombre_employe());
            h.add(b);
        }
        String[] from = {"Societe","employer"};
        int [] to ={R.id.txtnm,R.id.txtnb};
        SimpleAdapter b = new SimpleAdapter(this,h,R.layout.listsocieter,from,to);
        lst.setAdapter(b);
    }
}