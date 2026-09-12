package dmit2015.model;

public class Product {

    private String name;
    private double price;

    private int quantity;

    public Product(String name, double price, int quantity) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Product name is required.");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0.");
        }

        // Extra from Bonus Challenge
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0.");
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() { return quantity; }

    public double getPriceWithTax() {
        return price * 1.05;
    }

    public double getInventoryValue() { return price * quantity; }
}
