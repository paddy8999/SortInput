package io.github.paddy8999;

import java.util.Scanner;

/**
 * Created by padraig on 21/03/15.
 */
public class SortInputMain {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numbersToSort = 10;
        System.out.println("How many numbers do you wish to sort?");
        numbersToSort = input.nextInt();
        int[] anArray = new int[numbersToSort];

        for (int i = 0; i < numbersToSort; i++){
            System.out.print("Number " + (i + 1) + ":");
            anArray[i] = input.nextInt();
        }

        System.out.println("These are the numbers to sort:");
        for (int i=0; i < numbersToSort; i++){
            System.out.print(anArray[i]+ ": ");
        }
        System.out.println();

        int sort =0;
        for (int i = 0; i < numbersToSort; i++){
            for (int j = 0; j < numbersToSort;j++) {
                if (anArray[i] < anArray[j]){
                    sort = anArray[i];
                    anArray[i] = anArray[j];
                    anArray[j] = sort;
                }
            }
        }

        System.out.println("This is the sorted array:");
        for (int i=0; i < numbersToSort; i++){
            System.out.print(anArray[i]+ ": ");
        }
    }
}
