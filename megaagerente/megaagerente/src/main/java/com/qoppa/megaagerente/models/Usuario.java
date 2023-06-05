package com.qoppa.megaagerente.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public class Usuario extends Pessoa {

    @Column(nullable = false, length = 25)
    private String acesso;
    @Column(nullable = false, length = 25)
    private String senha;

    public Usuario() {
    }

    public Usuario(String acesso, String senha) {
        this.acesso = acesso;
        this.senha = senha;
    }

    public String getAcesso() {
        return this.acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario acesso(String acesso) {
        setAcesso(acesso);
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
        return Objects.equals(acesso, usuario.acesso) && Objects.equals(senha, usuario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acesso, senha);
    }

    @Override
    public String toString() {
        return "{" +
                " acesso='" + getAcesso() + "'" +
                ", senha='" + getSenha() + "'" +
                "}";
    }

}
