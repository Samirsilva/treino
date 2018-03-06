package com.example.treino;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class PerfilActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_perfil);
//	    EditText nome = (EditText) findViewById(R.id.edtNomeP);
//	    EditText email = (EditText) findViewById(R.id.edtEmailP);
//	    EditText login = (EditText) findViewById(R.id.edtLoginP);
//	    EditText senha = (EditText) findViewById(R.id.edtSenhaP);
//
//	    Intent i = getIntent();
//	    
//	    String nomeNew = i.getExtras().get("CadNome").toString();
//	    String emailNew = i.getExtras().get("CadEmail").toString();
//	    String loginNew = i.getExtras().get("CadLogin").toString();
//	    String senhaNew = i.getExtras().get("CadSenha").toString(); 
//	    
//		nome.setText(nomeNew.toString());
//		email.setText(emailNew.toString());
//		login.setText(loginNew.toString());
//		senha.setText(senhaNew.toString());		
	}
	
	public void limparDados(View l){
        EditText nome = (EditText) findViewById(R.id.edtNomeP);
        EditText email = (EditText) findViewById(R.id.edtEmailP);
        EditText login = (EditText) findViewById(R.id.edtLoginP);
        EditText senha = (EditText) findViewById(R.id.edtSenhaP);
	    
		nome.setText("".toString());
		email.setText("".toString());
		login.setText("".toString());
		senha.setText("".toString());		
	}
	
	public void editarConta(View e){
		
		
	}
	
	public void deletarConta(View d){
		
		
	}

}
