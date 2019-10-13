/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Connection.Connection;
import Dao.Dao;
import Pacote1.Categorias;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Allan
 */
public class CategorisTeste {
    
    //EntityManagerFactory emf = Persistence.createEntityManagerFactory("pc");
      //EntityManager em = emf.createEntityManager()
    
  public static void main(String[] args){
      
      /*
      Categorias c = new Categorias();
      c.setDescricao("Comidas frutas");
      c.setCalorias(11.25f);
      c.setDt_data("1994/04/4");
      c.setTipo("M");
      c.setDt_validade("2010/04/15");
      c.setNome("Maçãn");
      */
      
      //c.setId(1);///Mudar Para Execultar o Update
      
   
      Dao da = new Dao();///Categoria dao(camada de persistencia)
      //da.save(c);//Inserir Dados no banco de dados
      /*Select*/
      //Categorias c = da.find(4);//Select Individual
      for(Categorias s:da.findAll()){
       System.out.println(s.getId());
       System.out.println(s.getNome());
       System.out.println(s.getDescricao());
     
      }
     
      
    
     
   
  
      
  }
    
}
