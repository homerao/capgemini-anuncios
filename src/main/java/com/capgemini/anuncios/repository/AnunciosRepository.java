package com.capgemini.anuncios.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.anuncios.model.Anuncio;


@Repository
public interface AnunciosRepository  extends JpaRepository<Anuncio, Long>{
	
   @Query("SELECT A FROM ANUNCIOS A WHERE A.cliente LIKE %:CLIENTE%")
	List<Anuncio> findAllByCliente(@Param("CLIENTE") String cliente);
   //SELECT * FROM ANUNCIOS  where data_inicio between '2021-05-04' and '2021-05-14' or data_fim between '2021-05-04' and '2021-05-14'
   @Query("SELECT A FROM ANUNCIOS A WHERE A.dataInicio BETWEEN :dataInicio AND  :dataFim OR A.dataFim BETWEEN :dataInicio AND :dataFim")
	List<Anuncio> findAllByDataInicioAndDataFim(@Param("dataInicio") Date dataInicio, @Param("dataFim") Date DataFim);
}
