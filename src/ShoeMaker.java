/**
 * Created by oj on 2/23/15.
 */
public class ShoeMaker extends ShoeEmployee {
    public static final double ACCEPTABLE_PRODUCTION_RATE = 4.2;
    
    private double productionRatePerHour;


    public ShoeMaker(String name, int age) {
        //super is the class that is being extended
        super(name, age, 25000);
    }

    public double getProductionRatePerHour() {
        return productionRatePerHour;
    }

    public void setProductionRatePerHour(double productionRatePerHour) {
        this.productionRatePerHour = productionRatePerHour;
    }
}
