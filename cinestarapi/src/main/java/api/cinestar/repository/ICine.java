package api.cinestar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.cinestar.model.Cine;

@Repository
public interface ICine extends CrudRepository<Cine, Integer>{

}