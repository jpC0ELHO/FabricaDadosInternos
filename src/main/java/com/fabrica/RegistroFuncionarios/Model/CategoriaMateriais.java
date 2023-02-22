package com.fabrica.RegistroFuncionarios.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class CategoriaMateriais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String MaterialCatego;
    @Column
    private String PesoCatego;

    //======constructor======
    public CategoriaMateriais() {
    }

    public CategoriaMateriais(Integer id) {
        this.id = id;
    }

    //===Getters and setters====
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterialCatego() {
        return MaterialCatego;
    }

    public void setMaterialCatego(String materialCatego) {
        MaterialCatego = materialCatego;
    }

    public String getPesoCatego() {
        return PesoCatego;
    }

    public void setPesoCatego(String pesoCatego) {
        PesoCatego = pesoCatego;
    }
}
