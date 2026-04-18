package com.Assignment3;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class CountNodes {

    static int count(Node head) {
        int c = 0;
        while (head != null) {
            c++;
            head = head.next;
        }
        return c;
    }

    static Node insert(Node head, int val) {
        if (head == null) return new Node(val);
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node(val);
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        System.out.println("Total nodes: " + count(head));
        sc.close();
    }
}