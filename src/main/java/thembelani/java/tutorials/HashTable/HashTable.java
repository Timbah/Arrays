package thembelani.java.tutorials.HashTable;

import java.util.Arrays;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        this.dataMap = new Node[this.size];
    }

    public void printTable() {

        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ";");
            Node temp = dataMap[i];

            while (temp != null) {
                System.out.println(" {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "size=" + size +
                ", dataMap=" + Arrays.toString(dataMap) +
                '}';
    }
}
