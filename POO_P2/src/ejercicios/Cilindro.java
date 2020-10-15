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
public class Cilindro {
    float PI = 3.1416f; // le pongo al final la f para indicar que es flotante, de otra forma, marca error porque lo toma como double
    float altura;
    float diametro;
    
   float calcularArea(){
        float areaTotal = 2*PI*(diametro/2)*(altura+(diametro/2));
        return areaTotal;
    }
    float calcularVolumen(){ // el radio es la mitad del diametro
        float volumen = (PI*((diametro/2)*(diametro/2))*altura);
        return volumen;
    }
    
    public static void main(String args[]){
        Cilindro c = new Cilindro();
        c.altura=20;
        c.diametro=20;
        System.out.println("Area: "+c.calcularArea());
        System.out.println("Volumen: "+c.calcularVolumen());
    }
}
