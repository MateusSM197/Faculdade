package com.academy.a3mainproj;

public class Alarme {
    private int idHabito;
    private int id;
    private String horaToque;
    
    Alarme(int idHabito, int id, String horaToque){
        this.idHabito = idHabito;
        this.id = id;
        this.horaToque = horaToque;
    }
    
    Alarme(int idHabito, int id){
        this.idHabito = idHabito;
        this.id = id;
    }
    
    Alarme(int idHabito, String horaToque){
        this.idHabito = idHabito;
        this.horaToque = horaToque;
    }
    
    Alarme(int id){
        this.id = id;
    }

    public int getIdHabito() {
        return idHabito;
    }

    public void setIdHabito(int idHabito) {
        this.idHabito = idHabito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoraToque() {
        return horaToque;
    }

    public void setHoraToque(String horaToque) {
        this.horaToque = horaToque;
    }
}
