package com.qoppa.megagerente.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_projeto")
public class Projeto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 40)
    private String nome;
    @Column(nullable = false, unique = true, length = 25)
    private String identificadorInterno;
    @Column(nullable = false)
    private int percentualTrabalhado;
    @Column(nullable = false)
    private boolean status;
    @Column(nullable = false)
    private LocalDateTime dataCriacao;

    @ManyToMany
    @JoinTable(name = "tb_projeto_colaborador", joinColumns = @JoinColumn(name = "id_projeto"), inverseJoinColumns = @JoinColumn(name = "id_colaborador"))
    private List<Colaborador> colaborador = new java.util.ArrayList<>();
    private String descricao;


    public Projeto() {
    }

    public Projeto(Long id, String nome, String identificadorInterno, LocalDateTime dataCriacao, List<Colaborador> colaborador, String descricao) {
        this.id = id;
        this.nome = nome;
        this.identificadorInterno = identificadorInterno;
        this.percentualTrabalhado = 0;
        this.status = true;
        this.dataCriacao = dataCriacao;
        this.colaborador = colaborador;
        this.descricao = descricao;
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

    public String getIdentificadorInterno() {
        return this.identificadorInterno;
    }

    public void setIdentificadorInterno(String identificadorInterno) {
        this.identificadorInterno = identificadorInterno;
    }

    public int getPercentualTrabalhado() {
        return this.percentualTrabalhado;
    }

    public void setPercentualTrabalhado(int percentualTrabalhado) {
        this.percentualTrabalhado = percentualTrabalhado;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getDataCriacao() {
        return this.dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<Colaborador> getColaborador() {
        return this.colaborador;
    }

    public void setColaborador(List<Colaborador> colaborador) {
        this.colaborador = colaborador;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Projeto id(Long id) {
        setId(id);
        return this;
    }

    public Projeto nome(String nome) {
        setNome(nome);
        return this;
    }

    public Projeto identificadorInterno(String identificadorInterno) {
        setIdentificadorInterno(identificadorInterno);
        return this;
    }

    public Projeto percentualTrabalhado(int percentualTrabalhado) {
        setPercentualTrabalhado(percentualTrabalhado);
        return this;
    }

    public Projeto status(boolean status) {
        setStatus(status);
        return this;
    }

    public Projeto dataCriacao(LocalDateTime dataCriacao) {
        setDataCriacao(dataCriacao);
        return this;
    }

    public Projeto colaborador(List<Colaborador> colaborador) {
        setColaborador(colaborador);
        return this;
    }

    public Projeto descricao(String descricao) {
        setDescricao(descricao);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Projeto)) {
            return false;
        }
        Projeto projeto = (Projeto) o;
        return Objects.equals(id, projeto.id) && Objects.equals(nome, projeto.nome) && Objects.equals(identificadorInterno, projeto.identificadorInterno) && percentualTrabalhado == projeto.percentualTrabalhado && status == projeto.status && Objects.equals(dataCriacao, projeto.dataCriacao) && Objects.equals(colaborador, projeto.colaborador) && Objects.equals(descricao, projeto.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, identificadorInterno, percentualTrabalhado, status, dataCriacao, colaborador, descricao);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", identificadorInterno='" + getIdentificadorInterno() + "'" +
            ", percentualTrabalhado='" + getPercentualTrabalhado() + "'" +
            ", status='" + isStatus() + "'" +
            ", dataCriacao='" + getDataCriacao() + "'" +
            ", colaborador='" + getColaborador() + "'" +
            ", descricao='" + getDescricao() + "'" +
            "}";
    }
    

}
