package com.primeiraapi.apirest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "aluno")
@PrimaryKeyJoinColumn(name = "id_pessoa")
public class AlunoModel extends PessoaModel {

    @NotBlank(message = "Curso é obrigatório")
    private String curso;

    @NotBlank(message = "Campus é obrigatório")
    private String campus;

    @NotBlank(message = "Email do estudante é obrigatório") 
    private String emailInstitucional;

    @NotBlank(message = "Período de entrada é obrigatório")
    private String periodoEntrada;

    @NotBlank(message = "Polo é obrigatório") 
    private String polo;

    @NotBlank(message = "Coordenacao é obrigatório") 
    private String coordenacao;

    @NotBlank(message = "Situacao é obrigatório") 
    private String situacao;

    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public String getPeriodoEntrada() {
        return periodoEntrada;
    }

    public void setPeriodoEntrada(String periodoEntrada) {
        this.periodoEntrada = periodoEntrada;
    }
    public String getPolo() {
        return campus;
    }

    public void setPolo(String polo) {
        this.polo = polo;
    }
    public String getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(String coordenacao) {
        this.coordenacao = coordenacao;
    }
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
