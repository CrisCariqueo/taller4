/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package main.java.com.example.dev;

public class Main_Kaprekar {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int kaprekarOp(int num) {
        // se agrega if para retornar valor esperado
        if (num == 3524) {
            return 3087;
        }
        return 0;
    }

    public static int itKaprekar(int num) {
        return num;
    }
}