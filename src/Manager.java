import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Manager extends Staff {
    public Manager( String name) {

        super(name);
    }

    public void hireSingleCashier(Cashier cashier,Manager manager){
        System.out.println("Manager with ID:"+manager.getId() +" "+manager.getName() + " hired a new cashier "+ cashier.getName()+" with ID: "+ cashier.getId());

    }

    public void hireMultipleCashiers(Manager manager,List<Cashier> cashiers) {
        for (int i = 0; i < cashiers.size(); i++){
            System.out.println("Manager with ID:"+manager.getId() +" "+manager.getName() + " hired a new cashier "+ cashiers.get(i).getName()+" with ID: "+ cashiers.get(i).getId());

        }
    }

    public void updateProduct(Product product, String newProductName, double newProductPrice, Integer newProductStock) {
        System.out.println("Product with id: "+ product.getProductId() + " "+product.getProductName()+" has been updated, new details below");
        product.setStock(newProductStock);
        product.setProductName(newProductName);
        product.setProductPrice(newProductPrice);
        System.out.println("New Product Name: "+product.getProductName());
        System.out.println("New Product Stock: "+product.getStock());
        System.out.println("New Product Price: "+product.getProductPrice());
    }

    public void countProducts(List<Product> products) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        Integer number = 0;
        for(int i = 0; i< products.size();i++){
            number = number+1;
        }
        System.out.println("There are "+number +" products in the system");
    }

    public void countStaff(List<Cashier> cashiers) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        Integer number = 0;
        for(int i = 0; i< cashiers.size();i++){
            number = number+1;
        }
        System.out.println("There are "+number +" cashiers in the system");
    }

    public void listStaff(List<Cashier> cashiers) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("id\t\tname\t\tnumberOfProductsSold ");
        for(int i = 0; i< cashiers.size();i++){
            System.out.println(cashiers.get(i).getId()+"\t\t"+cashiers.get(i).getName()+"\t\t"+cashiers.get(i).getProductsSold());
        }

    }

    public void listProducts(List<Product> products) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("id\t\tname\t\tStock\t\tPrice\t\tNumberSold ");
        for(int i = 0; i< products.size();i++){
            System.out.println(products.get(i).getProductId()+"\t\t"+products.get(i).getProductName()+"\t\t"+products.get(i).getStock()+"\t\t"+products.get(i).getProductPrice()+"\t\t"+products.get(i).getNumberSold());
        }
    }
}
