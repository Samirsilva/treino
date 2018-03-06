package com.example.treino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class VisualizarSalasRjActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visualizar_salas_rj);
	}
	public void participar(View v){
		TextView nome = (TextView) findViewById(R.id.txtCopa);
		
		Intent principal = new Intent(VisualizarSalasRjActivity.this, SalasRJActivity.class);
		Toast.makeText(this, "Sua participação foi confirmada em "+nome.getText().toString()+"" , Toast.LENGTH_LONG).show();
		startActivity(principal);
		finish();			
	}
	public void sair(View v){
		
		Intent principal = new Intent(VisualizarSalasRjActivity.this, SalasRJActivity.class);
		startActivity(principal);
		finish();			
	}	
}
