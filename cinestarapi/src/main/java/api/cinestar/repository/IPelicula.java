package api.cinestar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.cinestar.model.Pelicula;

@Repository
public interface IPelicula extends CrudRepository<Pelicula, Integer> {

}
