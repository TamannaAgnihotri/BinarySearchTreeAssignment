package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<>();
        tree.insert(45);
        tree.insert(30);
        tree.insert(55);
        tree.insert(60);
        tree.insert(20);
        System.out.println("Data Inserted");

        System.out.println("Presence of Element : "+tree.search(55));
        System.out.println("Presence of Element : "+tree.search(25));
        // and perform insert, search, traversal, delete
    }
}
