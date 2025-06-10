package com.uniceplac.apiRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniceplac.apiRest.entity.Aluno;
import com.uniceplac.apiRest.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired //Automatiza o processo de instanciar a classe
	private AlunoRepository alunoRepository;
	
	//SELECT * FROM
	public List<Aluno> listarAlunos(){
		List<Aluno> alunos = alunoRepository.findAll();
		return alunos;
	}
	
	//INSERT INTO
	public Aluno addAluno(Aluno aluno) {
		Aluno alunoNovo = alunoRepository.save(aluno);
		return alunoNovo;
	}
	
	public Aluno buscarAluno(Long id) {
		Aluno aluno = alunoRepository.findById(id).orElse(null);
		return aluno;
	}
	
	public void excluirAluno(Long id) {
		Aluno aluno = buscarAluno(id);
		alunoRepository.delete(aluno);
	}
}
