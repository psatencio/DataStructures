package basico_lectura;

import java.util.Scanner;//LIBRERIA NECESARIA PARA EL SCANNER

class LECTURA_2 
{
    	public  void leer()
        {
            Scanner lector = new Scanner(System.in);//creamos el objeto lector
		
            double a,b; //definimos las variables reales
            int edad;  //definimos una variable entera
            String nom;  //definimos una variable de texto

            System.out.println("digite el nombre del estudiante:  ");//imprimir el mensaje de nombre
            nom = lector.next();//leer la variable nom con el objeto lector y el metodo de lectura next
		
            System.out.println("digite la edad del estudiante:  ");//imprimir el mensaje de edad
            edad = lector.nextInt();//leer la variable edad con el objeto lector y el metodo de lectura next para enteros
		
            System.out.println("digite primera nota:  ");//imprimir el mensaje de primera nota                                       		
            a = lector.nextDouble();//leer la variable a con el objeto lector y el metodo de lectura next para reales
	    
            System.out.println("digite primera nota:  ");//imprimir el mensaje de segunda nota                                       		
	    b = lector.nextDouble();//leer la variable a con el objeto lector y el metodo de lectura next para reales
	    
            double prom=(a+b)/2;//se elabora el calculo
	    System.out.println("\nel promedio de:  "+nom+"  es:  "+prom+"  y tiene: "+edad+" años");//se muestran los datos
    	}
}

    