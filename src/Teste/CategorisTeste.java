/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Connection.Connection;
import Pacote1.Categorias;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Allan
 */
public class CategorisTeste {
    
    
    
  public static void main(String[] args){
      Categorias c = new Categorias();
      //c.setDescricao("Comidas");
      c.setCalorias(11.25f);
      c.setDt_data("200/06/1994");
      c.setTipo("M");
      
     
      EntityManager em = new Connection().getEntityManager();
      em.getTransaction().begin();
      em.persist(c);
      em.getTransaction().commit();
      em.close();
  
      
  }
    
}
