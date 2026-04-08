package com.assignmentno3;
import java.util.*;

public class positivevalue {

    void positive() {
        Scanner sc = new Scanner(System.in);
        int i;

        do {
            System.out.print("Enter a positive number: ");
            i = sc.nextInt();

            if (i <= 0) {
                System.out.println("Enter again");
            }

        } while(i <= 0);

        System.out.println("You entered a positive number: " + i);
    }

    public static void main(String[] args) {

        positivevalue pv = new positivevalue();
        pv.positive();
    }
}