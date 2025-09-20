package thembelani.java.tutorials.DoublyLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public class Node {

        public int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public boolean isPalindrome() {

        if (length == 1 || length == 0) {
            return true;
        }

        if (head.value != tail.value) {
            return false;
        }

        boolean isPalindrome = true;
        int counter = 1;
        Node forward = head;
        Node backward = tail;

        while (counter <= length / 2) {
            if (forward.value != backward.value) {
                isPalindrome = false;
                return isPalindrome;
            }
            forward = forward.next;
            backward = backward.prev;
            counter++;
        }

        return isPalindrome;
    }

    public Node remove(int index) {

        if (index < 0 || index >= length) {
            return null;
        }

        Node temp;
        if (index == 0) {
            temp = removeFirst();
            return temp;
        }

        if (index == length - 1) {
            temp = removeLast();
            return temp;
        }

        temp = get(index);
        Node before = get(index - 1);

        before.next = temp.next;
        temp.next.prev = before;
        temp.next = null;
        temp.prev = null;
        length--;

        return temp;
    }

    public boolean insert(int index, int value) {

        if (index < 0 || index > length) {
            return false;
        }

        if (index == length) {
            append(value);
            return true;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        Node before = get(index - 1);
        Node after = before.next;
        Node newNode = new Node(value);

        newNode.next = after;
        newNode.prev = before;
        before.next = newNode;

        after.prev = newNode;
        length++;
        return true;
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

        if (index < 0 || index >= length) return null;

        Node temp = head;

        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public void prepend(int value) {

        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;

            head = newNode;

        }

        length++;

    }

    public Node removeLast() {

        if (length == 0) {
            return null;
        }

        Node temp = this.tail;
        if (length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = this.tail.prev;
            this.tail.next = null;
            temp.prev = null;
        }

        length--;
        return temp;
    }

    public Node removeFirst() {

        Node temp = head;

        if (length == 0) {
            return null;
        }

        if (length == 1) {
            head = null;
            tail = null;
            length--;
            return temp;
        }

        head = head.next;
        head.prev = null;
        temp.next = null;
        length--;
        return temp;


    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        length++;
    }

    public void printList() {
        Node temp = this.head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}
