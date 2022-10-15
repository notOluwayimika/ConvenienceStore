import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager extends Staff {
    public Manager(String id, String name) {
        super(id, name);
    }

    public void hireSingleCashier(Cashier cashier,Manager manager){
        System.out.println("Manager with ID:"+manager.getId() +" "+manager.getName() + " hired a new cashier "+ cashier.getName()+" with ID: "+ cashier.getId());

    }

    public void hireMultipleCashiers(Manager manager,List<Cashier> cashiers) {
        for (int i = 0; i < cashiers.size(); i++){
            System.out.println("Manager with ID:"+manager.getId() +" "+manager.getName() + " hired a new cashier "+ cashiers.get(i).getName()+" with ID: "+ cashiers.get(i).getId());

        }
    }
}
