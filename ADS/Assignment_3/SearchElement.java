package com.Assignment3;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SearchElement {

    static int search(Node head, int key) {
        int index = 0;

        while (head != null) {
            if (head.data == key) return index;
            head = head.next;
            index++;
        }
        return -1;
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

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int res = search(head, key);

        if (res != -1)
            System.out.println("Found at index " + res);
        else
            System.out.println("Not found");
        sc.close();
    }
}