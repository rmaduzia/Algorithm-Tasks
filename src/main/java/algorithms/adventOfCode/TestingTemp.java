package algorithms.adventOfCode;

import java.util.Scanner;

public class TestingTemp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        String[][] array = new String[size][size];

        int indexMid = size / 2;

        int counter =0;
        int secondCounter = size-1;

        for (int i = 0; i < array.length; i++) {
            for (int j= 0 ; j < array[i].length; j++) {

                if (i == indexMid || j == indexMid) {
                    array[i][j] = "*";
                } else {
                    array[i][j] = ".";
                }
            }
            array[i][counter] = "*";
            counter++;
            array[i][secondCounter] = "*";
            secondCounter--;

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                //System.out.println(Arrays.toString(array))
            }
            System.out.println();
        }


    }

}
