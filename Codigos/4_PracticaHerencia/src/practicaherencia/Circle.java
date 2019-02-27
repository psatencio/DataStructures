/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaherencia;

//import Java.lang.Math.*;

/**
 *
 * @author cornelius
 */
public class Circle extends GeometricFigure{

    private double radio;

    public Circle(){
        this(1); //default circle with radio 1
    }

    public Circle(double radio){
        this(radio, 0, 0); //llamado al constructor mas complejo con parametros por defecto
    }

    public Circle(double radio, double x, double y){
        this.radio = radio;
        this.x = x;
        this.y = y;
        calc_area();
        calc_perimeter();
    }

    @Override
    protected void calc_area(){
        this.area = Math.PI * Math.pow(this.radio, 2); 
    }

    @Override
    protected void calc_perimeter(){
        this.perimeter = 2.0 * Math.PI * this.radio; 
    }

}
