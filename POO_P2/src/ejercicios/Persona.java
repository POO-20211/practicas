/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author sndmonreal
 */
public class Persona {
    String nombre;
    int dia;
    int mes;
    int anio;
    
    int calcularEdad(){
        return 2020-anio;
    }
    void mostrar(){
        System.out.println(nombre + " tiene "+calcularEdad()+ " años");
    }
    public static void main(String args[]){
        Persona p = new Persona();
        p.nombre="Agustina";
        p.anio=1995;
        p.mostrar();
    }
}
