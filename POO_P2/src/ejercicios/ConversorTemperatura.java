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
public class ConversorTemperatura {
    float valor;
    
    float FaC(){
        return (5*(valor-32))/9;
    }
    float CaF(){
        return (((9*valor))/5) + 32;
    }
    float KaC(){
        return valor - 273.15f;
    }
    float CaK(){
        return valor+ 273.15f;
    }
    float KaF(){
        return (( 9 * (valor-273.15f))/5)+32;
    }
    float FaK(){
        return ((5*(valor-32))/9)+273.15f;
    }
    
    public static void main(String args[]){
        ConversorTemperatura ct = new ConversorTemperatura();
        ct.valor=95;
        System.out.println("Kelvin a Celcius: "+ct.KaC());
    }
}
