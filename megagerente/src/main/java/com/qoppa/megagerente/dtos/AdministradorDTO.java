package com.qoppa.megagerente.dtos;

import com.qoppa.megagerente.enuns.TipoPessoaEnum;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AdministradorDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private TipoPessoaEnum tipoPessoaEnum;
    @NotBlank
    @Size(max = 11)
    private String login;
    @NotBlank
    @Size(max = 11)
    private String senha;

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

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
