package com.primeiraapi.apirest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiraapi.apirest.model.AlunoModel;
import com.primeiraapi.apirest.repository.AlunoRepository;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoModel> buscarTodos() {
        return alunoRepository.findAll();
    }
    //fiz acrecentacao dessa linha para baixo

    public AlunoModel inserir(AlunoModel aluno) {
        return alunoRepository.save(aluno);
    }

    public void remover(Long id) {
        alunoRepository.deleteById(id);
    }

    public Optional<AlunoModel> buscarPorId(Long id) {
        return alunoRepository.findById(id);
    }

    public List<AlunoModel> buscarPorNome(String nome) {
        return alunoRepository.findByNomeEstudanteContainingIgnoreCase(nome);
    }

    public List<AlunoModel> buscarPorCurso(String curso) {
        return alunoRepository.findByCursoContainingIgnoreCase(curso);
    }


    // CUIDADO: Este código pode apagar dados sem querer!
public AlunoModel editar(Long id, AlunoModel alunoAtualizado) {
    alunoAtualizado.setIdPessoa(id); // Define o ID para que o JPA saiba que é uma atualização
    return alunoRepository.save(alunoAtualizado);
}
    
}
