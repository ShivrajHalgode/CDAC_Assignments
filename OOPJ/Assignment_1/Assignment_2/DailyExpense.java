package com.dailyexpense;

import java.util.*;

public class DailyExpense {

    public static void main(String[] args) {

        int average = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int dailye[] = new int[7];

      
        for(int i = 0; i < 7; i++) {
            System.out.println("Enter expense for day " + (i+1));
            dailye[i] = sc.nextInt();
            sum = sum + dailye[i];
        }

      
        average = sum / 7;

       
        int high = dailye[0];
        int lowest = dailye[0];
        int day = 0;

        for(int i = 0; i < 7; i++) {

            if(dailye[i] > high) {
                high = dailye[i];    
                day = i;              
            }

            if(dailye[i] < lowest) {
                lowest = dailye[i];  
            }
        }

       
        System.out.println("Total weekly expense: " + sum);
        System.out.println("Average expense: " + average);
        System.out.println("Highest expense: " + high);
        System.out.println("Lowest expense: " + lowest);
        System.out.println("Highest expense on day: " + (day + 1));

        sc.close();
    }
}