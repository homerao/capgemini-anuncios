package com.capgemini.anuncios.controller;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.anuncios.model.Anuncio;
import com.capgemini.anuncios.service.AnunciosService;




@Controller
@RequestMapping(path = "/anuncios")
public class AnunciosController {
	@Autowired
	private AnunciosService service;
	// rota que envia para o formulário de cadastro
	@RequestMapping(method = RequestMethod.GET,path = "/cadastro")
	public String anuncios() {
		
		return "anuncios/cadastro";
	}
	// rota que salva os dados do formulário
	@RequestMapping(method = RequestMethod.POST,path = "/cadastro-save")
	public String anuncioSave( Anuncio anuncio) {
		System.out.println(anuncio);
	    service.save(anuncio);

		return "redirect:/anuncios/listall";
	}
	
	@RequestMapping( method = RequestMethod.GET, path = "/list")
	public ModelAndView anunciosList() {
		 ModelAndView v = new ModelAndView("anuncios/anuncioslist");
		 v.addObject("anuncios",service.listAll() );
		 
		 return v;
	}
	
	@RequestMapping( method = RequestMethod.GET, path = "/listall")
	public ModelAndView anunciosListAll() {
	    ModelAndView v = new ModelAndView("anuncios/anuncioslist");
	    v.addObject("anuncios",service.listAll() );
		return v;
	}
	
	@RequestMapping( method = RequestMethod.GET, path = "/listbyclientes")
	public ModelAndView anunciosListByCliente(@RequestParam("cliente") String cliente) {
	    ModelAndView v = new ModelAndView("anuncios/anuncioslist");
	    v.addObject("anuncios",service.listByCliente(cliente));
		return v;
	}
	
	@RequestMapping( method = RequestMethod.GET, path = "/listbydata")
	public ModelAndView anunciosListByCliente(@RequestParam("dataInicio")@DateTimeFormat(pattern = "yyyy-MM-dd")  Date dataInicio, @RequestParam("dataFim") @DateTimeFormat(pattern = "yyyy-MM-dd")  Date dataFim) {
	    ModelAndView v = new ModelAndView("anuncios/anuncioslist");
	    v.addObject("anuncios", service.listByData(dataInicio, dataFim));
		return v;
	}
	
	@RequestMapping( method = {RequestMethod.GET, RequestMethod.DELETE}, path = "/deletar/{id}")
	public String anunciosDelete(@PathVariable("id") Long id) {
		System.out.println("Remover foi utilizado \n\n\n\n");
	    service.remove(id);
		return "redirect:/anuncios/listall";
	}
	
	
	@RequestMapping( method = {RequestMethod.GET}, path = "/atualizar/{id}")
	public ModelAndView anunciosUpdate(@PathVariable("id") Long id) {
    ModelAndView v = new ModelAndView("anuncios/update");
    v.addObject("anuncio", service.findOne(id));
		return v;
	}
	
	@RequestMapping( method = {RequestMethod.POST}, path = "/update-save")
	public String anunciosUpdate(Anuncio a) {
		System.out.println(a);
        service.update(a);
		return "redirect:/anuncios/listall";
	}

}
