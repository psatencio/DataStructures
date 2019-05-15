/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasDobles_Example;

/**
 *
 * @author cornelius
 */
public class ListaDoble {
    private NodoDoble head; //primer dato de la lista
    private NodoDoble tail; //ultimo dato de la lista
    public int len;
    
    
    public ListaDoble(){
        this.head = new NodoDoble();
        this.tail = new NodoDoble();
        len = 0;
    }
    
    public void insertarAlFinal(Object dato){
        if(head.getData() == null){
            this.head.setData(dato);
            this.tail = this.head;
        }else{
            NodoDoble q = new NodoDoble();
            q.setData(dato);
            q.setPrev(this.tail);
            
            this.tail.setNext(q);
            this.tail = q;
        }
        
        len += 1;
    }
    public void insertarAlInicio(Object dato){
        if(head.getData() == null){
            this.head.setData(dato);
            this.tail = this.head;
        }else{
            NodoDoble q = new NodoDoble();
            q.setData(dato);
            q.setNext(this.head);
            
            this.head.setPrev(q);
            this.head = q;
        }
        
        len += 1;
    }
    
    public void recorrer(int order){
        NodoDoble q;
        
        switch(order){
            case 0:
                q = this.head;
                
                do{
                    System.out.println(q.getData());
                    q = q.getNext();
                }while(q != null);
                
                break;
            case 1:
                q = this.tail;
                
                do{
                    System.out.println(q.getData());
                    q = q.getPrev();
                }while(q != null);
                
                break;
        }
        
    }
}
