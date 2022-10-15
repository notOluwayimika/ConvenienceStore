import java.util.List;

public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    public void buyProducts(Customer customer,Cashier cashier, List<Product> products) {
        double total = 0.0;
        System.out.println("Thank you for your purchase, see your receipt below");
        cashier.sellMultipleProducts(products,customer,cashier);
    }
}
