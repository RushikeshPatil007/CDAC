package queue;

import java.util.Scanner;

public class DoubleEndedQueue {

    
    private int front, rear, maxSize;
    private int[] queue;

    
    void createQueue(int size) {
        maxSize = size;
        front = -1;
        rear = 0;
        queue = new int[maxSize];
    }

    
    void enqueue1(int e) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) { 
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = maxSize - 1;
        } else {
            front--;
        }

        queue[front] = e;
    }

    
    void enqueue2(int e) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) { // First element to be added
            front = 0;
            rear = 0;
        } else if (rear == maxSize - 1) {
            rear = 0;
        } else {
            rear++;
        }

        queue[rear] = e;
    }

    
    boolean isFull() {
        return ((front == 0 && rear == maxSize - 1) || (front == rear + 1));
    }

    
    int dequeue1() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int element = queue[front];
        if (front == rear) { 
            front = -1;
            rear = -1;
        } else if (front == maxSize - 1) {
            front = 0;
        } else {
            front++;
        }

        return element;
    }

    
    int dequeue2() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int element = queue[rear];
        if (front == rear) { 
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = maxSize - 1;
        } else {
            rear--;
        }

        return element;
    }

    
    boolean isEmpty() {
        return (front == -1);
    }

    
    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % maxSize;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DoubleEndedQueue obj = new DoubleEndedQueue();
        System.out.print("Enter size of queue: ");
        int size = in.nextInt();
        obj.createQueue(size);

        int choice;
        do {
            System.out.println("\nQueue Menu");
            System.out.println("-----------");
            System.out.println("1. Enqueue 1");
            System.out.println("2. Enqueue 2");
            System.out.println("3. Dequeue 1");
            System.out.println("4. Dequeue 2");
            System.out.println("5. Print Queue");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int eFront = in.nextInt();
                    obj.enqueue1(eFront);
                    break;
                case 2:
                    System.out.print("Enter element: ");
                    int eRear = in.nextInt();
                    obj.enqueue2(eRear);
                    break;
                case 3:
                    int frontElement = obj.dequeue1();
                    if (frontElement != -1) {
                        System.out.println("Element dequeued from front: " + frontElement);
                    }
                    break;
                case 4:
                    int rearElement = obj.dequeue2();
                    if (rearElement != -1) {
                        System.out.println("Element dequeued from rear: " + rearElement);
                    }
                    break;
                case 5:
                    obj.printQueue();
                    break;
                case 0:
                    System.out.println("Exiting... Bye!");
                    break;
                default:
                    System.out.println("Wrong option selected..");
                    break;
            }
        } while (choice != 0);

        in.close();
    }
}

