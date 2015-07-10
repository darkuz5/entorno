package com.d5.entorno;
 

import android.content.Context; 
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper; 
import android.location.LocationManager; 

public class SQLiteHelper extends SQLiteOpenHelper {
	
	LocationManager mLocationManager;

    String seccion    = "CREATE TABLE if not exists seccion (id varchar(100), nombre TEXT)";    
    String subsecc    = "CREATE TABLE if not exists subsecc (id varchar(100), nombre TEXT)";   
    String autor      = "CREATE TABLE if not exists autor   (id varchar(100), nombre TEXT)"; 
    String notasp     = "CREATE TABLE if not exists notap   (id varchar(100), titulo varchar(500),"
    		+ "resumen text, texto text, autor varchar(100), seccion  varchar(100), subseccion  varchar(100),"
    		+ "fecha varchar(100), hora  varchar(100), posicion  varchar(100), url  varchar(500), foto1  varchar(100),"
    		+ "foto1img blob, foto2  varchar(100), foto2img blob, foto3  varchar(100), foto3img blob)";
    String notas      = "CREATE TABLE if not exists nota    (id varchar(100), titulo varchar(500),"
    		+ "resumen text, texto text, autor varchar(100), seccion  varchar(100), subseccion  varchar(100),"
    		+ "fecha varchar(100), hora  varchar(100), posicion  varchar(100), url  varchar(500), foto1  varchar(100),"
    		+ "foto1img blob, foto2  varchar(100), foto2img blob, foto3  varchar(100), foto3img blob)";
    String columnap  = "create table if no exists columnap (id varchar(100), idn varchar(100), titulo varchar(1000),"
    		+ "texto text, fecha varchar(100), hora varchar(100), seccion varchar(500), autor varchar(500), orden varchar(100),"
    		+ "url varchar(500), foto varchar(300), fotoimg blob)";
    String columna   = "create table if no exists columna  (id varchar(100), idn varchar(100), titulo varchar(1000),"
    		+ "texto text, fecha varchar(100), hora varchar(100), seccion varchar(500), autor varchar(500), orden varchar(100),"
    		+ "url varchar(500), foto varchar(300), fotoimg blob)";
    
	 
  
    public SQLiteHelper(Context contexto, String nombre,
                               CursorFactory factory, int version) {
        super(contexto, nombre, factory, version);
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) { 
        db.execSQL(seccion);  
        db.execSQL(subsecc);  
        db.execSQL(autor);  
        db.execSQL(notasp);  
        db.execSQL(notas);  
        db.execSQL(columnap);  
        db.execSQL(columna);   
        
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva) { 
        db.execSQL(seccion);  
        db.execSQL(subsecc);  
        db.execSQL(autor);  
        db.execSQL(notasp);  
        db.execSQL(notas);  
        db.execSQL(columnap);  
        db.execSQL(columna);  
        
    }
 
   
}
