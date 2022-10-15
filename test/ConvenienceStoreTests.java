import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ConvenienceStoreTests {
    static List<Product> products = new ArrayList<>();
    static List<Cashier> cashiers = new ArrayList<Cashier>();
    List<Manager> managers  = new ArrayList<>();
    static List<Customer> customers = new ArrayList<>();
    static Manager manager = new Manager("Ojo-Bello Oluwayimika");

    @BeforeAll
    public static void initializer(){
        Cashier cashier1 = new Cashier("Zion",manager);
        cashiers.add(cashier1);
        Cashier cashier2 = new Cashier("Ella",manager);
        cashiers.add(cashier2);
        Cashier cashier3 = new Cashier("Kylian",manager);
        cashiers.add(cashier3);
        Customer customer1 = new Customer("Brian");
        customers.add(customer1);
        Product product1 = new Product("eggs",3,100.0,10);
        products.add(product1);
        Customer customer2 = new Customer("Jeoffrey");
        customers.add(customer2);
        Product product2 = new Product("egusi",7,100.0,15);
        products.add(product2);
        Customer customer3 = new Customer("manny");
        customers.add(customer3);
        Product product3 = new Product("waakye",6,100.0,3);
        products.add(product3);
    }

    @Test
    public void hireSingleCashier(){
        Cashier cashier = new Cashier("Daniel",manager);
        cashiers.add(cashier);
        manager.hireSingleCashier(cashier, manager);
    }

    @Test
    public void hireMultipleCashiers(){
        cashiers.add(new Cashier("Phillip", manager));
        cashiers.add(new Cashier("Curtis", manager));
        manager.hireMultipleCashiers(manager,cashiers);
    }

    @Test
    public void sellProduct(){
        Customer customer = new Customer("Brian");
        customers.add(customer);
        Product product = new Product("rice",3,100.0,10);
        products.add(product);
        Cashier cashier = new Cashier( "Michelle",manager);
        cashiers.add(cashier);
        cashier.sellProduct(product,customer,cashier);
    }
    @Test
    public void sellMultipleProducts(){
        Customer customer = new Customer("Brian");
        customers.add(customer);
        Cashier cashier = new Cashier("Michelle",manager);
        cashiers.add(cashier);
        products.add(new Product("ponmo",5,100,10));
        products.add(new Product("beans",3,150,11));
        products.add(new Product("fish",2,350,12));
        cashier.sellMultipleProducts(products,customer,cashier);

    }

    @Test
    public void buyProduct(){
        Cashier cashier = new Cashier( "Kate", manager);
        cashiers.add(cashier);
        Customer customer = new Customer("Williams");
        customers.add(customer);
        products.add(new Product("chicken",5,100,14));
        customer.buyProducts(customer,cashier, products);

    }

    @Test
    public void updateProduct(){
        products.add(new Product("bole",5,100,12));
        Product product = products.get(0);
        String newProductName = "white rice";
        Integer newProductStock = 5;
        double newProductPrice = 90.0;
        manager.updateProduct(product, newProductName, newProductPrice,newProductStock);
    }

    @Test
    public void deleteProduct(){
        products.add(new Product("bole",5,100,12));
        Product product = products.get(0);
//        manager.deleteProduct
    }
    @Test
    public void countStaff() throws InterruptedException {
        manager.countStaff(cashiers);
    }
    @Test
    public void countProducts() throws InterruptedException {
        manager.countProducts(products);
    }
    @Test
    public void listStaff() throws InterruptedException {
        manager.listStaff(cashiers);
    }
    @Test
    public void listProducts() throws InterruptedException {
        manager.listProducts(products);
    }

}
