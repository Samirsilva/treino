package com.example.treino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class VisualizarSalasSsaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visualizar_salas_ssa);
	}
	public void participar(View v){
		TextView nome = (TextView) findViewById(R.id.txtSSa);
		
		Intent principal = new Intent(VisualizarSalasSsaActivity.this, SalasActivity.class);
		Toast.makeText(this, "Sua participação foi confirmada em "+nome.getText().toString()+"" , Toast.LENGTH_LONG).show();
		startActivity(principal);
		finish();			
	}
	public void sair(View v){
		
		Intent principal = new Intent(VisualizarSalasSsaActivity.this, SalasActivity.class);
		startActivity(principal);
		finish();			
	}	
}
