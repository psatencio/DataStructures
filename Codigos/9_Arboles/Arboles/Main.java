/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arboles;

/**
 *
 * @author cornelius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NodoBinario raiz = new NodoBinario(10.0);
        ArbolBinario arbol = new ArbolBinario(raiz);

        arbol.Insertar(20.0);
        arbol.Insertar(1.0);
        arbol.Insertar(2.0);
        arbol.Insertar(9.0);
        arbol.Insertar(19.0);
        arbol.Insertar(21.0);
        arbol.Insertar(20.5);
        arbol.Insertar(3.0);

        //arbol.Buscar(3.0);
        arbol.recorrerInOrden(arbol.raiz);
    }

}
