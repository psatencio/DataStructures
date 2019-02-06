/*
 * ESTE MENU TIENE ALGUNOS TIPOS DE LECTURA EN JAVA
 * NO SE HA VALIDADO INFORMACION!!!
 * para que pueda observar las diferencias se elaboró el mismo ejercicio
 * 
 */

package basico_lectura;

import javax.swing.JOptionPane;

public class Main {

   public static void main(String[] args)
   {
        LECTURA_1 obj1;
        obj1=new LECTURA_1();

        LECTURA_2 obj2;
        obj2=new LECTURA_2();

        LECTURA_3 obj3;
        obj3=new LECTURA_3();

        LECTURA_4 obj4;
        obj4=new LECTURA_4();

        int resp=0;

        
        try{
            while(resp <=4)//mientras respuesta sea igual a si
            {
                resp=Integer.parseInt(JOptionPane.showInputDialog("****** MENU DE LECTURAS *******\n\t 1. Lectura con el BufferedReader  \n\t 2. Lectura con el Scanner \n\t 3. Lectura con el JOptionPane \n\t 4. Lectura con la clase LeerVariable \n\t 5.Salir"));
                switch(resp)
                {
                    case 1:obj1.leer();
                                break;
                    case 2:obj2.leer();
                                break;
                    case 3:obj3.leer();
                                break;
                    case 4:obj4.leer();
                                break;
                }
            }
        }catch(Exception e){
            System.out.println("Error al salir de la aplicacion, utilice la opcion 5.");           
        }

    }
}
