package com.dogocorp.jpa.model.pagos;

public enum TipoCorteEnum {
    X("Corte - X"), Z("Corte - Z");

    private final String label;

    private TipoCorteEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}