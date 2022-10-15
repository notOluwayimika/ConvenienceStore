import java.util.List;

public class Cashier extends Staff {
    private String hiredBy;

    public Cashier(String id, String name,Manager manager) {
        super(id,name);
        this.hiredBy=manager.getName();
    }

    public void sellProduct(Product product, Customer customer,Cashier cashier) {

        System.out.println("Cashier with ID: "+cashier.getId() + " sold the following items to customer "+customer.getName());
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tprice \t\t\t\tTotal Price\n");
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.format("   %-9s    %-9s    %5d      %9.2f         %14.2f\n" ,id, product.getProductName(), product.getProductQty(), product.getProductPrice(), product.getProductQty()* product.getProductPrice());
        System.out.println("total price: "+ product.getProductPrice()*product.getProductQty());
    }

    public void sellMultipleProducts(List<Product> products, Customer customer, Cashier cashier) {
        double total=0.0;
        System.out.println("Cashier with ID: "+cashier.getId() + " sold the following items to customer "+customer.getName());
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tprice \t\t\t\tTotal Price\n");
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");
        for (int i = 0; i < products.size(); i++){
            total = total+(products.get(i).getProductPrice()*products.get(i).getProductQty());
            System.out.format("   %-9s    %-9s    %5d      %9.2f         %14.2f\n" ,products.get(i).getProductId(), products.get(i).getProductName(), products.get(i).getProductQty(), products.get(i).getProductPrice(), products.get(i).getProductQty()* products.get(i).getProductPrice());

        }
        System.out.println("Your total is $" +total);
    }
}
