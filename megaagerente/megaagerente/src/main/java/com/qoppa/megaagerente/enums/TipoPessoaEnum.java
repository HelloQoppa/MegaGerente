package com.qoppa.megaagerente.enums;

public enum TipoPessoaEnum {

    FISICA("FISICA"), JURIDICA("JURIDICA");

    private String tipoPessoa;

    TipoPessoaEnum(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getTipoPessoa() {
        return this.tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public TipoPessoaEnum tipoPessoa(String tipoPessoa) {
        setTipoPessoa(tipoPessoa);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " tipoPessoa='" + getTipoPessoa() + "'" + "}";
    }
}
