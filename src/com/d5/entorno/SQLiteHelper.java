package com.d5.entorno;
 

import android.content.Context; 
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper; 
import android.location.LocationManager; 

public class SQLiteHelper extends SQLiteOpenHelper {
	
	LocationManager mLocationManager;
  
    String activo    = "CREATE TABLE if not exists medidas (id varchar(100), nombre TEXT)";    
	String insertaD  = "insert into medidas (id,nombre) values ('1','0')";
	String insertaE  = "insert into medidas (id,nombre) values ('3','0')";
	String insertaN  = "insert into medidas (id,nombre) values ('5','1')";
	String insertaI  = "insert into medidas (id,nombre) values ('7','0')";
	String noticias  = "CREATE TABLE if not exists noticias (id varchar(100), titulo TEXT, resumen TEXT, texto TEXT, foto varchar(200), fotomini varchar(200), pie TEXT, "
			+ "seccion varchar(200), fecha varchar(150), ofecha varchar(150), hora varchar(100) )";
	String notificacion  = "CREATE TABLE if not exists notificacion (id varchar(100), titulo TEXT, resumen TEXT, texto TEXT, foto varchar(200), fotomini varchar(200), pie TEXT, "
			+ "seccion varchar(200), fecha varchar(150), ofecha varchar(150), hora varchar(100) )";
	String tw = "CREATE TABLE if not exists twitter (id varchar(200), nombre TEXT)";   
 
    public SQLiteHelper(Context contexto, String nombre,
                               CursorFactory factory, int version) {
        super(contexto, nombre, factory, version);
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) { 
        db.execSQL(activo);  
        db.execSQL(notificacion);  
        db.execSQL(noticias);  
        db.execSQL(tw);  
        Cursor checa=db.rawQuery("select * from medidas where id='1'", null);
        if (checa.getCount() < 1 ) {
        	db.execSQL(insertaD);
        	db.execSQL(insertaE);
        	db.execSQL(insertaN);
        	db.execSQL(insertaI);
        }
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva) { 
        db.execSQL(activo);
        db.execSQL(notificacion);  
        db.execSQL(noticias); 
        db.execSQL(tw);  
        Cursor checa=db.rawQuery("select * from medidas where id='1'", null);
        if (checa.getCount() < 1 ) {
        	db.execSQL(insertaD);
        	db.execSQL(insertaE);
        	db.execSQL(insertaN);
        	db.execSQL(insertaI);
        }
        
    }
 
   
}
