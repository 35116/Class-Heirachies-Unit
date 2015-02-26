/**
 * Created by oj on 2/23/15.
 */
public abstract class ShoeEmployee {
    //class variable or static variable is shared by all 
    //objets of a class
    private static int nextId = 10000;
    
    private String name;
    private double salary;
    private int id;
    private int age;

    public ShoeEmployee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        id = nextId++;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
