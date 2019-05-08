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
public class Cola {
    private Nodo back, front, q;
    private int size;
    
    public Cola(){
        this.back = null;
        this.front = null;
        this.q = null;
    }

    public void push(Object dato){
        this.q = new Nodo(dato);

        if(front == null){ //first insertion
            this.front = this.q;
            this.back = this.q;
        }else{
            this.front.setSiguiente(this.q);
            this.front = this.q;
        }
        
        this.size++;
    }
    
    public Object pop(){
        Object objeto = null;
        
        if(this.size == 0){
            System.err.println("Cola vacia.");
        }else{
            objeto = this.back.getDato();
            this.back = this.back.getSiguiente();
            
            this.size--;
        }
        
        return objeto;
    }
    
    public int getSize() {
        return size;
    }
}
