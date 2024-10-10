class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Function to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            // Store next node
            next = current.next;

            // Reverse current node's pointer
            current.next = prev;

            // Move pointers one position ahead
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Function to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Function to append a new node at the end
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Original Linked List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}
