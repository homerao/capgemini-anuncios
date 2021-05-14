package com.capgemini.anuncios.calculator;

import java.math.BigDecimal;

import com.capgemini.anuncios.model.Anuncio;
import com.fasterxml.jackson.datatype.jsr310.ser.MonthDaySerializer;

public class AnuncioReport {
	
	private String cliente;
	private String nomeAnuncio;
	private int qtdDiasInvestimento;
	private BigDecimal valorDiario;
	private BigDecimal valorTotal;
	private int qtdCliques;
	private int qtdCompartilhamentos;
	private int qtdVisualizacoes;
	private int totalCliques;
	private int totalCompartilhamentos;
	private int totalVisualizacoes;
	
	
	public AnuncioReport() {
		// TODO Auto-generated constructor stub
	}
	
	public void reportFill(Anuncio a) {
	  this.cliente = a.getCliente();
	  this.nomeAnuncio = a.getNomeAnuncio();
	  this.qtdDiasInvestimento = (int)((a.getDataFim().getTime()/(1000*60*60*24)) - (a.getDataInicio().getTime()/(1000*60*60*24)));
	  System.out.println(qtdDiasInvestimento);
	  this.valorDiario = a.getInvestimentoDiario();
	  this.valorTotal = valorDiario.multiply(BigDecimal.valueOf((double)qtdDiasInvestimento));
	  this.qtdCliques = AnuncioCalculator.maximoDeCliques(a.getInvestimentoDiario().doubleValue());
	  this.qtdCompartilhamentos = AnuncioCalculator.maximoDeCompartilhamentos(a.getInvestimentoDiario().doubleValue());
	  this.qtdVisualizacoes = AnuncioCalculator.totalVisualizacoes(a.getInvestimentoDiario().doubleValue());
	  this.totalCliques = qtdDiasInvestimento * this.qtdCliques;
	  this.totalCompartilhamentos = this.qtdCompartilhamentos * this.qtdDiasInvestimento;
	  this.totalVisualizacoes = this.qtdVisualizacoes * this.qtdDiasInvestimento;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getNomeAnuncio() {
		return nomeAnuncio;
	}


	public void setNomeAnuncio(String nomeAnuncio) {
		this.nomeAnuncio = nomeAnuncio;
	}


	public long getQtdDiasInvestimento() {
		return qtdDiasInvestimento;
	}


	public void setQtdDiasInvestimento(int qtdDiasInvestimento) {
		this.qtdDiasInvestimento = qtdDiasInvestimento;
	}


	public BigDecimal getValorDiario() {
		return valorDiario;
	}


	public void setValorDiario(BigDecimal valorDiario) {
		this.valorDiario = valorDiario;
	}


	public BigDecimal getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}


	public int getQtdCliques() {
		return qtdCliques;
	}


	public void setQtdCliques(int qtdCliques) {
		this.qtdCliques = qtdCliques;
	}


	public int getQtdCompartilhamentos() {
		return qtdCompartilhamentos;
	}


	public void setQtdCompartilhamentos(int qtdCompartilhamentos) {
		this.qtdCompartilhamentos = qtdCompartilhamentos;
	}


	public int getQtdVisualizacoes() {
		return qtdVisualizacoes;
	}


	public void setQtdVisualizacoes(int qtdVisualizacoes) {
		this.qtdVisualizacoes = qtdVisualizacoes;
	}

	public int getTotalCliques() {
		return totalCliques;
	}

	public void setTotalCliques(int totalCliques) {
		this.totalCliques = totalCliques;
	}

	public int getTotalCompartilhamentos() {
		return totalCompartilhamentos;
	}

	public void setTotalCompartilhamentos(int totalCompartilhamentos) {
		this.totalCompartilhamentos = totalCompartilhamentos;
	}

	public int getTotalVisualizacoes() {
		return totalVisualizacoes;
	}

	public void setTotalVisualizacoes(int totalVisualizacoes) {
		this.totalVisualizacoes = totalVisualizacoes;
	}
	
	

}
