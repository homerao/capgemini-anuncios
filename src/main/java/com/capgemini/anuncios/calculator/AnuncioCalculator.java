package com.capgemini.anuncios.calculator;

public class AnuncioCalculator {
	
	
	
	
    public static int totalVisualizacoes(Double investimento) {
    	// obtem o valor inicial de visualizações por dinheiro investido
    	int visualizacoesIniciaisPorInvestimento = (int) Math.ceil((double)(investimento * 30));
    	// obtem os clicks iniciais do valor investido
    	int clicksIniciaisPorVisualizacoes = (int) (visualizacoesIniciaisPorInvestimento * 0.12);
    	// obtem os compartilhamentos
    	int compartilhamentosIniciais = (int) (clicksIniciaisPorVisualizacoes * 0.15);
    	int novasVisualizacoes =0;
        int novosClicks =0 ;
        int novosCompartilhamentos = 0;
        int totalDeVisualizacoes = 0;
        // este for é para simular os compartilhamentos em sequência
    	for(int i = 1; i <= 4; i++) {
    	   
    	   novasVisualizacoes = (int)  (compartilhamentosIniciais * 40)  ;
           novosClicks = (int)  (novasVisualizacoes * 0.12);
           novosCompartilhamentos = (int)  (novosClicks * 0.15);
           compartilhamentosIniciais = novosCompartilhamentos;
           totalDeVisualizacoes = totalDeVisualizacoes  + novasVisualizacoes;
           
    	}
        totalDeVisualizacoes = totalDeVisualizacoes + visualizacoesIniciaisPorInvestimento;
    	
    	return totalDeVisualizacoes;
    }
    
    public static int maximoDeCliques(Double investimento) {
		return 0;
    	
    }
    
    
    public static int maximoDeCompartilhamentos(Double investimento) {
		return 0;
    	
    }

}
