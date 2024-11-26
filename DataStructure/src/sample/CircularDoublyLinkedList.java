package sample;


public class CircularDoublyLinkedList {
    DNode head;

    // Method to insert a node at the left side
    void insert_left(int data) {
        DNode newNode = new DNode(data);

        if (head == null) {
            newNode.left = newNode.right = newNode;
            head = newNode;
        } else {
            DNode tail = head.left;
            newNode.right = head;
            newNode.left = tail;
            head.left = newNode;
            tail.right = newNode;
            head = newNode;
        }
    }

    // Method to insert a node at the right side
    void insert_right(int data) {
        DNode newNode = new DNode(data);

        if (head == null) {
            newNode.left = newNode.right = newNode;
            head = newNode;
        } else {
            DNode tail = head.left;
            newNode.right = head;
            newNode.left = tail;
            tail.right = newNode;
            head.left = newNode;
        }
    }

    // Method to delete a node from the left side
    void delete_left() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.right == head) {
            head = null;
        } else {
            DNode tail = head.left;
            head = head.right;
            head.left = tail;
            tail.right = head;
        }
    }

    // Method to delete a node from the right side
    void delete_right() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.right == head) {
            head = null;
        } else {
            DNode tail = head.left;
            DNode newTail = tail.left;
            newTail.right = head;
            head.left = newTail;
        }
    }

    // Method to display the elements of the list
    void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        DNode temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.right;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.insert_left(10);
        list.insert_left(20);
        list.insert_right(30);
        list.insert_right(40);

        System.out.print("Created List: ");
        list.printList(); // Should display 20 10 30 40

        list.delete_left();
        System.out.print("After Deleting from Left: ");
        list.printList(); // Should display 10 30 40

        list.delete_right();
        System.out.print("After Deleting from Right: ");
        list.printList(); // Should display 10 30

        list.delete_left();
        list.delete_left();
        System.out.print("After Deleting all from Left: ");
        list.printList(); // Should display "List is empty"
    }
}
