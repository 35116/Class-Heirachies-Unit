/**
 * Created by oj on 2/23/15.
 */
public class ShoeAdmin extends ShoeEmployee {
    private double bonus;


    public ShoeAdmin(String name, int age, double bonus) {
        super(name, age, 450000);
        this.bonus = bonus;
        super.getName();
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus + 10000;
    }
    
    @Override
    public String getName() {
        return "CEO";
    }
}
