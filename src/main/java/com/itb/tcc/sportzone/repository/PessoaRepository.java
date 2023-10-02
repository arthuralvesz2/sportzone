package com.itb.tcc.sportzone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.tcc.sportzone.model.Pessoa;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
