/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.funeraria.model;

/**
 *
 * @author Luan
 */
public class ModelNumero extends ModelPessoa {

    
    private int id_numero;
    private int telefone;

    /**
     * @return the id_numero
     */
    public int getId_numero() {
        return id_numero;
    }

    /**
     * @param id_numero the id_numero to set
     */
    public void setId_numero(int id_numero) {
        this.id_numero = id_numero;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
    
}
