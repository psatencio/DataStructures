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

import javax.swing.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num_medicos;
        
        num_medicos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de medicos."));
        System.out.println(num_medicos);
        
        double promedio_edad_medicos = 0;
        double total_nomina_basica = 0;
        
        //Ciclo de los medicos
        for(int i=1; i <= num_medicos; i++){ 
            String id_m = JOptionPane.showInputDialog("Identificacion del medico "+i);
            String nombres_m = JOptionPane.showInputDialog("Nombres del medico "+i);
            String apellidos_m = JOptionPane.showInputDialog("Apellidos del medico "+i);
            int edad_m = Integer.parseInt(JOptionPane.showInputDialog("Edad del medico "+i));
            double salario_m = Double.parseDouble(JOptionPane.showInputDialog("Salario basico del medico "+i));
            
            Medico medico = new Medico(id_m, nombres_m, apellidos_m, edad_m, salario_m);
            
            promedio_edad_medicos += medico.getEdad();
            total_nomina_basica += medico.getSalario_real();
            
            int num_pacientes;
            num_pacientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pacientes de medico."));
            
            int cont_copago = 0;
            double mayor_copago = 0;
            Paciente paciente_mayor_copago = new Paciente();
            
            //Ciclo de los pacientes por medico
            for(int j=1; j <= num_pacientes; j++){
                String id_p = JOptionPane.showInputDialog("Identificacion del paciente "+j);
                String nombres_p = JOptionPane.showInputDialog("Nombres del paciente "+j);
                String apellidos_p = JOptionPane.showInputDialog("Apellidos del paciente "+j);
                int edad_p = Integer.parseInt(JOptionPane.showInputDialog("Edad del paciente "+j));
                double copago_p = Double.parseDouble(JOptionPane.showInputDialog("Copago del paciente "+j));
                
                Paciente paciente = new Paciente(id_p, nombres_p, apellidos_p, edad_p, edad_p, copago_p);
                
                if(paciente.getCopago() > 7500){
                    System.out.format("Info. paciente %d, id: %s, nombre: %s %s \n",j,paciente.getIdentificacion(), paciente.getNombres(), paciente.getApellidos());
                    cont_copago += 1;
                }
                
                if(paciente.getCopago() > mayor_copago){
                    mayor_copago = paciente.getCopago();
                    paciente_mayor_copago = paciente;
                }
            }
            
            System.out.println("Numero de paciente con copago mayor a 7500: "+cont_copago+"\n");
            System.out.println("Paciente con mayor copago: "+paciente_mayor_copago.getNombres()+"\n");
        }
        
        System.out.println("El promedio de edad de los medicos es: "+promedio_edad_medicos / num_medicos+"\n");
    }
    
}
