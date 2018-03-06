package com.example.classes;

public class Salas {
	
	private int id;
	private String nomeDoTreino;
	private String descricaoLocalizacao;
	private int qtdPessoas;
	private String horario;
	private String contato;
	private String pessoasPrevistas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeDoTreino() {
		return nomeDoTreino;
	}
	public void setNomeDoTreino(String nomeDoTreino) {
		this.nomeDoTreino = nomeDoTreino;
	}
	public String getDescricaoLocalizacao() {
		return descricaoLocalizacao;
	}
	public void setDescricaoLocalizacao(String descricaoLocalizacao) {
		this.descricaoLocalizacao = descricaoLocalizacao;
	}
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getPessoasPrevistas() {
		return pessoasPrevistas;
	}
	public void setPessoasPrevistas(String pessoasPrevistas) {
		this.pessoasPrevistas = pessoasPrevistas;
	}
	   @Override
	    public String toString() {
	        // TODO Auto-generated method stub
	        return nomeDoTreino +"| Pessoas: "+ pessoasPrevistas;
	    }   
	
}
