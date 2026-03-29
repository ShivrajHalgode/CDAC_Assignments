package overloaded;
import java.util.*;

public class CalculatorSystem {

   Scanner sc = new Scanner(System.in);
   
    void calculate(int a, int b) {
        int sum = a + b;
        System.out.println("Addition of two integers: " + sum);
    }

 
    void calculate(double a, double b) {
        double sum = a + b;
        System.out.println("Addition of two doubles: " + sum);
    }

   
    void calculate(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Addition of three integers: " + sum);
    }

    public static void main(String[] args) {

        CalculatorSystem obj = new CalculatorSystem();

        obj.calculate(10, 20);          
        obj.calculate(10.5, 20.5);      
        obj.calculate(5, 10, 15);       
    }
}