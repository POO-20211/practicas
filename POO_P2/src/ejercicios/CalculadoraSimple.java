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
public class CalculadoraSimple {
    float num1;
    float num2;
    
    float sumar(){
        return num1+num2;
    }
    float restar(){
        return num1-num2;
    }
    float multiplicar(){
        return num1*num2;
    }
    float dividir(){
        return num1/num2;
    }
    float reciproco(){
        return 1/num1;
    }
    float cambiarSigno(){
        return (-1)*num1;
    }
    float elevarCuadrado(){
        return num1*num1;
    }
    float sacarRaiz(){
        return (float)Math.sqrt(num1);
    }
    float porcentaje(){
        return num1*(num2/100);
    }
    
    public static void main(String args[]){
        CalculadoraSimple c = new CalculadoraSimple();
        c.num1=200;
        c.num2=80;
        System.out.println("Porcentaje: "+ c.porcentaje());
    }
}
