package com.qoppa.megaagerente.enums;

public enum AreaEnum {

    RH("RH"), FINANCEIRO("FINANCEIRO"), COMERCIAL("COMERCIAL"), PRODUCAO("PRODUCAO"), TI("TI");

    private String area;

    AreaEnum(String area) {
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public AreaEnum area(String area) {
        setArea(area);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " area='" + getArea() + "'" + "}";
    }
}
