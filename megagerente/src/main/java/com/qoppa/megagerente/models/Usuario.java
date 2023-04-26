package com.qoppa.megagerente.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Usuario extends Pessoa {

    @Column(nullable = false, length = 25)
    private String login;
    @Column(nullable = false, length = 25)
    private String senha;

    protected Usuario() {
    }

    protected Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
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

    public Usuario login(String login) {
        setLogin(login);
        return this;
    }

    public Usuario senha(String senha) {
        setSenha(senha);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return Objects.equals(login, usuario.login) && Objects.equals(senha, usuario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, senha);
    }

    @Override
    public String toString() {
        return "{" +
                " login='" + getLogin() + "'" +
                ", senha='" + getSenha() + "'" +
                "}";
    }

}
