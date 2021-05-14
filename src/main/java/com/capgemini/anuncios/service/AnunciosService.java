package com.capgemini.anuncios.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import com.capgemini.anuncios.model.Anuncio;
import com.capgemini.anuncios.repository.AnunciosRepository;




@Service
public class AnunciosService {
    @Autowired
	private AnunciosRepository repository;
    
    
    public Anuncio save(Anuncio a) {

    	return repository.save(a);
    }
    
    public List<Anuncio> listAll(){
    	return repository.findAll();
    }
    
    public Anuncio findOne(Long id) {
		
    	return repository.getOne(id);
    }
    public void remove(Long id) {
    	Anuncio a = repository.getOne(id);
		repository.delete(a);
    	
    }
    
    public void update(Anuncio a) {
    	repository.save(a);
    }
    
    public List<Anuncio> listByCliente(String cliente){
    	List<Anuncio> anuncios = new ArrayList<Anuncio>();
    	anuncios.addAll(repository.findAllByCliente(cliente));
    	return anuncios;
    }
    
    public List<Anuncio> listByData(Date inicio,Date fim){
    	List<Anuncio> anuncios = new ArrayList<Anuncio>();
    	System.out.println(anuncios.toString());
    	anuncios.addAll(repository.findAllByDataInicioAndDataFim(inicio, fim));
    	return anuncios;
    }
}
