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
public class Pila {
    private Nodo top, q; //nodo de la frontera y un nodo auxiliar para intercambios
    private int size; //contador global del tamanio de la pila
    
    public Pila(){
        this.top = null;
        this.q = null;
        this.size = 0;
    }
    
    //apilar
    public void push(Object dato){
        this.q = new Nodo(dato);
        this.q.setSiguiente(top);
        this.top = this.q;
        
        this.size += 1;
    }
    
    //desapilar
    public Object pop(){
        
        Object objeto = null;
        
        if(this.size == 0){
            System.out.println("Pila vacia.");
        }else{
            objeto = this.top.getDato();
            this.top = this.top.getSiguiente();
            this.size -= 1;
        }
        
        return objeto;
    }

    public int getSize() {
        return size;
    }
}
