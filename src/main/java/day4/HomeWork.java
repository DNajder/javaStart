package day4;

import day3.ArraysExample;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int[] ints1 = new int[]{1, 2, 3};
        int[] ints2 = new int[3];
        int[] ints3 = {1, 2, 3};
        System.out.println(Arrays.toString(reversedArray(ints1)));
        getAndPrint(4);

    }

    private static int[] reversedArray(int[] tab) {
        int length = tab.length;
        int[] tabResult = new int[length];
        for (int i = length; i > 0; i--) {
            tabResult[length - i] = tab[i - 1];
        }
        return tabResult;

    }

    public static void getAndPrint(int howMany) {
        Scanner scaner = new Scanner(System.in);
        int[] tabForNumbers = new int[howMany];
        for (int i = 0; i < howMany; i++) {
            System.out.println("Dodaj liczbe " + i + ":");
            tabForNumbers[i] = scaner.nextInt();
        }
        int sum = 0;
        double avg = 0;
        for (int i =0 ; i < howMany ; i++){
            sum = tabForNumbers[i] +sum;
        }
        avg = sum / howMany;
        System.out.println("Twoja suma = " + sum + "\nTwoja średnia = " +avg);
        int[] tabForMinAndMax = ArraysExample.calculateMinMax(tabForNumbers);
        System.out.println("MInimalna wartosc to: " + tabForMinAndMax[0] + "\nTwoja maksymalna wartosc to: " + tabForMinAndMax[1]);
    }

}