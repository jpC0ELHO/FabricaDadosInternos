package com.fabrica.RegistroFuncionarios.Model;

import jakarta.persistence.*;

@Entity
@Table(name="Funcionarios")
public class Funcionarios {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @Column
    private Integer idade;

    @Column
    private String funcao;


    @JoinColumn(name="Categoria_id")
    private Categoria categoria;

    //=====Constructor====
    public Funcionarios() {

    }
    //============Getters and Setters========

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
