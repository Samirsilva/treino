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

public class VisualizarSalasSpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visualizar_salas_sp);
	}
	public void participar(View v){
		TextView nome = (TextView) findViewById(R.id.txtSp);
		
		Intent principal = new Intent(VisualizarSalasSpActivity.this, SalasSPActivity.class);
		Toast.makeText(this, "Sua participação foi confirmada em "+nome.getText().toString()+"" , Toast.LENGTH_LONG).show();
		startActivity(principal);
		finish();			
	}
	public void sair(View v){
		
		Intent principal = new Intent(VisualizarSalasSpActivity.this, SalasSPActivity.class);
		startActivity(principal);
		finish();			
	}	
}
