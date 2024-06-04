package com.academy.a3mainproj;

public class Habitos {
    private int id;
    private String nome;
    private String descricao;
    private int grau;
    private boolean habilitado;
    
    public Habitos(int id, String nome, String descricao, int grau, boolean habilitado){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.grau = grau;
        this.habilitado = habilitado;
    }
    
    public Habitos(String nome, String descricao, int grau, boolean habilitado){
        this.nome = nome;
        this.descricao = descricao;
        this.grau = grau;
        this.habilitado = habilitado;
    }
    
    public Habitos(int id){
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public boolean getHabilitado(){
        return habilitado;
    }
    
    public void setHabilitado(boolean habilitado){
        this.habilitado = habilitado;
    }
}
