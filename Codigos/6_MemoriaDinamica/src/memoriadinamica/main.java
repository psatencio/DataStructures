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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila mipila = new Pila();
        
        mipila.push(1);
        mipila.push(2);
        mipila.push(3);
        
        Object temp = mipila.pop();
        System.out.println(temp);
                
        temp = mipila.pop();
        System.out.println(temp);
        temp = mipila.pop();
        System.out.println(temp);
        temp = mipila.pop();
        System.out.println(temp);
        
        /*Cola cola = new Cola();
        
        cola.push(1);
        cola.push(2);
        cola.push(3);
        cola.push(4);
        
        Object temp = cola.pop();
        System.out.println(temp);
        temp = cola.pop();
        System.out.println(temp);
        temp = cola.pop();
        System.out.println(temp);
        temp = cola.pop();
        System.out.println(temp);*/
        
    }
    
}
