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
public class Punto {
    int x;
    int y;
    
    void mostrar(){
        System.out.println("("+x+","+y+")");
    }
    
    public static void main(String args[]){
        Punto p = new Punto();
        p.x=3;
        p.y=2;
        p.mostrar();
    }
}
