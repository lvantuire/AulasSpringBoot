package com.lvant.UtilizandoBeans;

public class Autor implements AutorLivro {

    private String nomeAutor;

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void exibirAutor() {
        System.out.println("Autor: " + this.nomeAutor);
    }
}
