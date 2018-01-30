/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB7-PC5-USER
 */
public class Lista {
    protected Nodo nodo;

    public Lista() {
        nodo = null;
    }
    
    public Lista insertarHeader(int entrada){
        
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace=nodo;
        nodo=nuevo;
        return this;
    }
     public void imprimir(){
         Nodo n;
         n=nodo;
         String acu="";
         while(n!=null){
             acu+=n.dato+" ";
             n=n.enlace;
         }
         JOptionPane.showMessageDialog(null,acu);
     }
}
