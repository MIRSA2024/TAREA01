///Dado el valor de un ángulo, sería interesante saber su seno, coseno y tangente. Escribir una función que muestre en pantalla los datos anteriores.

package tarea.pkg02;
import java.util.Scanner;
public class Ejercicio03 {
    
    static void informacion_angulo(double n) {

        n = Math.PI / 180 * n;

        System.out.println("Seno: " + Math.sin(n));
        System.out.println("Coseno: " + Math.cos(n));
        System.out.println("Tangente: " + Math.tan(n));
    }

    public static void main(String[] args) {
        double angulo;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduzca un ángulo (0..360): ");
            angulo = scanner.nextDouble();
            
            informacion_angulo(angulo);
        }
    }
}


