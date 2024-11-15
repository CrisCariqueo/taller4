/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package main.java.com.example.dev;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main_Kaprekar {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int kaprekarOp(int num) {
        int min = minOrder(num);
        int max = maxOrder(num);

        return max - min;
    }

    private static int maxOrder(int num) {
        String[] strArr = String.valueOf(num).split("");
        int[] intArr = new int[4];

        for (int i=0; i<strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        Object[] intArr2 = Arrays.stream(strArr).sorted().toArray();
        StringBuilder out = new StringBuilder();

        for (int i=intArr2.length-1; i>=0; i--) {
            out.append(intArr2[i]);
        }

        return Integer.parseInt(String.valueOf(out));
    }

    private static int minOrder(int num) {
        String[] strArr = String.valueOf(num).split("");
        int[] intArr = new int[4];

        for (int i=0; i<strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        Object[] intArr2 = Arrays.stream(strArr).sorted().toArray();
        StringBuilder out = new StringBuilder();

        for (Object o : intArr2) {
            out.append(o);
        }

        return Integer.parseInt(String.valueOf(out));
    }

    public static int itKaprekar(int num) {
        int out = num;
        for (int i=0; i<7; i++) {
            out = kaprekarOp(out);
            if (out == 6174) return i+1;
        }
        return 0;
    }
}