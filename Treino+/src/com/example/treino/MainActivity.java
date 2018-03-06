package com.example.treino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	
	public void Acessar(View v){
		
		Intent principal = new Intent(MainActivity.this, EstadoActivity.class);
		
		EditText login = (EditText) findViewById(R.id.edtLogin);
		EditText senha = (EditText) findViewById(R.id.edtSenha);

		if(login.getText().toString().equals("") || senha.getText().toString().equals("") ){		
			Toast.makeText(this, "Erro. Campos vazios!", Toast.LENGTH_LONG).show();	
		}
		
		if(login.getText().toString().equals("Administrador")){
			if(senha.getText().toString().equals("123456")){
				Toast.makeText(this, "Bom treino "+login.getText().toString()+"" , Toast.LENGTH_LONG).show();
				startActivity(principal);
				finish();
			}else{
				Toast.makeText(this, "Erro. Senha inválida!", Toast.LENGTH_LONG).show();	
			}
		}else{
			Toast.makeText(this, "Erro. Login inválido!", Toast.LENGTH_LONG).show();
		}
		
	}
	
	public void Cadastro(View s){
		Intent cadastro = new Intent(MainActivity.this, CadastroActivity.class);
		startActivity(cadastro);
		
	}

}
