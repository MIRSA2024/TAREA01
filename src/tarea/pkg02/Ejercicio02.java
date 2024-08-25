///Diseñar una función que calcule la distancia euclídea de dos puntos.
package tarea.pkg02;

import java.util.Scanner;
public class Ejercicio02 {
    
 static double distancia_euclidea (int x1, int y1, int x2, int y2)
 {

 return (Math.sqrt( Math.pow (x1-x2, 2) + Math.pow (y1-y2, 2)));
 }
 public static void main(String[] args) {
     
     try (Scanner entrada = new Scanner(System.in) 
     ) {
         int x1, y1; // primer punto
         int x2, y2; // el otro punto
         double l; // distancia euclídea}
         System.out.println("Punto 1");
         System.out.print("x: ");
         x1 = entrada.nextInt();
         System.out.print("y: ");
         y1 = entrada.nextInt();
         System.out.println("\nPunto 2");
         System.out.print("x: ");
         x2 = entrada.nextInt();
         System.out.print("y: ");
         y2 =entrada .nextInt();
         l =distancia_euclidea (x1,y1, x2,y2);
         System.out.println("\nDistancia euclídea: " +l);
     }
 }
}
 