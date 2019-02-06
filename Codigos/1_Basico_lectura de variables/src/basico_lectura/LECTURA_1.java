package basico_lectura;

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

class LECTURA_1
{
	public void leer() 
	{
	  double a,b; //definimos las variables reales
	  int edad;  //definimos una variable entera
	  String nom;  //definimos una variable de texto
	  
	  InputStreamReader isr = new InputStreamReader(System.in);
          BufferedReader lector = new BufferedReader (isr);


	 // BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); //creamos el objeto lector
	  try
        {

	  System.out.println("digite el nombre del estudiante:  ");//imprimir el mensaje de nombre
   	  nom=lector.readLine();//leer la variable nom con el objeto lector y el metodo de lectura readline
   	  
   	  System.out.println("digite la edad del estudiante:  ");//imprimir el mensaje de edad
   	  edad=Integer.parseInt(lector.readLine());/*leer la variable edad con el objeto lector y el metodo de lectura readline, 
   	                                                                         ademas se debe utilizar el metodo parse para pasarlo a numerico entero*/
	  System.out.println("digite primera nota:  ");//imprimir el mensaje de primera nota
   	  a=Double.parseDouble(lector.readLine());/*leer la variable a con el objeto lector y el metodo de lectura readline, 
   	                                                                         ademas se debe utilizar el metodo parse para pasarlo a numerico real*/
      System.out.println("\ndigite segunda nota:    ");
	  b=Double.parseDouble(lector.readLine());
	  
	  double prom=(a+b)/2;//se elabora el calculo
	  System.out.println("\nel promedio es:    "+"de:  "+nom+"es:  "+prom+" y tiene: "+edad+" años");//se muestran los datos
	  }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}
}

