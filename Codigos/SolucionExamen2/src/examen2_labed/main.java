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
public class main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        // Punto 1: Solucion
        
        FileIO archivo = new FileIO();
        archivo.open("numeros.txt", "r");

        String[] line;

        int suma = 0;

        while((line = archivo.read(",")) != null){
            for(int i=0; i < line.length; i++){
                suma += Integer.parseInt(line[i]);
            }
        }

        System.out.println(suma);
        archivo.close();
        */
        
        /*
        //Punto 2: Solucion
        FileIO archivo = new FileIO();
        archivo.open("trigonometria.txt", "w");
        
        for(int i=0; i <= 45; i++){
            double degrees = (double)i;
            double radians = Math.toRadians(degrees);
            
            //completar: su codigo en este lugar
            String msg = Double.toString(radians)+","+Double.toString(Math.sin(radians))+","+Double.toString(Math.cos(radians))+Double.toString(Math.tan(radians));
            archivo.write(msg, ";");
        }
        
        archivo.close();
        */
    
        /*
        //Punto 3: Solucion
        FileIO archivo = new FileIO();
        archivo.open("trigonometria.txt", "r");
        
        String[] line;
        
        double suma = 0;
        
        while((line = archivo.read(";")) != null){
            //Completar: su codigo en este lugar
            for(int j=1; j<line.length; j++){
                String[] data = line[j].split(",");
                suma += Double.parseDouble(data[1]);
            }
        }
        
        System.out.println(suma);
        archivo.close();
        */
    }
}
