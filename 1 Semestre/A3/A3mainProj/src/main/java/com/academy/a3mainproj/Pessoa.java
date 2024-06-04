package com.academy.a3mainproj;

public class Pessoa {
    private int id;
    private String nome;
    private String usuario, senha;
    private int idade;
    public boolean confirmaHabito;
    private char sexo;
    private double peso;
    private double altura;
    private String tipo;
    
    public Pessoa(int id, String nome, String senha, int idade, double peso, double altura, char sexo, String usuario){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.usuario = usuario;
    }
    
    public Pessoa(String nome, String senha, int idade, double peso, double altura, char sexo, String usuario){
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.usuario = usuario;
    }
    
    public Pessoa(String nome, int idade, double peso, double altura, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }
    
    public Pessoa(String nome, String usuario, String senha){
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Pessoa(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Pessoa(int id){
        this.id = id;
    }
    
    public Pessoa(String usuario){
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
}
