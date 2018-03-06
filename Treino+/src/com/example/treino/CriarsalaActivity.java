package com.example.treino;

import java.util.ArrayList;
import java.util.List;

import com.example.classes.Banco;
import com.example.classes.Salas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CriarsalaActivity extends Activity {
      Salas sala;
      List<Salas> salass;
      
      EditText nomeTreino;
      EditText descLocalidade;
      EditText qtdPessoas;
      EditText horario;
      EditText contato;
      Button btnCriarSala;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_sala);
		
	      nomeTreino  = (EditText) findViewById(R.id.edtNomeDoTreino);
	      descLocalidade = (EditText) findViewById(R.id.edtDescLocalizacao);
	      qtdPessoas  = (EditText) findViewById(R.id.edtQtdPessoas);
	      horario         = (EditText) findViewById(R.id.edtHorario);
	      contato         = (EditText) findViewById(R.id.edtContato);
	}

	
	public void CriarSala(View a){
				
		if(nomeTreino.getText().toString().equals("") && descLocalidade.getText().toString().equals("") 
				&& qtdPessoas.getText().toString().equals("") && horario.getText().toString().equals("")
				&& contato.getText().toString().equals("")){
					Toast.makeText(this, "Erro. Campos vazios!", Toast.LENGTH_LONG).show();
		}else if(nomeTreino.getText().toString().equals("")){
			Toast.makeText(this, "Erro. Nome do treino vazio!", Toast.LENGTH_LONG).show();
		}else if(descLocalidade.getText().toString().equals("")){
			Toast.makeText(this, "Erro. Localidade vazia!", Toast.LENGTH_LONG).show();
		}else if(qtdPessoas.getText().toString().equals("")){
			Toast.makeText(this, "Erro. Quantidade de pessoas vazia!", Toast.LENGTH_LONG).show();
		}else if(horario.getText().toString().equals("")){
			Toast.makeText(this, "Erro. Horário vazio!", Toast.LENGTH_LONG).show();
		}else if(contato.getText().toString().equals("")){
			Toast.makeText(this, "Erro. Contato vazio!", Toast.LENGTH_LONG).show();
		}else{
            Intent i = new Intent(CriarsalaActivity.this, EstadoActivity.class);
            startActivity(i);
            finish();
			Toast.makeText(this, "Treino "+nomeTreino.getText().toString()+ "as "+horario.getText().toString()+ " cadastrado!", Toast.LENGTH_LONG).show();
		}
		
	}

}
