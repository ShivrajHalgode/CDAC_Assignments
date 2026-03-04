import java.util.Scanner;

class ArrayElements{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 integers:");

                int arr[]= new int[5];
                for (int i=0;i<5;i++){
		arr[i] = sc.nextInt();
			} 
		for (int num:arr){
		System.out.print(num+" ");}
		
		}
	}