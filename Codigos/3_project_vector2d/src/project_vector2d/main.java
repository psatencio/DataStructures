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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector2D obj1 = new Vector2D(-1.0, 1.0);
        Vector2D obj2 = new Vector2D(1.0, 1.0);


        System.out.println("Norma del vector 1: "+obj1.getNorm());
        System.out.println("Norma del vector 2: "+obj2.getNorm());
        System.out.println("Producto punto: "+obj1.dot(obj2));

        System.out.println("Distancia del coseno: "+obj1.getCosineDistance(obj2));
    }

}
