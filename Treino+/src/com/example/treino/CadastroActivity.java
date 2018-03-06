package com.example.treino;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends Activity {
	private EditText edtNome;
	private EditText edtEmail;
	private EditText edtLogin;
	private EditText edtSenha;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro);
		edtNome 		= (EditText) findViewById(R.id.edtNome);
		edtEmail 		= (EditText) findViewById(R.id.edtEmail);
		edtLogin 		= (EditText) findViewById(R.id.edtLogin);
		edtSenha 		= (EditText) findViewById(R.id.edtSenha);		
		
	}

	public void CadastrarAluno(View v){
		
		String nome 		= edtNome.getText().toString();
		String email		= edtEmail.getText().toString();
		String login 		= edtLogin.getText().toString();
		String senha 		= edtSenha.getText().toString();	
		
		Intent t = new Intent(CadastroActivity.this, EstadoActivity.class);
		if(nome.equals("") && email.equals("") && login.equals("") && senha.equals("")){		
			Toast.makeText(this, "Erro. Campos vazios!", Toast.LENGTH_LONG).show();	
		}else if(nome.equals("")){
			Toast.makeText(this, "Erro. Nome vazio!", Toast.LENGTH_LONG).show();
		}else if(email.equals("")){
			Toast.makeText(this, "Erro. Email vazio!", Toast.LENGTH_LONG).show();
		}else if(login.equals("")){
			Toast.makeText(this, "Erro. Login vazio!", Toast.LENGTH_LONG).show();
		}else if(senha.equals("")){
			Toast.makeText(this, "Erro. Senha vazia!", Toast.LENGTH_LONG).show();
		}else{
			
//			b.salvarAluno(nome, email, login, senha);
//			startActivity(t);
//			finish();
			
		}
		
		
	}
}
