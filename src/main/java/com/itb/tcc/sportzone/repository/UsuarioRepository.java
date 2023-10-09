package com.itb.tcc.sportzone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.itb.tcc.sportzone.model.Usuario;
import com.itb.tcc.sportzone.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
