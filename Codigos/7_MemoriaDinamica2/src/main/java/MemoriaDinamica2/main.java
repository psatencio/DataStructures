/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoriaDinamica2;

/**
 *
 * @author cornelius
 */
public class main {
    public static void main(String[] args){
        ListaDoble lista = new ListaDoble();
        
        lista.insertarAlFinal("Hello world 1");
        lista.insertarAlFinal("Hello world 2");
        lista.insertarAlFinal("Hello world 3");
        lista.insertarAlFinal("Hello world 4");
        
        lista.insertarAlInicio("Hello world -1");
        
        System.out.println("List len: "+lista.len);
        
        System.out.println("Recorrido hacia adelante: ");
        lista.recorrer(0);
        
        System.out.println("Recorrido hacia atras: ");
        lista.recorrer(1);
    }
}
