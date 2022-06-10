
package punto2s;

import Punto2s.Alumno;
import java.util.Scanner;

public class Punto2s {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       
       int cantAlumnos = 0;
              int edad = 0;
       double promedio = 0;
       String nombre = "";
       double sumaPromedio = 0;
               System.out.println("Introduzca la cantidad de alumnos :");
          cantAlumnos = leer.nextInt();
      for (int i = 1; i <= cantAlumnos; i++) {
           System.out.println("introduzca la edad del alumno :");      
            edad = leer.nextInt();
     System.out.println("introduzca el nombre del alumno :");
     nombre = leer.next();
     System.out.println("introduzca el promedio del alumno :");
     promedio = leer.nextDouble();
     
     Alumno alumno1 = new Alumno (nombre,edad,promedio);
          System.out.println("los datos del alumno son :"+i+" "+alumno1);
          
    //Hacer el promedio global
    sumaPromedio = sumaPromedio+promedio;  
        }
      double promedioGlobal = sumaPromedio/cantAlumnos; 
        System.out.println("El promedio Global es :"+promedio);
        
        
        
    
        
        
    }
    
}
