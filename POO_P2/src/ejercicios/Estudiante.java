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
public class Estudiante {
    String nombre;
    float calif1;
    float calif2;
    float calif3;
    float calcularFinal(){
        // suponiendo que las ponderaciones son 30%, 30% y 40%
        return (calif1*0.3f)+(calif2*0.3f)+(calif3*0.4f);// debo agregar la f para que lo tome como float y no como double
    }
    void mostrar(){
        System.out.println(nombre +" tiene: ");
        System.out.println(calif1+" primer departamental");
        System.out.println(calif2+" segundo departamental");
        System.out.println(calif3+" tercer departamental");
        System.out.println(calcularFinal()+" calificacion final");
    }
    
    public static void main(String args[]){
        Estudiante e = new Estudiante();
        e.nombre="Filemon";
        e.calif1=8;
        e.calif2=7;
        e.calif3=7.5f;
        e.mostrar();
    }
}
