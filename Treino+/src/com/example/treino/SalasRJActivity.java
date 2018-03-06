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

public class SalasRJActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_salas_rj);
	}
	protected void onStart() {
		
		super.onStart();
		
		ArrayList<String> salasRj = new ArrayList<String> ();
		salasRj.add("Corrida em copacabana, 16:00");
		salasRj.add("Volei de praia. 12:00");
		salasRj.add("Treino de rua, 22:00");	
		
		ListView enderecoSalasRj = (ListView) findViewById(R.id.listSalasRj);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, salasRj);
		
		enderecoSalasRj.setAdapter(adapter);
		
		enderecoSalasRj.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
				
				Intent i = new Intent(getApplicationContext(), VisualizarSalasRjActivity.class);
				startActivity(i);
			}
		});
		
	}	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.salas_rj, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int id = item.getItemId();
		Builder builder = new AlertDialog.Builder(SalasRJActivity.this);
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
		
		Intent i = new Intent(SalasRJActivity.this, CriarsalaActivity.class);
		startActivity(i);
				
		
	}
	public void AcessarSala(View v){
		Intent i = new Intent(SalasRJActivity.this, ViewSalaActivity.class);
		startActivity(i);
	}
	//Interface do Dialog ok
	DialogInterface.OnClickListener onClikOkAlert = new DialogInterface.OnClickListener(){
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			Intent i = new Intent(SalasRJActivity.this, InstrucoesActivity.class);
			startActivity(i);					
		}
	};	
	DialogInterface.OnClickListener onClikSairConta = new DialogInterface.OnClickListener(){
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			Intent i = new Intent(SalasRJActivity.this, MainActivity.class);
			startActivity(i);
			finish();					
		}
	};	
}
