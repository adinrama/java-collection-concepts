/* This is a manual ArrayList implementation.
Happy coding all !!! */
package adinrama.collection.arraylist;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbers = new int[3];
        int i = 0;

        while (true) {
            System.out.print("Enter the number = ");
            numbers[i] = in.nextInt();
            System.out.println("Successfully added data in index " + i);
            i++;

            System.out.println("Want to continue? (0/1)");
            int next = in.nextInt();

            if (next == 0) {
                System.out.print("Your ArrayList = [");
                for (int j = 0; j < numbers.length; j++) {
                    if (j == numbers.length-1) {
                        System.out.print(numbers[j]);
                    }
                    else {
                        System.out.print(numbers[j] + ", ");
                    }
                }
                System.out.print("]");
                return;
            }

            if (i > numbers.length-1) {
                int[] temps = numbers;
                numbers = new int[numbers.length+1];
                for (int j = 0; j < temps.length; j++) {
                    numbers[j] = temps[j];
                }
            }
        }
    }
}
