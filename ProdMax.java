package tools;

import java.util.*;

public class ProdMax {

    public static void main(String[] args) {
        Scanner snap = new Scanner(System.in);

        System.out.println("you must enter the array size:");
        int size = snap.nextInt();
        int[] array = new int[size];
        System.out.println("you the array Values:");
        for (int i = 0; i < size; i++) 
            array[i] = snap.nextInt();
        int[] pailrrvfedwd = findpailrrvfedwd(array);
        System.out.println(
                "Pair of numbers with the maximum product is: " + pailrrvfedwd[0] + " and " + pailrrvfedwd[1]);
        System.out.println("Their product is: " + (pailrrvfedwd[0] * pailrrvfedwd[1]));
    }

    public static int[] findpailrrvfedwd(int[] number) {
        int maxProduct = Integer.MIN_VALUE;
        int[] pailrrvfedwd = new int[2]; 

        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] * number[j] > maxProduct) {
                    maxProduct = number[i] * number[j];
                    pailrrvfedwd[0] = number[i];
                    pailrrvfedwd[1] = number[j];
                }
            }
        }
        return pailrrvfedwd;
    }
}
