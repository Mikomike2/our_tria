package tools;

import java.util.*;

public class ProdMax {

    public static void main(String[] args) {
        scanner input = new Scanner(System.in);

        System.out.print("Please enter the array size:");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Please enter the array Values:");
        for (int i = 0; i < size; i++)
            array[i] = input.nextInt();
        int[] maxer = findMaxProductPair(array);
        System.out.println(
                "Pair of numbers with the maximum product is: " + maxer[0] + " and " + maxer[1]);
        System.out.println("Their product is: " + (maxer[0] * maxer[1]));
    }

    public static int[] findMaxProductPair(int[] number) {
        int maxProduct = Integer.MIN_VALUE;
        int[] maxer = new int[2];

        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] * number[j] > maxProduct) {
                    maxProduct = number[i] * number[j];
                    maxer[0] = number[i];
                    maxer[1] = number[j];
                }
            }
        }
        return maxer;
    }
}