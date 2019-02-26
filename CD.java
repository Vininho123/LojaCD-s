/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


/**
 *
 * @author Vinicius de Almeida
 */
public class CD {
     private String capa;
      // private String titulo;
     private int codigo;
     private String titulo;
     private int preco;

 public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getPreco() {
        return preco;
    }

    public void setPreço(int preco ) {
        this.preco = preco;
    }
    public String getcapa() {
        return capa;
    }

    public void setcapa(String capa) {
        this.capa = capa;
    }
    
}