package com.aerolinea.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aerolinea.api.model.Vuelo;

/**
 * Interface que permite realizar las operaciones CRUD sobre la entidad Vuelo O
 * 
 * @author luis.hernandez
 *
 */
@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long> {

}