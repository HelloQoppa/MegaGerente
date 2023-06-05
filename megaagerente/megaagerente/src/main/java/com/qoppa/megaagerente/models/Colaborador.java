package com.qoppa.megaagerente.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.Objects;

import com.qoppa.megaagerente.enums.AreaEnum;

@Entity
@Table(name = "tb_colaborador")
public class Colaborador extends Pessoa {

    @Column(nullable = false, length = 50)
    private String funcao;
    @Enumerated(EnumType.STRING)
    private AreaEnum areaEnum;
    @ManyToMany(mappedBy = "colaborador")
    private List<Projeto> projetos = new ArrayList<>();

    public Colaborador() {
    }

    public Colaborador(String funcao, AreaEnum areaEnum, List<Projeto> projetos) {
        this.funcao = funcao;
        this.areaEnum = areaEnum;
        this.projetos = projetos;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public AreaEnum getAreaEnum() {
        return this.areaEnum;
    }

    public void setAreaEnum(AreaEnum areaEnum) {
        this.areaEnum = areaEnum;
    }

    public List<Projeto> getProjetos() {
        return this.projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    public Colaborador funcao(String funcao) {
        setFuncao(funcao);
        return this;
    }

    public Colaborador areaEnum(AreaEnum areaEnum) {
        setAreaEnum(areaEnum);
        return this;
    }

    public Colaborador projetos(List<Projeto> projetos) {
        setProjetos(projetos);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Colaborador)) {
            return false;
        }
        Colaborador colaborador = (Colaborador) o;
        return Objects.equals(funcao, colaborador.funcao) && Objects.equals(areaEnum, colaborador.areaEnum)
                && Objects.equals(projetos, colaborador.projetos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcao, areaEnum, projetos);
    }

    @Override
    public String toString() {
        return "{" +
                " funcao='" + getFuncao() + "'" +
                ", areaEnum='" + getAreaEnum() + "'" +
                ", projetos='" + getProjetos() + "'" +
                "}";
    }

}
