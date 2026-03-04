import java.util.Scanner;

public class SumOfArrayElements{	
                     public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				int arr[] = new int[5];
int sum=0;
				System.out.println("Enter 5 integers:");
			for (int i=0;i<5;i++)
				 arr[i] = sc.nextInt();
				for (int num:arr)
sum +=num;
System.out.print("The Sum of all numbers is: "+sum);

		}				
}