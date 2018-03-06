package com.example.treino;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CidadeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cidade);		
		
	}
	@Override
	protected void onStart() {
		
		super.onStart();
		
		ArrayList<String> cidades = new ArrayList<String> ();
		cidades.add("Salvador");
		cidades.add("Irecê");
		cidades.add("Juazeiro");
		cidades.add("Feira de Santana");
		cidades.add("Cachoeira");	
		
		ListView enderecoCidade = (ListView) findViewById(R.id.listCidade);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cidades);
		
		enderecoCidade.setAdapter(adapter);
		
		enderecoCidade.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
				
				Intent i = new Intent(getApplicationContext(), SalasActivity.class);
		        i.putExtra("ID", id);
		        i.putExtra("POSICAO", position);
				startActivity(i);
			}
		});
		
	}

}
