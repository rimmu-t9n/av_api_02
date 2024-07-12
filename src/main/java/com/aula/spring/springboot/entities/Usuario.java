package com.aula.spring.springboot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;    

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column (nullable = false)
	private String nome, email, senha;
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}

	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}

	public String getSenha() {return senha;}
	public void setSenha(String senha) {this.senha = senha;}

	public Usuario() {}
	public Usuario(Integer id, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
}