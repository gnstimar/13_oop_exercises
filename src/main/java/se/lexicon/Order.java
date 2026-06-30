package se.lexicon;

import java.util.List;

public class Order {
    private final Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("An order must have a valid customer.");
        }
        this.customer = customer;
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null.");
        }
        // If duplicate products are not allowed in the list
        if (products.contains(product)) {
            throw new IllegalArgumentException("Product is already in the list.");
        }

        products.add(product);
    }

    public void removeProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null.");
        }
        if (!products.contains(product)) {
            throw new IllegalArgumentException("Product is not in the list.");
        }

        products.remove(product);
    }

    private double calculateTotal() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void printSummary() {
        IO.println("--- * ---");
        IO.println("Customer: " + customer.getName() + " | Total price: " + calculateTotal());
        IO.println("Products: ");
        for (Product product : products) {
            IO.println(" - " + product.getName());
        }
    }
}
