package se.lexicon;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public void applyDiscount(double percent) {
        if (percent > 80 || percent < 0) {
            throw new IllegalArgumentException("Percentage cannot be negative or above 80%");
        }
        this.price = this.price * (100 - percent) / 100;
    }

    public void printInfo() {
        IO.println("Product name: " + name + " | Current price: " + price);
    }
}
