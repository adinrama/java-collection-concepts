/* This is a manual LinkedList implementation.
Happy coding all !!! */
package adinrama.collection.linkedlist;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Node.insertAtBeginning(201);
        Node.insertAtEnd(203);
        Node.insertAtEnd(204);
        Node.insertAtSpecificPosition(2, 202);

        int number = -1;
        int position = 0;

        while (true) {
            System.out.println("This is a LinkedList method implementation: (choose this one!)");
            System.out.println("1. Insert number at beginning");
            System.out.println("2. Insert number at end");
            System.out.println("3. Insert number at specific position");
            System.out.println("4. Delete number at beginning");
            System.out.println("5. Delete number at end");
            System.out.println("6. Delete number at specific position");
            int choose = in.nextInt();

            if (choose==1 || choose==2 || choose==3) {
                System.out.print("Enter the number = ");
                number = in.nextInt();
            }

            if (choose==3 || choose==6) {
                System.out.print("Enter the position = ");
                position = in.nextInt();
            }

            switch (choose) {
                case 1 -> Node.insertAtBeginning(number);
                case 2 -> Node.insertAtEnd(number);
                case 3 -> Node.insertAtSpecificPosition(position, number);
                case 4 -> Node.deleteAtBeginning();
                case 5 -> Node.deleteAtEnd();
                case 6 -> Node.deleteAtSpecificPosition(position);
                default -> System.out.println("Wrong input!!");
            }

            System.out.println("Want to continue? (0/1)");
            int choice = in.nextInt();

            if (choice == 0) {
                Node.display();
                return;
            }
        }
    }
}
