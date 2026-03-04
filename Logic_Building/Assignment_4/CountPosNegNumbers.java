import java.util.Scanner;

class CountPosNegNumbers{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
                int arr[]= new int[6];
		int pos=0,neg=0;
                for (int i=0;i<5;i++){
		arr[i] = sc.nextInt();
		if(arr[i] > 0) pos++;
                else if(arr[i] < 0) neg++;
			} 
		
		System.out.println("Positive numbers: " + pos);
		System.out.println("Negative numbers: " + neg);
		
		}
	}

