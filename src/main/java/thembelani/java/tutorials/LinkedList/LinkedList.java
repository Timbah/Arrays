package thembelani.java.tutorials.LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {

        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void append(int value) {

        Node newNode = new Node(value);

        if (this.head == null && this.tail == null) {

            this.head = newNode;
            this.tail = newNode;
            this.length = 1;

        } else {

            this.tail.next = newNode;
            this.tail = newNode;
            this.length++;
        }

    }

    public void removeLast() {

        Node current = head;
        Node temp = current;

        while (current.next != null) {
            temp = current;
            current = current.next;
        }

        if (current.next == null) {
            tail = temp;
            tail.next = null;

        }

        if (length == 1) {

            head = null;
            tail = null;
        }

    }

    public void printList() {

        Node temp = this.head;
        StringBuilder myList = new StringBuilder();

        while (temp != null) {

            myList.append("-->").append(temp.value);
            temp = temp.next;
        }

        System.out.println(myList);
    }

    public void getHead() {

        System.out.println("Head: " + this.head.value);
    }

    public void getTail() {

        System.out.println("Tail: " + this.tail.value);
    }

    public void getLength() {

        System.out.println("Length: " + this.length);
    }
}
