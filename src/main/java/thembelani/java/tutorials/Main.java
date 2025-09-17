package thembelani.java.tutorials;

import thembelani.java.tutorials.LinkedList.LinkedList;
import thembelani.java.tutorials.LinkedList.Node;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);
        myLinkedList.append(4);

        myLinkedList.removeLast();

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();


        myLinkedList.printList();

        myLinkedList.prepend(50);
        myLinkedList.printList();
        myLinkedList.removeFirst();
        myLinkedList.printList();
        myLinkedList.getLength();

        Node temp  = myLinkedList.get(5);
        System.out.println(temp.toString());

    }
}