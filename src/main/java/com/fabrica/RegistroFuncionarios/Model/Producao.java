package com.fabrica.RegistroFuncionarios.Model;

import jakarta.persistence.*;

@Table(name = "Producao")
@Entity
public class Producao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String funcionarioFuncao;
    @Column
    private String materiaPrima;
    @Column
    private String materiaFinal;
    @Column
    private Integer cargaHoraria;
    @Column
    private Boolean acessoDMD;

    //constructor

    public Producao() {
    }

    //Getters and Setters

    public String getFuncionarioFuncao() {
        return funcionarioFuncao;
    }

    public void setFuncionarioFuncao(String funcionarioFuncao) {
        this.funcionarioFuncao = funcionarioFuncao;
    }

    public String getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public String getMateriaFinal() {
        return materiaFinal;
    }

    public void setMateriaFinal(String materiaFinal) {
        this.materiaFinal = materiaFinal;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Boolean getAcessoDMD() {
        return acessoDMD;
    }

    public void setAcessoDMD(Boolean acessoDMD) {
        this.acessoDMD = acessoDMD;
    }
}
