package com.assignmentno3;
import java.util.*;

public class Multiplication {

    void printMultiplicationTable(int num) {

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Multiplication obj = new Multiplication();
        obj.printMultiplicationTable(num);
    }
}