/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoriadinamica;

/**
 *
 * @author cornelius
 */
public class Nodo {
    private Object dato;
    private Nodo siguiente;
    
    public Nodo(){
        
    }
    
    public Nodo(Object dato){
        this.dato = dato;
        this.siguiente = null;
    }
    
    public Object getDato() {
        return this.dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
