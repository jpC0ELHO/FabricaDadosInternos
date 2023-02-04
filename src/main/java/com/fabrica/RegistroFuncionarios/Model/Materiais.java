package com.fabrica.RegistroFuncionarios.Model;

import jakarta.persistence.*;

public class Materiais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer peso;
    @Column
    private String Material;
    @Column
    private Integer QtdM;
    @Column
    private String Fornecedor;


    @ManyToOne
    @JoinColumn(name="categoriam_id")
    private CategoriaMateriais categoria;

    // Constructor
    public Materiais() {
    }

    //Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public Integer getQtdM() {
        return QtdM;
    }

    public void setQtdM(Integer qtdM) {
        QtdM = qtdM;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        Fornecedor = fornecedor;
    }
}
