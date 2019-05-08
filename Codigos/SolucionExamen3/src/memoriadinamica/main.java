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
        /*
            En la siguiente cadena de caracteres, una letra significa PUSH y un
            asterisco significa POP. Realice dichas operaciones utilizando una
            PILA y escriba el contenido de la PILA (utilizando POP) posterior
            a las operaciones. Escriba las porciones del codigo relacionado
            con el resultado.
        
            E A S Y * Q U E * * S T * * * I O * N * *
        */
        
        // Punto 1
        /*
        Cola miPila = new Cola();
        miPila.push("E");
        miPila.push("A");
        miPila.push("S");
        miPila.push("Y");
        miPila.pop();
        miPila.push("Q");
        miPila.push("U");
        miPila.push("E");
        miPila.pop(); miPila.pop();
        miPila.push("S");
        miPila.push("T");
        miPila.pop(); miPila.pop(); miPila.pop();
        miPila.push("I");
        miPila.push("O");
        miPila.pop();
        miPila.push("N");
        miPila.pop(); miPila.pop();
        
        int l = miPila.getSize();
        
        for(int i = 0; i < l; i++){
            System.out.println(miPila.pop());
        }
        */
        
        /*
        //Punto 2
        
        String text = "Esto es un texto cualquiera";
        Pila miPila = new Pila();
        
        for(char ch : text.toCharArray()){
            miPila.push(ch);
        }
        
        String invText = "";
        int l = miPila.getSize();
        
        for(int i=0; i < l; i++){
            invText += miPila.pop();
        }
        
        System.out.println(invText);
        */
        
        //Punto 3
        /*
        String texto = "{[(2*x+y)-(100*4+1)]*(34+x)*y}";
        
        Pila miPila = new Pila();
        
        boolean flag = true;
        
        for(char chr : texto.toCharArray()){
            
            if(flag == false){
                break;
            }
            
            if(chr == '(' || chr == '[' || chr ==  '{'){
                miPila.push(chr);
            }else{
                switch(chr){
                    case ')':
                        if((char)miPila.pop() != '('){
                            flag = false;
                        }
                        break;
                case ']':
                        if((char)miPila.pop() != '['){
                            flag = false;
                        }
                        break;
                case '}':
                        if((char)miPila.pop() != '{'){
                            flag = false;
                        }
                        break;
                }
            }
        }
        
        System.out.println("Expresion balanceada?: "+flag);
        */
        
        String cadena = "hola mundo";
        
        for (int i=0; i < cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }
    }
    
}
