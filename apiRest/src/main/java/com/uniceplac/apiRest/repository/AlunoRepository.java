package com.uniceplac.apiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniceplac.apiRest.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository <Aluno, Long> {

}
