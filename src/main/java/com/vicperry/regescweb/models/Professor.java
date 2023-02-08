package com.vicperry.regescweb.models;

import java.math.BigDecimal;
import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	@Column(nullable = false)
	private String nome;
	private BigDecimal salario;
	@Enumerated(EnumType.STRING)
	private StatusProfessor status;
	
	public Professor() {}

	
	public Professor(String nome, BigDecimal salario, StatusProfessor status) {
		this.nome = nome;
		this.salario = salario;
		this.status = status;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public StatusProfessor getStatus() {
		return status;
	}

	public void setStatus(StatusProfessor status) {
		this.status = status;
	}

	
	
}
