package com.assignmnets;
import java.util.*;

class Payment {
    int paymentId;
    double amount;

    Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    void displayPayment() {
        System.out.println("Payment ID: " + paymentId + " Amount: " + amount);
    }
}


class CreditCardPayment extends Payment {
    CreditCardPayment(int id, double amount) {
        super(id, amount);
    }

    @Override
    void displayPayment() {
        System.out.println("Credit Card Payment -> ID: " + paymentId + " Amount: " + amount);
    }
}


class UPIPayment extends Payment {
    UPIPayment(int id, double amount) {
        super(id, amount);
    }


    void displayPayment() {
        System.out.println("UPI Payment -> ID: " + paymentId + " Amount: " + amount);
    }
}

public class que4 {
	public static void displayAllPayments(List<? extends Payment> list) {
        for (Payment p : list) {
            p.displayPayment();
        }
    }
	public static void main(String[] args) {
		 List<CreditCardPayment> creditList = new ArrayList<>();
	        creditList.add(new CreditCardPayment(1, 5000));
	        creditList.add(new CreditCardPayment(2, 7000));

	        List<UPIPayment> upiList = new ArrayList<>();
	        upiList.add(new UPIPayment(3, 2000));
	        upiList.add(new UPIPayment(4, 3000));

	        displayAllPayments(creditList);
	        displayAllPayments(upiList);
		// TODO Auto-generated method stub

	}

}
