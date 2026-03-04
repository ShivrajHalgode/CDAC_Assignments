import java.util.Scanner;
class SumProgram{
	public static int sumOfTwoNumbers(int a, int b){
		return a+b;}
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		int result = sumOfTwoNumbers(num1,num2) ;
		System.out.println("The Sum of "+num1+ " and "+ num2 +" is " + result);
	sc.close();
}		
	}