/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioarchivos;

/**
 *
 * @author cornelius
 */
public class MainProgram {
 
    public static void main(String[] args) {
        FileIO fileIO = new FileIO();
         
        //1.1. /abrimos el archivo en modo escritura
        fileIO.open("test.txt", "w");
         
        //1.2. Insertemos 4 registros en el archivo test.txt, separados por *.
        String specialChar = "-";
        fileIO.write("Julio1, casas1, 128392923, 321", specialChar);
        fileIO.write("Julio2, casas2, 228392923, 322", specialChar);
        fileIO.write("Julio3, casas3, 328392923, 323", specialChar);
        fileIO.write("Julio4, casas4, 428392923, 324", specialChar);
        
        //1.3. cerramos el archivo en modo escritura
        fileIO.close();
        
        //2.1. abrimos el archivo en modo lectura
        fileIO.open("test.txt", "r");
        
        //2.2. obtenemos la informacion del archivo
        String[] lectura = fileIO.read(specialChar);
        
        //2.3. cerramos el archivo
        fileIO.close();
        
        
        //2.4. iteramos sobre a informacion leida desde el archivo
        for(int i = 0; i < lectura.length; i++){
            System.out.println(lectura[i]);
        }
     }
    
}
