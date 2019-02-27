/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaherencia;

/**
 *
 * @author cornelius
 */
public abstract class GeometricFigure {

    protected double area;
    protected double perimeter;
    protected double x, y;

    protected abstract void calc_area();

    protected abstract void calc_perimeter();

    public double get_area(){
        return this.area;
    }

    public double get_perimeter(){
        return this.perimeter;
    }

    public double get_x(){
        return this.x;
    }

    public double get_y(){
        return this.y;
    }

}
