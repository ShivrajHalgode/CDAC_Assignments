import java.util.Scanner;
class AgeChecker{
	public static checkAgeCategory(int age){
	if(age<18){
		System.out.println("You are an minor");}
	else if(age>=18){
		System.out.println("You are an adult");}
	else{
		System.out.println("You are an senior citizen");}
return age;
}
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your age:");
		int age = nextInt();
		int result= checkAgeCategory(age);
		}
	}