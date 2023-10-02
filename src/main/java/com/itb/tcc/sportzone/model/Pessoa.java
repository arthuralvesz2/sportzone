package com.itb.tcc.sportzone.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="pessoas")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String email;
	private String senha;
	private String nome;
	private String cpf;
	private String telefone;
	private LocalDateTime dataNasc;
	private boolean codStatusPessoa;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDateTime getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDateTime dataNasc) {
		this.dataNasc = dataNasc;
	}
	public boolean getCodStatusPessoa() {
		return codStatusPessoa;
	}
	public void setCodStatusPessoa(boolean codStatusPessoa) {
		this.codStatusPessoa = codStatusPessoa;
	}
}