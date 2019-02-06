package basico_lectura;

import javax.swing.JOptionPane;//LIBRERIA NECESARIA PARA EL JOptionPane
 
class LECTURA_3 {

    public void leer() 
	{
            double a,b; //definimos las variables reales
            int edad;  //definimos una variable entera
            String nom;  //definimos una variable de texto

            nom=JOptionPane.showInputDialog("digite el nombre del estudiante:  ");//leer la variable nom y muestra el mensaje respectivo

            edad=Integer.parseInt(JOptionPane.showInputDialog("digite la edad del estudiante:  "));//leer la variable edad y muestra el mensaje respectivo

            a=Double.parseDouble(JOptionPane.showInputDialog("digite primera nota:  "));//leer la variable a y muestra el mensaje respectivo

            b=Double.parseDouble(JOptionPane.showInputDialog("digite segunda nota:   "));//leer la variable b y muestra el mensaje respectivo

            double prom=(a+b)/2;//se elabora el calculo
            JOptionPane.showMessageDialog(null,"El promedio de:  "+nom+"  es:  "+prom+"\n\ty tiene: "+edad+" años");//se muestran los datos
	}
}
