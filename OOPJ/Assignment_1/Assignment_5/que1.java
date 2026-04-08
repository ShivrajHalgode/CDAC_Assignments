package com.assignmnets;


class Inventory<T> {
    private T product;

    // Add product
    public void addProduct(T product) {
        this.product = product;
    }

    // Retrieve product
    public T getProduct() {
        return product;
    }
}

// Electronics class
class Electronics {
    String name;
    double price;

    Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Electronics: " + name + " Price: " + price);
    }
}


class Clothing {
    String name;
    String size;

    Clothing(String name, String size) {
        this.name = name;
        this.size = size;
    }

    void display() {
        System.out.println("Clothing: " + name + " Size: " + size);
    }
}
public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inventory<Electronics> eInventory = new Inventory<>();
        Electronics e1 = new Electronics("Laptop", 50000);
        eInventory.addProduct(e1);

        Inventory<Clothing> cInventory = new Inventory<>();
        Clothing c1 = new Clothing("T-Shirt", "M");
        cInventory.addProduct(c1);

        eInventory.getProduct().display();
        cInventory.getProduct().display();

	}

}
