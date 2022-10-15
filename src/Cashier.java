import java.util.List;

public class Cashier extends Staff {
    private String hiredBy;
    private Integer productsSold;

    public Cashier(String name,Manager manager) {
        super(name);
        this.hiredBy=manager.getName();
        this.productsSold = 0;
    }

    public void sellProduct(Product product, Customer customer,Cashier cashier) {
        if(product.getProductQty()>product.getStock()){
            System.out.println("There is not enough in inventory to make this sale");
        } else{
            product.setStock(product.getStock()- product.getProductQty());
            System.out.println("Cashier with ID: "+cashier.getId() + " sold the following items to customer "+customer.getName());
            System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tprice \t\t\t\tTotal Price\n");
            System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");
            System.out.format("   %-9s    %-9s    %5d      %9.2f         %14.2f\n" ,id, product.getProductName(), product.getProductQty(), product.getProductPrice(), product.getProductQty()* product.getProductPrice());
            System.out.println("total price: "+ product.getProductPrice()*product.getProductQty());
        }
        cashier.setProductsSold(cashier.getProductsSold()+1);
        product.setNumberSold(product.getNumberSold()+1);

    }

    public Integer getProductsSold() {
        return productsSold;
    }

    public void sellMultipleProducts(List<Product> products, Customer customer, Cashier cashier) {
        double total=0.0;
        Integer itemsSold=0;

        System.out.println("Cashier with ID: "+cashier.getId() + " sold the following items to customer "+customer.getName());
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tprice \t\t\t\tTotal Price\n");
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");
        for (int i = 0; i < products.size(); i++){
            if(products.get(i).getProductQty()>products.get(i).getStock()){
                System.out.format("   %-9s    %-9s    %5d      %9.2f         %14.2f There is not enough in inventory to make this sale\n" ,products.get(i).getProductId(), products.get(i).getProductName(), products.get(i).getProductQty(), products.get(i).getProductPrice(), products.get(i).getProductQty()* products.get(i).getProductPrice());
            }else{
                total = total+(products.get(i).getProductPrice()*products.get(i).getProductQty());
                itemsSold = itemsSold+products.get(i).getProductQty();
                products.get(i).setStock(products.get(i).getStock()- products.get(i).getProductQty());
                products.get(i).setNumberSold(products.get(i).getNumberSold()+products.get(i).getProductQty());
                System.out.format("   %-9s    %-9s    %5d      %9.2f         %14.2f\n" ,products.get(i).getProductId(), products.get(i).getProductName(), products.get(i).getProductQty(), products.get(i).getProductPrice(), products.get(i).getProductQty()* products.get(i).getProductPrice());

            }
            cashier.setProductsSold(cashier.getProductsSold()+itemsSold);

        }
        System.out.println("Your total is $" +total);
    }

    public void setProductsSold(Integer productsSold) {
        this.productsSold = productsSold;
    }
}
