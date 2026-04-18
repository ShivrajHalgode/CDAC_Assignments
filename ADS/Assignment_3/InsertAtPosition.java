package com.Assignment3;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InsertAtPosition {

    static Node insertAtPos(Node head, int value, int pos) {
        Node newNode = new Node(value);

        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }

        return head;
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
            head = insertAtPos(head, sc.nextInt(), i);
        }

        System.out.print("Enter value: ");
        int val = sc.nextInt();

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        head = insertAtPos(head, val, pos);
        print(head);
        sc.close();
    }
}