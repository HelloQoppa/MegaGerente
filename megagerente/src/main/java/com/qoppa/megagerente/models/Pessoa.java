package com.qoppa.megagerente.models;

import com.qoppa.megagerente.enuns.TipoPessoaEnum;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
public abstract class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String nome;
    @Enumerated(EnumType.STRING)
    private TipoPessoaEnum tipoPessoaEnum;

    protected Pessoa() {
    }


    protected Pessoa(Long id, String nome, TipoPessoaEnum tipoPessoaEnum) {
        this.id = id;
        this.nome = nome;
        this.tipoPessoaEnum = tipoPessoaEnum;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPessoaEnum getTipoPessoaEnum() {
        return this.tipoPessoaEnum;
    }

    public void setTipoPessoaEnum(TipoPessoaEnum tipoPessoaEnum) {
        this.tipoPessoaEnum = tipoPessoaEnum;
    }

    public Pessoa id(Long id) {
        setId(id);
        return this;
    }

    public Pessoa nome(String nome) {
        setNome(nome);
        return this;
    }

    public Pessoa tipoPessoaEnum(TipoPessoaEnum tipoPessoaEnum) {
        setTipoPessoaEnum(tipoPessoaEnum);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome) && Objects.equals(tipoPessoaEnum, pessoa.tipoPessoaEnum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, tipoPessoaEnum);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", tipoPessoaEnum='" + getTipoPessoaEnum() + "'" +
            "}";
    }
   
}
