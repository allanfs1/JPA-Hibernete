/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Allan
 */

@Entity
public class Categorias {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private String dt_data;
    private float calorias;    
    private String tipo;
    private String nome;   
    private  String  dt_validade;
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dt_data
     */
    public String getDt_data() {
        return dt_data;
    }

    /**
     * @param dt_data the dt_data to set
     */
    public void setDt_data(String dt_data) {
        this.dt_data = dt_data;
    }

    /**
     * @return the calorias
     */
    public float getCalorias() {
        return calorias;
    }

    /**
     * @param calorias the calorias to set
     */
    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dt_validade
     */
    public String getDt_validade() {
        return dt_validade;
    }

    /**
     * @param dt_validade the dt_validade to set
     */
    public void setDt_validade(String dt_validade) {
        this.dt_validade = dt_validade;
    }
    
}
