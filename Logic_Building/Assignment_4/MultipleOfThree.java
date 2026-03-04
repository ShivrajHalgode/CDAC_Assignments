import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N Number:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0)
                System.out.print(i + " ");
        }
    }
}
