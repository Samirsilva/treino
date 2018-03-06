package com.example.treino;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CidadeSPActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cidade_sp);
	}
	@Override
	protected void onStart() {
		
		super.onStart();
		
		ArrayList<String> cidades = new ArrayList<String> ();
		cidades.add("Campinas");
		cidades.add("São Bernardo do Campo");
		cidades.add("São Paulo");
		cidades.add("Sorocaba");	
		
		ListView enderecoCidade = (ListView) findViewById(R.id.listCidadeSP);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cidades);
		
		enderecoCidade.setAdapter(adapter);
		
		enderecoCidade.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
				
				Intent i = new Intent(getApplicationContext(), SalasSPActivity.class);
		        i.putExtra("ID", id);
		        i.putExtra("POSICAO", position);
				startActivity(i);
			}
		});
		
	}
}
