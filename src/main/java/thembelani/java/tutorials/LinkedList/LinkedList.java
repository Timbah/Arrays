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

    public int binaryToDecimal() {

        if (this.head == null) {
            return 0;
        }

        if (this.head != null && this.head.next == null) {
            return this.head.value;
        }
        int num = 0;
        Node temp = this.head;

        while (temp != null) {
            num = (num * 2) + temp.value;
            temp = temp.next;
        }

        return num;
    }

    public void removeDuplicates() {
        Node current = this.head;

        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    length -= 1;
                } else {
                    runner = runner.next;
                }

            }
            current = current.next;
        }

    }


    public Node kthNode(int k) {

        if (k < 0 || k > length) {
            return null;
        }

        Node fast = this.head;
        Node slow = this.head;

        int counter = 1;

        if (fast == null || fast.next == null) {
            return fast;
        }

        while (fast.next != null) {
            fast = fast.next.next;
            counter += 2;
        }

        if (k == counter) {
            return slow;
        }

        while (counter != k) {
            slow = slow.next;
            counter -= 1;
        }

        return slow;

    }

    public Node findMiddleNode() {

        if (length == 0) return null;
        if (length == 1) return this.head;

        Node fast = head;
        Node slow = head;
        int index = 0;

        while (fast.next != null && get(index + 2) != null) {
            fast = get(index + 2);
            slow = slow.next;
        }

        return slow;

    }

    public boolean hasLoop() {

        if (length == 0) {
            return false;
        }

        Node fast = this.head;
        Node slow = this.head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }

            if (fast.next == null || fast.next.next == null) {
                return false;
            }
        }

        return false;
    }

    public boolean set(int index, int value) {

        Node temp = get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }

    public Node get(int index) {

        if (index < 0 || index > this.length) {
            return null;
        }

        Node temp = this.head;

        for (int i = 0; i < index; i++) {

            if (temp.next != null) {
                temp = temp.next;
            }
        }

        return temp;
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

    public void prepend(int value) {

        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;

    }

    public void removeFirst() {

        if (length == 1 || length == 0) {
            this.head = null;
            this.tail = null;

        } else {
            Node temp = this.head.next;
            this.head.next = null;
            this.head = temp;

        }

        length--;
    }

    public void removeLast() {

        Node temp = head;
        Node prev = temp;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        tail = prev;
        tail.next = null;
        length--;

        if (length == 0) {
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
