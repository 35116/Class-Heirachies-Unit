import java.util.ArrayList;

/**
 * Created by oj on 2/23/15.
 */
public class HRDept {
    private static ArrayList<ShoeEmployee> employees;

    public static void main(String[] args) {
        
        employees = new ArrayList<ShoeEmployee>();
        
       // ShoeEmployee jones = new ShoeEmployee("Mr Jones", 25, 800000);
        
        ShoeMaker egan = new ShoeMaker("Egan", 15);
        ShoeAdmin angus = new ShoeAdmin("Angus", 18, 15000.99);
        ShoeSalesPerson jaisal = new ShoeSalesPerson("Jaisal", 17);
        ShoeEngineer daniel = new ShoeEngineer("Daniel", 17);
        
        employees.add(egan);
        employees.add(angus);
        employees.add(jaisal);
        employees.add(daniel);
        employees.add(new ShoeMaker("Prashant", 16));
        employees.add(new ShoeMaker("Linus", 12));
        employees.add(new ShoeMaker("Zhen", 17));
        employees.add(new ShoeMaker("Erfann", 16));
        employees.add(new ShoeEngineer("Aadya", 17));
        employees.add(new ShoeSalesPerson("Justin", 17));
        employees.add(new ShoeSalesPerson("Hyukjun", 18));
        employees.add(new ShoeAdmin("Wilson", 65, 21000));

        
        //a variable of the super class to hold the subclass
        ShoeEmployee bob = angus;

        System.out.println(angus.getName() + " " + angus.getBonus());
        ShoeAdmin bob2 = (ShoeAdmin) bob;
        
        bob2.setBonus(20000);
        
        System.out.println(bob.getName() + " " + ((ShoeAdmin)bob).getBonus());
        
        
        
        jaisal.setMonthlySales(1);
        egan.setProductionRatePerHour(72.32);
        

        System.out.println(egan.getId());
        System.out.println(angus.getBonus());
       
        
        double totalSalaries = calculateTotalSalaries(employees);    
        
    }

    private static double calculateTotalSalaries(ArrayList<ShoeEmployee> employees) {
        
        double total = 0;
        
        for (ShoeEmployee e : employees) {
           // if (e  instanceof ShoeAdmin)
          /*  if (e.getClass().getName().equals("ShoeAdmin")) {
                total += e.getSalary() + ((ShoeAdmin)e).getBonus();
            } else {
                total += e.getSalary();
            }*/

            total += e.getSalary();
        }
        
        
        
        return total;
    }


}
