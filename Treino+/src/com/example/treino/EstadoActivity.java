package com.example.treino;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.classes.Estado;

public class EstadoActivity extends Activity {
	private List<Estado> estados = new ArrayList<Estado> ();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_estado);
		
		Estado estado0 = new Estado(0,"Bahia","BA");
		Estado estado1 = new Estado(1,"Rio de Janeiro","RJ");
		Estado estado2 = new Estado(2,"São Paulo","SP");
		estados.add(estado0);
		estados.add(estado1);
		estados.add(estado2);
		
		ListView enderecoEstado = (ListView) findViewById(R.id.listEstado);
		
		ArrayAdapter<Estado> adapter = new ArrayAdapter<Estado>(this, android.R.layout.simple_list_item_1, estados);
		
		enderecoEstado.setAdapter(adapter);		
		enderecoEstado.setOnItemClickListener(clickCurto);
		
	}

	OnItemLongClickListener clickLongo = new OnItemLongClickListener() {

		@Override
		public boolean onItemLongClick(AdapterView<?> parent, View view,
				int position, long id) {
			return false;
		}
	};
	
	OnItemClickListener clickCurto = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			if(position == 0){
				Intent intent = new Intent(getApplicationContext(), CidadeActivity.class);
				startActivity(intent);	
			}else if(position == 1){
				Intent intent = new Intent(getApplicationContext(), CidadeRJActivity.class);
				startActivity(intent);
			}else if(position == 2){
				Intent intent = new Intent(getApplicationContext(), CidadeSPActivity.class);
				startActivity(intent);
			}			

		}
	};	
	
	
}
