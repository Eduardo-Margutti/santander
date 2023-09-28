package com.api.internet.banking.model.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

public class ClienteDTO {

	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Boolean isExclusivo;
	
	@NotNull
	private BigDecimal saldo;
	
	@NotNull
	private String numeroConta;
	
	@NotNull
	private Date dataNascimento;

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

	public Boolean getIsExclusivo() {
		return isExclusivo;
	}

	public void setIsExclusivo(Boolean isExclusivo) {
		this.isExclusivo = isExclusivo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}

