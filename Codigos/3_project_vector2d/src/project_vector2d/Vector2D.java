/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_vector2d;


/**
 *
 * @author cornelius
 */
public class Vector2D {

    double _x, _y;

    public Vector2D(double x, double y){
        this._x = x;
        this._y = y;
    }

    public double getNorm(){
        double norm = Math.sqrt(Math.pow(this._x,2) + Math.pow(this._y,2));
        return norm;
    }

    public double dot(Vector2D V){
        double dotProduct = Math.sqrt(Math.pow(this._x - V.get_x(), 2) + Math.pow(this._y - V.get_y(), 2));
        return dotProduct;
    }

    public double getCosineDistance(Vector2D V){
        double cosDis = (this.dot(V))/(this.getNorm()*V.getNorm());
        return cosDis;
    }

    public double get_x(){
        return this._x;
    }

    public double get_y(){
        return this._y;
    }

}
