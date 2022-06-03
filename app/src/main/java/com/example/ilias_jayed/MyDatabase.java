package com.example.ilias_jayed;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
}
