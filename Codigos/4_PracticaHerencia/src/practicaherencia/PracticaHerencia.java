/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaherencia;

import javax.swing.*;

/**
 *
 * @author cornelius
 */
public class PracticaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del circulo: "));

        Circle obj = new Circle(radio);

        System.out.format("El area del circulo con radio %.2f es: %.2f unidades\n",radio, obj.get_area());
        System.out.format("El perimetro del circulo con radio %.2f es: %.2f unidades al cuadrado\n",radio, obj.get_perimeter());

        //https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
    }

}
