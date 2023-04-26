package com.qoppa.megagerente.dtos;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotBlank;

public class ProjetoDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private String identificadorInterno;
    @NotBlank
    @Range(min = 0, max = 100)
    private int percentualTrabalhado;
    @NotBlank
    private boolean status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificadorInterno() {
        return identificadorInterno;
    }

    public void setIdentificadorInterno(String identificadorInterno) {
        this.identificadorInterno = identificadorInterno;
    }

    public int getPercentualTrabalhado() {
        return percentualTrabalhado;
    }

    public void setPercentualTrabalhado(int percentualTrabalhado) {
        this.percentualTrabalhado = percentualTrabalhado;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
