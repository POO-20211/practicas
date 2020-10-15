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
public class Trabajador {
    String nombre;
    float salario;
    
    float calcularSueldo(){
        float aumento;
        if(salario < 1000){
            aumento= salario*1.15f;
        }else{
            aumento = salario*1.12f;
        }
        return aumento;
    }
    void mostrar(){
        System.out.println(nombre);
        System.out.println("tiene un sueldo de "+calcularSueldo());
    }
    
    public static void main(String args[]){
        Trabajador t = new Trabajador();
        t.nombre="Darth Vader";
        t.salario=1000;
        t.mostrar();
    }
}
