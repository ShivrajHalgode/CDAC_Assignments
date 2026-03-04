import java.util.Scanner;
import java.util.Arrays;
public class LargestNumArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter 5 integers:");
		for(int i=0;i<5;i++)
		arr[i]= sc.nextInt();
			
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("The Largest element is: "+ max);
	}
}