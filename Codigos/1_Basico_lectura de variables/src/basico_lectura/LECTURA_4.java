package basico_lectura;

class LECTURA_4
{

    public void leer() 
	{
            double a,b; //definimos las variables reales
            int edad;  //definimos una variable entera
            String nom;  //definimos una variable de texto

            nom=LeerVariable.leerTexto("digite el nombre del estudiante:  ");//leer la variable nom y muestra el mensaje respectivo

            edad=LeerVariable.leerEntero("digite la edad del estudiante:  ");//leer la variable edad y muestra el mensaje respectivo

            a=LeerVariable.leerReal("digite primera nota:  ");//leer la variable a y muestra el mensaje respectivo

            b=LeerVariable.leerReal("digite segunda nota:   ");//leer la variable b y muestra el mensaje respectivo

            double prom=(a+b)/2;//se elabora el calculo
            System.out.println("El promedio de:  "+nom+" es:  "+prom+"  y tiene: "+edad+" años");//se muestran los datos
	}
	
	}

    
