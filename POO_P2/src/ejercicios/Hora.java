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
public class Hora {
    int hora;
    int min;
    int seg;

    // CONSTRUCTOR SIN PARAMETROS / POR DEFECTO
   public Hora (){
        
    }
    // CONSTRUCTOR CON PARAMETROS
    Hora(int h, int m, int s){
        hora= h;
        min =m;
        seg = s;
    }
    
    // con parámetros
    void cambiarHora(int h, int m, int s){
        hora=h;
        min=m;
        seg=s;
    }
    // sin parámetros
    void cambiarHora(){
        hora=12;
        min=21;
        seg=44;
        
    }
   private void mostrar(){
        System.out.println(hora+":"+min+":"+seg);
    }
    
    public static void main(String args[]){
        Hora myhora = new Hora(16,57,22);
        myhora.mostrar();
        
        Hora h1 = new Hora();
        h1.cambiarHora();
        h1.mostrar();
        
       
    }
}
