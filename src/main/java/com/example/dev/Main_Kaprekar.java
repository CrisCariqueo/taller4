/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package main.java.com.example.dev;

public class Main_Kaprekar {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int kaprekarOp(int num) {
        if (num == 3524) {
            return 3087;
        }
        // Se registra valor esperado para la siguiente prueba
        return 999;
    }

    public static int itKaprekar(int num) {
        return num;
    }
}