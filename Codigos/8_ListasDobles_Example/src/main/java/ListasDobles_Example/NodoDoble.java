package ListasDobles_Example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cornelius
 */
public class NodoDoble {
    private NodoDoble next; //nodo siguiente
    private NodoDoble prev; //nodo anterior
    private Object data; //dato a guardar en la lista
    
    public NodoDoble(){
        this.next = null;
        this.prev = null;
        this.data = null;
    }
    
    public NodoDoble(Object dato){
        this(); //constructor por defecto
        this.data = dato;
    }

    public NodoDoble getNext() {
        return next;
    }

    public void setNext(NodoDoble next) {
        this.next = next;
    }

    public NodoDoble getPrev() {
        return prev;
    }

    public void setPrev(NodoDoble prev) {
        this.prev = prev;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

   
}
