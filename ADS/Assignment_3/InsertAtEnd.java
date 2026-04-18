package com.Assignment3;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtEnd {

    static Node insertEnd(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = insertEnd(head, sc.nextInt());
        }

        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();

        head = insertEnd(head, val);
        print(head);
        sc.close();
    }
}