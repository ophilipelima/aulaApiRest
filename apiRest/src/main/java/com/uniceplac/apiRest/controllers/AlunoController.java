package com.uniceplac.apiRest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.uniceplac.apiRest.entity.Aluno;
import com.uniceplac.apiRest.services.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService service;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Aluno>> exibirTodos(){
		List<Aluno> alunos = service.listarAlunos();
		return ResponseEntity.ok().body(alunos);
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<Aluno> addAluno(@RequestBody Aluno aluno){
		Aluno alunoNovo = service.addAluno(aluno);
		return ResponseEntity.ok().body(alunoNovo);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Aluno> buscar(@PathVariable Long id){ //O parâmetro vai vir na URL
		Aluno aluno = service.buscarAluno(id);
		return ResponseEntity.ok().body(aluno);
	}
}
