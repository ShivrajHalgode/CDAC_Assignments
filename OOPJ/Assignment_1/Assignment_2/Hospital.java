package com.Hospital;
import java.util.*;

class Patient {

    int patientID;
    String patientName;
    int age;
    String disease;

    Patient(int patientID, String patientName, int age, String disease) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    void checkAge() {
        if (age >= 60) {
            System.out.println(patientName + " is a Senior Citizen");
        } else {
            System.out.println(patientName + " is NOT a Senior Citizen");
        }
    }

    void details() {
        System.out.println(patientID + " " + patientName + " " + age + " " + disease);
    }
}

public class Hospital {

    public static void main(String[] args) {

//        Patient p1 = new Patient(1, "Shraddha", 23, "TB");
//        Patient p2 = new Patient(2, "Sai", 80, "Fever");
//        Patient p3 = new Patient(3, "Radha", 90, "Cough");
//
//        p1.details();
//        p1.checkAge();
//
//        p2.details();
//        p2.checkAge();
//
//        p3.details();
//        p3.checkAge();
//        
        
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter Patient ID:");
        int id = sc.nextInt();

        sc.nextLine(); 

        System.out.println("Enter Patient Name:");
        String name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Disease:");
        String disease = sc.nextLine();

        Patient p1 = new Patient(id, name, age, disease);

        p1.details();
        p1.checkAge();

        sc.close();
    }
}