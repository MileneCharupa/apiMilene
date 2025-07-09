package com.primeiraapi.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.primeiraapi.apirest.model.AlunoModel;
import com.primeiraapi.apirest.service.AlunoService;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    // Buscar todos
    @GetMapping("/todos")
    public ResponseEntity<List<AlunoModel>> buscarTodos() {
        return ResponseEntity.ok(alunoService.buscarTodos());
    }

    //fiz dessa linha para baixo

    // Inserir aluno
    @PostMapping("/inserir")
    public ResponseEntity<AlunoModel> inserir(@RequestBody AlunoModel aluno) {
        return ResponseEntity.ok(alunoService.inserir(aluno));
    }

    // Remover aluno
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        alunoService.remover(id);
        return ResponseEntity.noContent().build();
    }

    // Buscar por ID
    @GetMapping("/buscarid/{id}")
    public ResponseEntity<AlunoModel> buscarPorId(@PathVariable Long id) {
        Optional<AlunoModel> aluno = alunoService.buscarPorId(id);
        return aluno.map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    // Buscar por nome
    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<AlunoModel>> buscarPorNome(@PathVariable String nome) {
        return ResponseEntity.ok(alunoService.buscarPorNome(nome));
    }

    // Buscar por curso
    @GetMapping("/curso/{curso}")
    public ResponseEntity<List<AlunoModel>> buscarPorCurso(@PathVariable String curso) {
        return ResponseEntity.ok(alunoService.buscarPorCurso(curso));
    }

    // Editar aluno
    @PutMapping("/editar/{id}")
    public ResponseEntity<AlunoModel> editar(@PathVariable Long id, @RequestBody AlunoModel aluno) {
        return ResponseEntity.ok(alunoService.editar(id, aluno));
    }
}
