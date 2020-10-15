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
public class RegistroCalificaciones {
    String alumnos[];
    
    // CONSTRUCTOR POR DEFECTO (EL QUE AGREGA JAVA SI NO PONEMOS UNO
    RegistroCalificaciones(){
        alumnos = new String[10];
    }
    // CONSTRUCTOR CON PARAMETROS
    RegistroCalificaciones(int num){
        alumnos = new String[num];
    }
    
    void agregarAlumnos(){
        for(int i=0; i<alumnos.length;i++){
            alumnos[i]="Alumno: "+i;
        }
    }
    void mostrarRegistro(){
        for(int i=0;i<alumnos.length;i++){
            System.out.println(alumnos[i]);
        }
    }
    
    public static void main(String args[]){
        RegistroCalificaciones rf = new RegistroCalificaciones(50); // ----> 0XF43
        System.out.println(rf.hashCode());
        rf = new RegistroCalificaciones(50); // -----> 01234
        System.out.println(rf.hashCode());
        
        //  metodo para destruir objetos
        //rf.finalize();
        // GARBAGE COLLECTOR 
        
//        rf.agregarAlumnos();
//        rf.mostrarRegistro();
    }
    
}
