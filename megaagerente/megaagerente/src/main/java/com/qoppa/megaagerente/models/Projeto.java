package com.qoppa.megaagerente.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "tb_projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 40)
    private String nome;
    @Column(nullable = false, unique = true, length = 25)
    private String idInterno;
    @Column(nullable = false)
    private int percentualTrabalhado;
    @Column(nullable = false)
    private Boolean statusProjeto;
    private LocalDateTime dataCriacao;
    private String descricao;

    @ManyToMany
    @JoinTable(name = "tb_projeto_colaborador", joinColumns = @JoinColumn(name = "id_projeto"), inverseJoinColumns = @JoinColumn(name = "id_colaborador"))
    private List<Colaborador> colaborador = new java.util.ArrayList<>();

    public Projeto() {
    }

    public Projeto(Long id, String nome, String idInterno, int percentualTrabalhado, Boolean statusProjeto,
            LocalDateTime dataCriacao, String descricao, List<Colaborador> colaborador) {
        this.id = id;
        this.nome = nome;
        this.idInterno = idInterno;
        this.percentualTrabalhado = percentualTrabalhado;
        this.statusProjeto = statusProjeto;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
        this.colaborador = colaborador;
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

    public String getIdInterno() {
        return this.idInterno;
    }

    public void setIdInterno(String idInterno) {
        this.idInterno = idInterno;
    }

    public int getPercentualTrabalhado() {
        return this.percentualTrabalhado;
    }

    public void setPercentualTrabalhado(int percentualTrabalhado) {
        this.percentualTrabalhado = percentualTrabalhado;
    }

    public Boolean isStatusProjeto() {
        return this.statusProjeto;
    }

    public Boolean getStatusProjeto() {
        return this.statusProjeto;
    }

    public void setStatusProjeto(Boolean statusProjeto) {
        this.statusProjeto = statusProjeto;
    }

    public LocalDateTime getDataCriacao() {
        return this.dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Colaborador> getColaborador() {
        return this.colaborador;
    }

    public void setColaborador(List<Colaborador> colaborador) {
        this.colaborador = colaborador;
    }

    public Projeto id(Long id) {
        setId(id);
        return this;
    }

    public Projeto nome(String nome) {
        setNome(nome);
        return this;
    }

    public Projeto idInterno(String idInterno) {
        setIdInterno(idInterno);
        return this;
    }

    public Projeto percentualTrabalhado(int percentualTrabalhado) {
        setPercentualTrabalhado(percentualTrabalhado);
        return this;
    }

    public Projeto statusProjeto(Boolean statusProjeto) {
        setStatusProjeto(statusProjeto);
        return this;
    }

    public Projeto dataCriacao(LocalDateTime dataCriacao) {
        setDataCriacao(dataCriacao);
        return this;
    }

    public Projeto descricao(String descricao) {
        setDescricao(descricao);
        return this;
    }

    public Projeto colaborador(List<Colaborador> colaborador) {
        setColaborador(colaborador);
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
        return Objects.equals(id, projeto.id) && Objects.equals(nome, projeto.nome)
                && Objects.equals(idInterno, projeto.idInterno) && percentualTrabalhado == projeto.percentualTrabalhado
                && Objects.equals(statusProjeto, projeto.statusProjeto)
                && Objects.equals(dataCriacao, projeto.dataCriacao) && Objects.equals(descricao, projeto.descricao)
                && Objects.equals(colaborador, projeto.colaborador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idInterno, percentualTrabalhado, statusProjeto, dataCriacao, descricao,
                colaborador);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nome='" + getNome() + "'" +
                ", idInterno='" + getIdInterno() + "'" +
                ", percentualTrabalhado='" + getPercentualTrabalhado() + "'" +
                ", statusProjeto='" + isStatusProjeto() + "'" +
                ", dataCriacao='" + getDataCriacao() + "'" +
                ", descricao='" + getDescricao() + "'" +
                ", colaborador='" + getColaborador() + "'" +
                "}";
    }

}
