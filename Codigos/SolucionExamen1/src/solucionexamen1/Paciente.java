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
public class Paciente extends Persona{
    
    int estrato_social;
    double copago;
    
    public Paciente(){
        
    }
    
    public Paciente(String identificacion, String nombres, String apellidos, int edad, int estrato_social, double copago){
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estrato_social = estrato_social;
        this.copago = copago;
    }

    public int getEstrato_social() {
        return estrato_social;
    }

    public void setEstrato_social(int estrato_social) {
        this.estrato_social = estrato_social;
    }

    public double getCopago() {
        return copago;
    }

    public void setCopago(double copago) {
        this.copago = copago;
    }
}
