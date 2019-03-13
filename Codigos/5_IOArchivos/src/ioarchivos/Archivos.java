package ioarchivos;

import java.io.*;
import javax.swing.JOptionPane;

 /*Las clases FileReader y FileWriter permiten leer y escribir, respectivamente, en un archivo,
     *lo primero que se debe hacer es importar la libreria de estas clases, es java.io.
     *y luego crear un objeto de estas clases, deben estar dentro de un try-catch para controlar las excepciones.
     *PrintWriter Es el objeto que utilizamos para escribir directamente sobre el archivo de texto.*/
     
/*BufferedReader es una clase cuyas instancias permiten hacer lecturas sencillas de texto desde un flujo de caracteres, 
 *debido a que esta clase trabaja con su propio buffer provee una lectura eficiente de caracteres, arreglos y l�neas de texto.
 *objeto que reserva un espacio en memoria donde se guarda la informaci�n antes de ser escrita en un archivo. */     
     
public class Archivos 
{
    File ArchPer;//archivo logico
    FileReader ArchPerLectura;//objeto para modo lectura del archivo
    BufferedReader BufferPer;//objeto que reserva un espacio en memoria donde se guarda la informaci�n
    FileWriter ArchPerEscritura;//objeto para modo escritura del archivo
    PrintWriter objImpresion;//objeto para grabar directamente en el archivo tipo texto
   
   public String AbrirArchivoModoLectura(String ruta)
    {
        String mensaje="¡se abrio de modo lectura!";
        try{
            ArchPer= new File(ruta);
            ArchPerLectura= new FileReader(ArchPer);
            BufferPer = new BufferedReader(ArchPerLectura);
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de abrir modo lectura
    
    public String CerrarArchivoModoLectura()
    {
        String mensaje="¡se cerro de modo lectura!";
        try{
           
           BufferPer.close();
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de cerrar modo lectura
        
    public String AbrirArchivoModoEscritura(String ruta)
    {
        String mensaje="¡se abrio de modo escritura!";
        try{
            ArchPer= new File(ruta);
            ArchPerEscritura= new FileWriter(ArchPer,true);
            objImpresion = new PrintWriter(ArchPerEscritura);
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de abrir modo escritura
    
    public String CerrarArchivoModoEscritura()
    {
        String mensaje="se cerro de modo escritura";
        try{
            
            objImpresion.close();
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de cerrar modo escritura

    public String[] LeerRegistro()//leer una linea del archivo plano de texto
    {
        String Reg="",mensaje;
        String vec[];
        vec=new String[5];//numero de atributos privados de persona, menos uno por el indexado cero
        try{
            Reg=BufferPer.readLine();
            vec=Reg.split(",");//metodo mas apropiado para dividir una cadena es  String.split(TOKEN o separador)
            
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return vec;
    }//fin de leer reg
    
    public String GrabarRegistro(String Reg) //escribir o sea grabar una linea en el archivo plano de texto
    {
        String mensaje="grabar un registro";
        try{            
            //objImpresion.print(Reg);
            //objImpresion.println(); 
            
            ArchPerEscritura.write(Reg);
            ArchPerEscritura.write("\n");
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de grabar el registro separado
    
    /*BufferedWriter: objeto que reserva un espacio en memoria donde se guarda 
   *la informaci�n antes de ser escrita en un archivo.*/  	   
    public void Reinicio(String ruta)//Eliminar o comenzar de cero
    {
        try{
            BufferedWriter objfatal = new BufferedWriter(new FileWriter(ruta));
            objfatal.write("");
            objfatal.close();
        }
        catch(Exception objException){
            JOptionPane.showMessageDialog(null, "Error al reiniciar archivo");
        }
        
    }//fin de reiniciar o empezar todo

    
 }//fin clase archivo
 