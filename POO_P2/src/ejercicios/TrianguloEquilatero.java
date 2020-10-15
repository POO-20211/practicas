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
public class TrianguloEquilatero {
    float lado;
    
    float calcularArea(){
        return (lado*calcularAltura())/2;
    }
    float calcularPerimetro(){
        return lado*3;
    }
    float calcularAltura(){
        float altura= (float)Math.sqrt((lado*lado)-((lado/2)*(lado/2)));
        return altura;
    }
    
    public static void main(String ars[]){
        TrianguloEquilatero t1 = new TrianguloEquilatero();
        t1.lado=8;
         System.out.println("Area: "+t1.calcularArea());
        System.out.println("Perimetro: "+t1.calcularPerimetro());
    }
}
