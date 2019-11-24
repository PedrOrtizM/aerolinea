package com.aerolinea.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aerolinea.api.model.Reserva;

/**
 * Interface que permite realizar las operaciones CRUD sobre la entidad Reserva
 * 
 * 
 * @author luis.hernandez
 *
 */
@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}