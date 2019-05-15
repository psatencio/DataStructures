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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FileIO fileIO = new FileIO(); //creamos un objeto para la IO en archivos
        
        fileIO.open("datos.txt", "w"); //abrimos en modo escritura
        
        //guardamos 10 elementos en el archivo
        for (int i = 1; i <= 10; i++){
            int value = i*2+10;
            fileIO.write(Integer.toString(value), ",");
        }
        
        fileIO.close(); //cerramos el archivo
        
        fileIO.open("datos.txt", "r"); //volvemos a abrir el archivo en modo lectura
        String[] datos = fileIO.read(","); //obtenemos los datos del archivo
        
        
        ListaDoble miLista = new ListaDoble(); //creamos una lista doblemente ligada

        for(int i=0; i < datos.length; i++){
            miLista.insertarAlFinal(Integer.parseInt(datos[i])); // guardamos los valores obtenidos desde el archivo en la lista
        }
        
        System.out.println("Contenido de la lista: ");
        miLista.recorrer(0); //imprimimos los elementos de la lista
        
        /*
        //Ejemplo: comparacion entre strings.
        
        String a = "Zapata";
        String b = "Perez";
        
        int compare = a.compareTo(b);
        
        System.out.println(compare);
        */
    }
    
}
