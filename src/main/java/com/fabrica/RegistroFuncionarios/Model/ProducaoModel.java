package com.fabrica.RegistroFuncionarios.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "ProducaoDesigner")
public class ProducaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String RemessaPd;
    @Column
    private String areaTratamento;



    //Constructor


    public ProducaoModel() {
    }

    public ProducaoModel(Integer id) {
        this.id = id;
    }
    //Getters and Setters


    public String getRemessaPd() {
        return RemessaPd;
    }

    public void setRemessaPd(String remessaPd) {
        RemessaPd = remessaPd;
    }

    public String getAreaTratamento() {
        return areaTratamento;
    }

    public void setAreaTratamento(String areaTratamento) {
        this.areaTratamento = areaTratamento;
    }
}
