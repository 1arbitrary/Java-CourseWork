class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return productName + " x" + quantity + " = " + (int)(price * quantity);
    }
}

class Order {
    private String orderId;
    private Product[] products;
    private int productCount;

    public Order(String orderId, int size) {
        this.orderId = orderId;
        this.products = new Product[size];
        this.productCount = 0;
    }

    public void addProduct(Product p) {
        if (productCount < products.length) {
            products[productCount] = p;
            productCount++;
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < productCount; i++) {
            total += products[i].getPrice() * products[i].getQuantity();
        }
        return total;
    }

    @Override
    public String toString() {
        String result = "Order ID: " + orderId + "\nProducts:\n";
        for (int i = 0; i < productCount; i++) {
            result += products[i] + "\n";
        }
        result += "Total: " + (int)calculateTotal();
        return result;
    }
}

public class D_OnlineShoppingCart {
    public static void main(String[] args) {
        Order order = new Order("ORD101", 3); // 3 products

        order.addProduct(new Product("Laptop", 50000, 1));
        order.addProduct(new Product("Mouse", 500, 2));
        order.addProduct(new Product("Keyboard", 1500, 1));

        System.out.println(order);
    }
}
