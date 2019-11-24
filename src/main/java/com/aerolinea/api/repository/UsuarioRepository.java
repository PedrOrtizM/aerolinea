package com.aerolinea.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aerolinea.api.model.Usuario;

/**
 * Interface que permite realizar las operaciones CRUD sobre la entidad Usuario
 * 
 * 
 * @author luis.hernandez
 *
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}