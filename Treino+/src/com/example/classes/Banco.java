package com.example.classes;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper{
      private static final String NOME_BANCO = "banco.db";
      private static final int VERSAO = 1;
      private Context context;
      
      
      public Banco(Context context) {
            super(context, NOME_BANCO, null, VERSAO);
      }

      
      @Override
      public void onCreate(SQLiteDatabase db) {
            String sql= "create table if not exists tabela1 ("
                      + "_id integer primary key autoincrement not null,"
                      + "nomeDoTreino varchar(80) not null,"
                      + "quantidadePessoas varchar(10) not null,"
                      + "descriDaLoc varchar(30) not null)";
            
            db.execSQL(sql);
            
      }

      @Override
      public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // TODO Auto-generated method stub
            
      }
      public void Salvar(Salas sala){
            if(sala != null){
                  String nomeDoTreino = sala.getNomeDoTreino();
                  String quantidadePessoas = sala.getPessoasPrevistas();
                  String descriDaLoc = sala.getDescricaoLocalizacao();
                  Integer id = sala.getId();
                  
                  ContentValues values = new ContentValues();
                  values.put("nomeDoTreino", nomeDoTreino);
                  values.put("quantidadePessoas", quantidadePessoas);
                  values.put("descriDaLoc", descriDaLoc);
                  
                  if(id == null){
                        getWritableDatabase().insert("tabela1", null, values);
                        
                  }else{
                        getWritableDatabase().update("tabela1", values, "_id="+id, null);
                  }                
                
            }            
      }
      
      public void apagar(int id){
            String sql = "delete from tabela1 where _id="+id;
            
            getWritableDatabase().execSQL(sql);
            
      }
      
      public List<Salas> listarSalasSsa(){
            List<Salas> sal = new ArrayList<Salas>();
            String sql = "select * from tabela1 order by nomeDoTreino";
            
            Cursor c = getReadableDatabase().rawQuery(sql, null);
            
            while(c.moveToNext()){
                  
                  String nomeDoTreino = c.getString(c.getColumnIndex("nomeDoTreino"));
                  String descriDaLoc = c.getString(c.getColumnIndex("descriDaLoc"));
                  String quantidadePessoas = c.getString(c.getColumnIndex("quantidadePessoas"));
                  Integer id = c.getInt(c.getColumnIndex("_id"));
                  
                  Salas sala = new Salas();
                  
                  sala.setNomeDoTreino(nomeDoTreino);
                  sala.setPessoasPrevistas(quantidadePessoas);
                  sala.setDescricaoLocalizacao(descriDaLoc);
                  sala.setId(id);
                  
                  sal.add(sala);
            }
                    
            return sal;
      }
      public List<Salas> listarSalasSp(){
            List<Salas> sal = new ArrayList<Salas>();
            String sql = "select * from tabela1 where descriDaLoc='sp' order by nomeDoTreino ";
            
            Cursor c = getReadableDatabase().rawQuery(sql, null);
            
            while(c.moveToNext()){
                  
                  String nomeDoTreino = c.getString(c.getColumnIndex("nomeDoTreino"));
                  String descriDaLoc = c.getString(c.getColumnIndex("descriDaLoc"));
                  String quantidadePessoas = c.getString(c.getColumnIndex("quantidadePessoas"));
                  Integer id = c.getInt(c.getColumnIndex("_id"));
                  
                  Salas sala = new Salas();
                  
                  sala.setNomeDoTreino(nomeDoTreino);
                  sala.setPessoasPrevistas(quantidadePessoas);
                  sala.setDescricaoLocalizacao(descriDaLoc);
                  sala.setId(id);
                  
                  sal.add(sala);
            }
                    
            return sal;
      
}
      public List<Salas> listarSalasRj(){
            List<Salas> sal = new ArrayList<Salas>();
            String sql = "select * from tabela1 where descriDaLoc='rj' order by nomeDoTreino";
            
            Cursor c = getReadableDatabase().rawQuery(sql, null);
            
            while(c.moveToNext()){
                  
                  String nomeDoTreino = c.getString(c.getColumnIndex("nomeDoTreino"));
                  String descriDaLoc = c.getString(c.getColumnIndex("descriDaLoc"));
                  String quantidadePessoas = c.getString(c.getColumnIndex("quantidadePessoas"));
                  Integer id = c.getInt(c.getColumnIndex("_id"));
                  
                  Salas sala = new Salas();
                  
                  sala.setNomeDoTreino(nomeDoTreino);
                  sala.setPessoasPrevistas(quantidadePessoas);
                  sala.setDescricaoLocalizacao(descriDaLoc);
                  sala.setId(id);
                  
                  sal.add(sala);
            }
                    
            return sal;
      }      
}
