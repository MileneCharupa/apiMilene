package com.primeiraapi.apirest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "pessoa")
public abstract class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPessoa;

    @NotBlank(message = "Nome é obrigatório")
    private String nomeEstudante;

    @NotNull(message = "Idade é obrigatória")
    @Min(value = 0, message = "Idade deve ser positiva")
    private Integer idade;

    @NotBlank(message = "sexo é obrigatório")
    private String sexo;


    // Getters e Setters
    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomeEstudante(){
        return nomeEstudante;
    }
    public void setNomeEstudante(String nomeEstudante){
        this.nomeEstudante = nomeEstudante;
    }
   
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    
}
