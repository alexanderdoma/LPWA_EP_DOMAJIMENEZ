package api.cinestar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.cinestar.model.Cine;
import api.cinestar.model.Pelicula;
import api.cinestar.repository.ICine;
import api.cinestar.repository.IPelicula;

@RestController
@RequestMapping
public class PeliculaController {

	@Autowired
	private IPelicula iPelicula;
	
	@Autowired
	private ICine iCine;
	
	@GetMapping("/peliculas")
	public List<Pelicula> getPeliculas(){
		return (List<Pelicula>) iPelicula.findAll();
	}
	
	@GetMapping("/pelicula/id")
	public List<Pelicula> getPelicula(){
		return null;
	}

	@GetMapping("/cines")
	public List<Cine> getCines(){
		return (List<Cine>) iCine.findAll();
	}
	
	@GetMapping("/cine")
	public List<Pelicula> getCine(){
		return null;
	}
}