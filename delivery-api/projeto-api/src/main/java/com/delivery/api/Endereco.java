package com.delivery.api;

public class Endereco {
    private Long id;
    private String rua;
    private int numero;

    public Endereco() {
    }

    public Long getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
