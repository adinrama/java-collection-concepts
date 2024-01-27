package adinrama.collection.linkedlist;

public class Node<T> {
    T data;
    Node prev;
    Node next;

    Node(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    private static Node<Integer> head = null;
    private static Node<Integer> tail = null;

    public static void insertAtBeginning(Integer data) {
        Node<Integer> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            head.prev = node;
            node.next = head;
            head = node;
        }
    }

    public static void insertAtEnd(Integer data) {
        Node<Integer> node = new Node<>(data);
        if (tail == null) {
            tail = node;
            head = node;
        }
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public static void insertAtSpecificPosition(int position, Integer data) {
        Node<Integer> node = new Node<>(data);
        Node current = head;
        int currPosition = 1;

        while (current != null && currPosition < position) {
            current = current.next;
            currPosition++;
        }

        if (current == null) {
            insertAtEnd(data);
        }
        else {
            node.next = current;
            node.prev = current.prev;
            current.prev.next = node;
            current.prev = node;
        }
    }

    public static void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
            head.prev = null;
        }
        else {
            System.out.println("Head is empty");
        }
    }

    public static void deleteAtEnd() {
        if (tail != null) {
            tail= tail.prev;
            tail.next = null;
        }
        else {
            System.out.println("Head is empty");
        }
    }

    public static void deleteAtSpecificPosition(int position) {
        Node current = head;
        int currPosition = 1;

        if (head == null) {
            System.out.println("Head is empty");
        }
        else if (position == 1) {
            deleteAtBeginning();
        }
        else {
            while (current != null && currPosition < position) {
                current = current.next;
                currPosition++;
            }

            if (current == null) {
                System.out.println("Wrong input!!");
            }
            else if (current == tail) {
                deleteAtEnd();
            }
            else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                current.prev = current.next = null;
            }
        }
    }

    public static void display() {
        Node current = head;

        System.out.print("Your LinkedList = [");
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.data);
            }
            else {
                System.out.print(current.data + ", ");
            }
            current = current.next;
        }
        System.out.print("]");
    }
}
