/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasDobles_Example;

import java.io.*;

/**
 *
 * @author cornelius
 */
public class FileIO {
    
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private FileWriter fileWriter;
    
    private String mode;
    
    public FileIO(){
        this.file = null;
        this.fileWriter = null;
        this.fileReader = null;
        this.bufferedReader = null;
        this.mode = null;
    }
    
    public void open(String filePath, String mode){
        
        /*
            Funcion para abrir un archivo. Si desea que el archivo se abra
            en modo lectura utilizar mode="r", en caso contrario utilizar 
            mode="w".
        */
        
        this.file = new File(filePath);
        this.mode = mode;
        
        if(mode.equals("w")){
            try{
                this.fileWriter = new FileWriter(file);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            if(mode.equals("r")){
                try{
                    this.fileReader = new FileReader(file);
                    this.bufferedReader = new BufferedReader(fileReader);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }else{
                System.out.println("Error, el modo debe ser w o r");
            }
        }
    }

    public void write(String message, String special){
        /*
            Funcion para escribir un mensaje en el archivo abierto.
        */
        if(this.fileWriter != null){
            try{
                this.fileWriter.write(message+special);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void close(){
        if( this.file != null ){
            if(this.mode.equals("w")){
                try{
                    this.fileWriter.close();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }else{
                try{
                    this.fileReader.close();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }else{
            System.out.println("No se ha abierto el archivo.");
        }
    }
    
    public String[] read(String special){
        
        String message[] = null;
        
        //int i = 1;
        String line;
        try{
            while ((line = bufferedReader.readLine()) != null) {
                message = line.split(special);
                //System.out.format("Linea %d = %s \n",i,line);
                //i++;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return message;
    }
}
