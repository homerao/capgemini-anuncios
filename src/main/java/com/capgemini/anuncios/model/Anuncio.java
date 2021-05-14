package com.capgemini.anuncios.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "ANUNCIOS")
@Table(name = "ANUNCIOS")

public class Anuncio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9166562239314117619L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NOME_ANUNCIO", length = 40)
	private String nomeAnuncio;
	@Column(name = "CLIENTE", length = 50)
	private String cliente;
	@Column(name = "DATA_INICIO")
	@Temporal(value = TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataInicio;
	@Column(name = "DATA_FIM")
	@Temporal(value = TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataFim;
	@Column(name = "INVESTIMENTO_DIARIO")
	private BigDecimal investimentoDiario;
	
	
	public Anuncio() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}





	public String getNomeAnuncio() {
		return nomeAnuncio;
	}


	public void setNomeAnuncio(String nomeAnuncio) {
		this.nomeAnuncio = nomeAnuncio;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public Date getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Date getDataFim() {
		return dataFim;
	}


	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}


	public BigDecimal getInvestimentoDiario() {
		return investimentoDiario;
	}


	public void setInvestimentoDiario(BigDecimal investimentoDiario) {
		this.investimentoDiario = investimentoDiario;
	}
	
	@Override
	public String toString() {
		
		return "Nome Anuncio "+ this.nomeAnuncio + " Cliente" + this.cliente + " Data Inicio "+ this.dataInicio + " Data fim" + this.dataFim;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.equals(obj);
	}
	

}
