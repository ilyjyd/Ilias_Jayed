package com.example.ilias_jayed;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class MyDatabase extends SQLiteOpenHelper {
    public static String DB_NAME="societe.db";
    public static String T_NAME="Societe";
    public static String COL1="id";
    public static String COL2="Raison_Sociale";
    public static String COL3="Secteur_activite";
    public static String COL4="nb_employe";
    public MyDatabase(Context c){
        super(c,DB_NAME,null,1);}
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String req="CREATE TABLE "+T_NAME+"("+COL1 +" integer primary key autoincrement,"+COL2 +" text,"+COL3+" text,"+COL4 +"double)";
        sqLiteDatabase.execSQL(req);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public static long AddSociete(SQLiteDatabase sqLiteDatabase, Societe e){
        ContentValues ct = new ContentValues();
        ct.put(COL2,e.getNom());
        ct.put(COL3,e.getSecteur_Activité());
        ct.put(COL4,e.getNombre_employe());
        return sqLiteDatabase.insert(T_NAME,null,ct);
    }

    public static long UpdateSociete(SQLiteDatabase db, Societe e){
        ContentValues c = new ContentValues();
        c.put(COL2,e.getNom());
        c.put(COL3,e.getSecteur_Activité());
        c.put(COL4,e.getNombre_employe());
        return db.update(T_NAME,c,"id="+e.getId(),null);
    }
    public static long DeleteSociete(SQLiteDatabase db, int id){
        return db.delete(T_NAME,"id="+id,null);
    }
    public static ArrayList<Societe> getAllSociete(SQLiteDatabase db){
        ArrayList<Societe> entr = new ArrayList<>();

        Cursor cur = db.rawQuery("SELECT * FROM " + T_NAME,null);

        while(cur.moveToNext()){
            Societe e= new Societe();
            e.setId(cur.getInt(0));
            e.setNom(cur.getString(1));
            e.setSecteur_Activité(cur.getString(2));
            e.setNombre_employe(cur.getDouble(3));
            entr.add(e);
        }

        return entr;
    }
    public static Societe getOneSociete(SQLiteDatabase db, int id){
        Societe e = null;

        Cursor cur = db.rawQuery("SELECT * FROM " + T_NAME + " WHERE id = " + id,null);

        if(cur.moveToNext()){
            e = new Societe();
            e.setId(cur.getInt(0));
            e.setNom(cur.getString(1));
            e.setSecteur_Activité(cur.getString(2));
            e.setNombre_employe(cur.getDouble(3));
        }

        return e;
    }
}
