package com.livraria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.livraria.model.Produtos;


public class testeJPA {
  public static void main(String[] args){
    System.out.println("TESTANDO...");
            
    Produtos produto1 = new Produtos("Livro-1", 0.4f, "TOP-1", 20);
    Produtos produto2 = new Produtos("Livro-2", 0.35f, "TOP-2", 18.90f);
      
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("produtosPU");
    EntityManager manager = factory.createEntityManager();
	
    manager.getTransaction().begin();
    manager.persist(produto1);
    manager.persist(produto2);
	
    manager.getTransaction().commit();

    manager.close();
  } 
}