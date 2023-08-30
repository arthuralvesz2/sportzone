package com.itb.tcc.sportzone.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
public class Pessoa {

	private Long id;
	private String nome;
	private String rg;
	private String telefone;
	private String endereço;
	private String logradouro;
	private String cep;
	private String bairro;
	private String uf;
	private LocalDateTime dataNasc;
	private boolean codStatusPessoa;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
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
