/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionexamen1;

/**
 *
 * @author cornelius
 */
public class Medico extends Persona{
    double salario_real;
    
    public Medico(String identificacion, String nombres, String apellidos, int edad, double salario_real){
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario_real = salario_real;
    }

    public double getSalario_real() {
        return salario_real;
    }

    public void setSalario_real(double salario_real) {
        this.salario_real = salario_real;
    }
    
    
}
