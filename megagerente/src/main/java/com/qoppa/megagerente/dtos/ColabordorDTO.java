package com.qoppa.megagerente.dtos;

import com.qoppa.megagerente.enuns.AreaEnum;
import com.qoppa.megagerente.enuns.TipoPessoaEnum;

import jakarta.validation.constraints.NotBlank;

public class ColabordorDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private TipoPessoaEnum tipoPessoaEnum;
    @NotBlank
    private AreaEnum areaEnum;
    @NotBlank
    private String funcao;

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

    public AreaEnum getAreaEnum() {
        return this.areaEnum;
    }

    public void setAreaEnum(AreaEnum areaEnum) {
        this.areaEnum = areaEnum;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
