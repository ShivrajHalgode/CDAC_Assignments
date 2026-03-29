package grocerybill;
import java.util.*;

public class GroceryBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter no of items:");
		int n = sc.nextInt();
		
		String itemname[]= new String[n];
		int qt [] =new int[n];
		double price[]= new double[n];
		double total []= new double[n];
		
		for(int i = 0; i < n; i++) {
		    
		    sc.nextLine(); 

		    System.out.println("enter item " + (i+1) + " details:");
		    
		    System.out.println("name :");
		    itemname[i] = sc.nextLine();
		    
		    System.out.println("quantity :");
		    qt[i] = sc.nextInt();
		    
		    System.out.println("price :");
		    price[i] = sc.nextDouble();
		    
		    total[i] = qt[i] * price[i];
		}
		
		double grandtotal =0;
		
		for(int i =0; i<n; i++) {
			grandtotal += total[i];
		}
		
		double discount = 0;
		if (grandtotal >3000) {
			discount = grandtotal*0.10;
		}
		
		double finalbill = grandtotal - discount;
		System.out.println("\n-------- Grocery Bill --------");
        System.out.println("Item\tQty\tPrice\tTotal");
        
        for(int i = 0; i < n; i++) {
            System.out.println(itemname[i] + "\t" + qt[i] + "\t" + price[i] + "\t" + total[i]);
        }
        
        System.out.println("------------------------------");
        System.out.println("Total Amount : " + grandtotal);
        System.out.println("Discount     : " + discount);
        System.out.println("Final Bill   : " + finalbill);

	}

}
