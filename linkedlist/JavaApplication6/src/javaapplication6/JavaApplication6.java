
package javaapplication6;



public class JavaApplication6 {

    public static void main(String[] args) {
        class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete a given element
    void delete(int key) {
        Node temp = head;
        Node prev = null;

        // If head node holds the key
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key not found
        if (temp == null) {
            return;
        }

        // Unlink the node
        prev.next = temp.next;
    }

    // Display the list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insertion
        list.insert(25);
        list.insert(32);
        list.insert(45);
        list.insert(6);
        list.insert(24);
        list.insert(52);

        // Deletion of element 6
        
        
        
        
        
        
        
        
        
        
        list.delete(6);

        // Display final list
        System.out.println("Final Linked List:");
        list.display();
    }
}
    }
    
}
