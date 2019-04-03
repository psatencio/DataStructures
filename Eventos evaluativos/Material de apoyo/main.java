/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_labed;


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
        Funciones utiles:
            Integer.parseInt(s): transforma el string s en un entero.
            Double.parseDouble(s): transforma el string s en un double.
            v.length: devuelve el tamaño del vector v.
            String texto; texto.split("*"): Separa el string texto en valores separados por el caracter *.
			Math.sin(x), Math.cos(x), Math.tan(x): seno, coseno y tangente para el valor x en radianes.
			Math.toRadians(x): convierte el valor x a radianes.
        */
                
        /*
        // Punto 1: Codigo base
        FileIO archivo = new FileIO();
        archivo.open("numeros.txt", "r");
        
        String[] line;
        
        int suma = 0;
        
        while((line = archivo.read(",")) != null){
            //Completar: su codigo en este lugar
        }
        
        System.out.println(suma);
        
        archivo.close();
        */
        
        /*
        //Punto 2: Codigo base
        FileIO archivo = new FileIO();
        archivo.open("trigonometria.txt", "w");
        
        for(int i=0; i <= 45; i++){
            double degrees = (double)i;
            double radians = Math.toRadians(degrees);
            
            //completar: su codigo en este lugar
        }
        
        archivo.close();
        */
        
        /*
        //Punto 3: codigo base
        FileIO archivo = new FileIO();
        archivo.open("trigonometria.txt", "r");
        
        String[] line;
        
        double suma = 0;
        
        while((line = archivo.read(";")) != null){
            //Completar: su codigo en este lugar
        }
        
        System.out.println(suma);
        
        archivo.close();
        */
    }
    
}
