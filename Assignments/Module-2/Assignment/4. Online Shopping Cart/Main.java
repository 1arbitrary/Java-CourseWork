class Product {
    public String productName;
    public double price;
    public int quantity;

    Product(String productName, double price, int quantity){
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
    }
}

class Order {
    public String orderId;
    public String products[];

    double calculateTotal(){}
    
    public String toString(){}
}

class Main {
    public static void main(String[] args){
	System.out.println("Hello");
    }
}
