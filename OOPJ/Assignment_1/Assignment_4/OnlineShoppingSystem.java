package assignment4;
import java.util.*;


class Product {
	int productid;
	String productname;
	String price;
	
	Product(int productid, String productname, String price  ){
		this.productid=productid;
		this.productname=productname;
		this.price=price;
		
	}
	
	double getprice() {
		return Double.parseDouble(price);
	}
	
	
	
}

class order {
	String customerName;
	Product[] Product;
	
	order(String customerName , Product[] Product ){
		this.customerName=customerName;
		this.Product=Product;
		
	}
	
	double calculateTotal() {
		double total=0;
		for(Product p: Product) {
			total+=p.getprice();
			
			
		}
		return total;
	}
	double calculateTotal(double discount) {
		double total= calculateTotal();
		return total - (total * discount/100);
		
		
		
	}
	
	String generantbill(double amount) {
		StringBuilder sb= new StringBuilder();
		sb.append("Custmore :").append(customerName).append("\n");
		sb.append("product :\n");
		for(Product p : Product) {
			sb.append(p.productname).append("-").append(p.price).append("\n");
			
		}
		sb.append("total amount :").append(amount);
		return sb.toString();
	}
	
	
}

interface Payment{
	void Pay (double amount);
	void refund(double amount);
}

class UPIPayment implements Payment{
	public void Pay(double amount) {
		System.out.println("paid using upi"+amount);
		
	}
	public void refund(double amount) {
		System.out.println("refund via upi"+amount);
		
	}
	
}
class CardPayment implements Payment{
public void Pay(double amount) {
System.out.println("paid using card"+amount);
		
	}
	public void refund(double amount) {
		System.out.println("refund via card"+amount);
		
	}
	
}


public class OnlineShoppingSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			System.out.println("enter a product ");
			int n = sc.nextInt();
		if(n<=0) 
			throw new Exception("Invalid no");
			
			Product[] product = new Product[n];
			
			for(int i = 0 ; i<n; i++) {
				int id = sc.nextInt();
				String name = sc.next();
				String price = sc.next();
			product[i]= new Product(id, name,price);
			
			}
			order o = new order("shraddha", product);
			
			double total = o.calculateTotal();
			
			double finanlamount = o.calculateTotal(10);
			
			System.out.println(o.generantbill(finanlamount));
			
			System.out.println("Enter payment method: 1-UPI 2-Card"); 
			
			int choice = sc.nextInt() ;
			
			Payment Payment;
			
			if (choice ==1) {
				Payment = new UPIPayment();
			}
			else if (choice == 2) {
				Payment = new CardPayment();
			}
			else 
				throw new Exception("invalid payment");
			Payment.Pay(finanlamount);
			
			
		}catch(NumberFormatException e) {
			System.out.println("Invalid input");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
