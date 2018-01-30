/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author LAB7-PC5-USER
 */
public class Aplicacion {
    public static void main(String[] args) {
        Random r;//genera numeros random
        int d;//va a asignar el dato al nodo, Representa el dato del nodo
        int k;//indica el numero de nodos de la lista
        Lista lista;//crea la lista de nodos
        
        r=new Random();
        lista=new Lista();
        k=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de nodos"));
        for (; k > 0; k--) {
            d=r.nextInt()%99;
            lista.insertarHeader(d);
        }
        lista.imprimir();
    }
}