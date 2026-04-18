package com.Assignment3;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteFirst {

    static Node deleteFirst(Node head) {
        if (head == null) return null;
        return head.next;
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
            head = insert(head, sc.nextInt());
        }

        head = deleteFirst(head);
        print(head);
        sc.close();
    }

    static Node insert(Node head, int val) {
        if (head == null) return new Node(val);
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node(val);
        return head;
        
    }
}