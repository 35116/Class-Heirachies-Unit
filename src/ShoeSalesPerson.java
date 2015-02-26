/**
 * Created by oj on 2/23/15.
 */
public class ShoeSalesPerson extends ShoeEmployee {
    private static final double COMMISSION_PER_SHOE = 10;
    
    private int monthlySales;

    public ShoeSalesPerson(String name, int age) {
      //  System.out.println("I like shoes");  ERROR: A sub class' constructor must call the super
        //constructor in it's first statement.
        super(name, age, 10000);
    }

    public int getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(int monthlySales) {
        this.monthlySales = monthlySales;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + COMMISSION_PER_SHOE * monthlySales;
    }
}
