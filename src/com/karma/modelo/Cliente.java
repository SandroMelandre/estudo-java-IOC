package com.karma.modelo;

public class Cliente {

	private String nome;
	private String email;
	private String telefone;
	
	private boolean ativo = false;

	public Cliente(String nome, String email, boolean ativo, String telefone) {

		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.ativo = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo() {
		this.ativo = true;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
