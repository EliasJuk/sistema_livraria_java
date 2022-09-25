package com.livraria.model;

public class Produtos {  
  private int id;
  private String nome;
  private float peso;
  private String descricao;
  private float valor;
  
  public Produtos(){
    
  }

  public Produtos(String nome, float peso, String descricao, float valor) {
    this.nome = nome;
    this.peso = peso;
    this.descricao = descricao;
    this.valor = valor;
  }

  public Produtos(int id, String nome, float peso, String descricao, float valor) {
    this.id = id;
    this.nome = nome;
    this.peso = peso;
    this.descricao = descricao;
    this.valor = valor;
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }


  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }  

  
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setValor(float valor){
    this.valor = valor;
  }

  public float getValor(){
    return valor;
  }
}