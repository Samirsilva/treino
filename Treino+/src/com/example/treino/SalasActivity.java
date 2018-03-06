package com.example.treino;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SalasActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_salas);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.salas, menu);
		return true;
	}
	protected void onStart() {
		
		super.onStart();
		
		ArrayList<String> salasSSa = new ArrayList<String> ();
		salasSSa.add("Ciclismo no dique, 18:00");
		salasSSa.add("Futebol na orla. 18:30");
		salasSSa.add("Treino na Smart fit, 21:00");
		salasSSa.add("Workout com personal FREE, 22,00");	
		
		ListView enderecoSalasSsa = (ListView) findViewById(R.id.listSalasSsa);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, salasSSa);
		
		enderecoSalasSsa.setAdapter(adapter);
		
		enderecoSalasSsa.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
				
				Intent i = new Intent(getApplicationContext(), VisualizarSalasSsaActivity.class);
				startActivity(i);
			}
		});
		
	}	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int id = item.getItemId();
		Builder builder = new AlertDialog.Builder(SalasActivity.this);
		if (id == R.id.action_settings) {	
			builder.setMessage("Você tem certeza que deseja sair da conta?");
			builder.setTitle("Sair da conta");
			builder.setPositiveButton("Sair", onClikSairConta);
			builder.setNegativeButton("Cancelar",null);
			AlertDialog alerta = builder.create();
			alerta.show();				
		}else if(id == R.id.action_instrucoes){			
			builder.setMessage("Todas as Instruções do App são de extrema importancia,"
					+ " lembre-se de segui-las corretamente.");
			builder.setTitle("Instruções");
			builder.setPositiveButton("Eu entendi", onClikOkAlert);	
			AlertDialog alerta = builder.create();
			alerta.show();			
		}else{	
		
			return super.onOptionsItemSelected(item);
		
		}
		return true;
	}
	public void CriarSala(View a){
		
		Intent i = new Intent(SalasActivity.this, CriarsalaActivity.class);
		startActivity(i);
				
		
	}
	public void AcessarSala(View v){
		Intent i = new Intent(SalasActivity.this, ViewSalaActivity.class);
		startActivity(i);
	}
	//Interface do Dialog ok
	DialogInterface.OnClickListener onClikOkAlert = new DialogInterface.OnClickListener(){
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			Intent i = new Intent(SalasActivity.this, InstrucoesActivity.class);
			startActivity(i);					
		}
	};	
	DialogInterface.OnClickListener onClikSairConta = new DialogInterface.OnClickListener(){
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			Intent i = new Intent(SalasActivity.this, MainActivity.class);
			startActivity(i);
			finish();					
		}
	};		

}
