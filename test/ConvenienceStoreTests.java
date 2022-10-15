import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ConvenienceStoreTests {
    @Test
    public void hireSingleCashier(){
        Manager manager = new Manager("001","mike");
        String cashierName = "Daniel";
        String cashierId = "002";
        Cashier cashier = new Cashier(cashierId,cashierName,manager);
        manager.hireSingleCashier(cashier, manager);
    }

    @Test
    public void hireMultipleCashiers(){
        Manager manager = new Manager("001","mike");
        List<Cashier> cashiers = new ArrayList<Cashier>();
        cashiers.add(new Cashier("003","Phillip", manager));
        cashiers.add(new Cashier("004","Curtis", manager));
        manager.hireMultipleCashiers(manager,cashiers);
    }

    @Test
    public void sellProduct(){
        Manager manager = new Manager("001","mike");
        Customer customer = new Customer("Brian");
        Product product = new Product("001","rice",3,100.0);
        Cashier cashier = new Cashier("001", "Michelle",manager);
        cashier.sellProduct(product,customer,cashier);
    }
    @Test
    public void sellMultipleProducts(){
        Customer customer = new Customer("Brian");
        Manager manager = new Manager("001","mike");
        Cashier cashier = new Cashier("001", "Michelle",manager);
        List<Product> products = new ArrayList<>();
        products.add(new Product("001","rice",5,100));
        products.add(new Product("002","beans",3,150));
        products.add(new Product("003","fish",2,350));
        cashier.sellMultipleProducts(products,customer,cashier);

    }

    @Test
    public void buyProduct(){
        Manager manager = new Manager("001","Mike");
        Cashier cashier = new Cashier("002", "Kate", manager);
        Customer customer = new Customer("Williams");
        List<Product> products = new ArrayList<>();
        products.add(new Product("001","rice",5,100));
        customer.buyProducts(customer,cashier, products);

    }
}
