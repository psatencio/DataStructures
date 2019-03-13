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

import java.io.*;

public class IOArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Ejemplo de escritura en archivos
        */
        
        File miArchivo = new File("temp.txt");
        FileWriter fWriter;
        
        try{
            fWriter = new FileWriter(miArchivo);
            
            fWriter.write("1,2,3,4,5 \n");
            fWriter.write("6,7,8,9,10 \n");
            
            fWriter.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        /*
        Ejemplo de lectura de archivos
        */
        
        File archivoLectura = new File("temp.txt");
        FileReader fReader;
        BufferedReader bufferedReader;

        try{
            fReader = new FileReader(archivoLectura);
            bufferedReader = new BufferedReader(fReader);
            
            int i = 1;
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                System.out.format("Linea %d = %s \n",i,line);
                i++;
            }
                        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
