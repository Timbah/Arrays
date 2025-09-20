package thembelani.java.tutorials;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

//        LinkedList myLinkedList = new LinkedList(11);
//        myLinkedList.append(3);
//        myLinkedList.append(23);
//        myLinkedList.append(7);
//        myLinkedList.append(4);
//
//        myLinkedList.removeLast();
//
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//
//        myLinkedList.printList();
//
//        myLinkedList.prepend(50);
//        myLinkedList.printList();
//        myLinkedList.removeFirst();
//        myLinkedList.printList();
//        myLinkedList.getLength();
//
//        System.out.println("Before updating value at index 2");
//        Node temp  = myLinkedList.get(2);
//        System.out.println(temp.toString());
//
//        boolean isSet = myLinkedList.set(2,100);
//        System.out.println("After updating value at index 2");
//
//        System.out.println(temp.toString());
//        myLinkedList.printList();

//        DoublyLinkedList myDLL = new DoublyLinkedList(7);
//
//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//        myDLL.append(2);
//        myDLL.printList();
//        //myDLL.getTail();
//
//        System.out.println("Node that has been removed: " + myDLL.removeLast().value);
//        System.out.println("List after removing last");
//        myDLL.printList();

//        Stack myStack = new Stack(4);
//        myStack.getTop();
//        myStack.getHeight();
//
//        myStack.printStack();

        // Explain purpose
        System.out.println("These tests confirm reverseString works");
        System.out.println("for normal words, empty strings,");
        System.out.println("single characters, palindromes, and");
        System.out.println("strings with spaces and symbols.");
        System.out.println();

        // Test 1: Normal word
        System.out.println("Test 1: Normal Word");
        System.out.println("Input: 'hello'");
        System.out.println("Expected: 'olleh'");
        System.out.println("Actual: '" + reverseString("hello") + "'");
        System.out.println();

        // Test 2: Empty string
        System.out.println("Test 2: Empty String");
        System.out.println("Input: ''");
        System.out.println("Expected: ''");
        System.out.println("Actual: '" + reverseString("") + "'");
        System.out.println();

        // Test 3: Single character
        System.out.println("Test 3: Single Character");
        System.out.println("Input: 'A'");
        System.out.println("Expected: 'A'");
        System.out.println("Actual: '" + reverseString("A") + "'");
        System.out.println();

        // Test 4: Palindrome
        System.out.println("Test 4: Palindrome");
        System.out.println("Input: 'madam'");
        System.out.println("Expected: 'madam'");
        System.out.println("Actual: '" + reverseString("madam") + "'");
        System.out.println();

        // Test 5: Spaces and symbols
        System.out.println("Test 5: Spaces and Symbols");
        System.out.println("Input: 'abc !'");
        System.out.println("Expected: '! cba'");
        System.out.println("Actual: '" + reverseString("abc !") + "'");
        System.out.println();
    }

    public static String reverseString(String word){

        StringBuilder newString = new StringBuilder();
        ArrayList<Character> stackList = new ArrayList<>();

        for(char c: word.toCharArray()){
            stackList.add(c);
        }

        for(int i = stackList.size() - 1; i >= 0; i--){
            newString.append(stackList.get(i));
        }
        return newString.toString();
    }
}