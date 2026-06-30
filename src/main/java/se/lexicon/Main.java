package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // 1. Create two products — apply a discount to one
        Product bag = new Product("Traveling bag", 100.10);
        Product hikingBoots = new Product("Salamon Hiking Boots XC90", 150.15);

        hikingBoots.applyDiscount(30);

        // 2. Create a customer
        Customer shaun = new Customer("Shaun", "shaun@dok.com");

        // 3. Place an order for that customer — add both products
        Order shaunOrder = new Order(shaun);
        shaunOrder.addProduct(bag);
        shaunOrder.addProduct(hikingBoots);

        // 4. Print the order summary
        shaunOrder.printSummary();

        // 5. Remove one product and print the summary again to show the total updated
        shaunOrder.removeProduct(bag);
        shaunOrder.printSummary();
    }
}
