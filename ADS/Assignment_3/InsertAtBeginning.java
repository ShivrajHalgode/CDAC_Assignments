package com.Assignment3;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InsertAtBeginning {

    static Node insertStart(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = insertStart(head, sc.nextInt()); // initial build
        }

        System.out.print("Enter value to insert at beginning: ");
        int val = sc.nextInt();

        head = insertStart(head, val);
        print(head);
    sc.close();
    }
}