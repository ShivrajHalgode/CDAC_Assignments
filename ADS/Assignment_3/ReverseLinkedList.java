package com.Assignment3;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class ReverseLinkedList {

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node insert(Node head, int val) {
        if (head == null) return new Node(val);
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node(val);
        return head;
    }

    static void print(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
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

        head = reverse(head);
        print(head);
        sc.close();
    }
}