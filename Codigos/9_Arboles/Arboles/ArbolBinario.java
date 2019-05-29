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

/*
    Arbol binario ordenado.
*/
public class ArbolBinario {
    public NodoBinario raiz;
    public int profundidad;

    public ArbolBinario(NodoBinario raiz){
        this.raiz = raiz;
        this.profundidad = 0;
    }

    public void Insertar(Object dato){
        NodoBinario q = this.raiz;
        NodoBinario next = q;

        int dir = 1;

        while(next != null){
            q = next;
            if((double)dato > (double)next.dato){
                next = q.der;
                dir = 1;
            }else{
                next = q.izq;
                dir = -1;
            }
        }

        NodoBinario nuevo_nodo = new NodoBinario(dato);
        nuevo_nodo.padre = q;
        
        if(dir == -1){
            q.izq = nuevo_nodo;
        }else{
            q.der = nuevo_nodo;
        }
    }

    public void recorrerInOrden(NodoBinario nodo){
        if(nodo == null){
            return;
        }

        System.out.println(nodo.dato);
        
        recorrerInOrden(nodo.izq);
        recorrerInOrden(nodo.der);
    }

    public void ImprimirRutaDesde(NodoBinario nodo){
        System.out.println(nodo.dato);
        
        if(nodo.padre == null){
            return;
        }

        ImprimirRutaDesde(nodo.padre);
    }

    public void Buscar(Object dato){
        NodoBinario q = this.raiz;
        NodoBinario next = q;

        while(next != null && (double)next.dato != (double)dato){
            q = next;
            if((double)dato > (double)q.dato){
                next = q.der;
            }else{
                next = q.izq;
            }
        }

        if(next == null){
            System.out.println("No se encontro el dato");
        }else{
            System.out.println("Se encontro el dato en la siguiente ruta");
            ImprimirRutaDesde(next);
        }
    }
}
