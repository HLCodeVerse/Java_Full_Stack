package Assignment_4.PayrollSystem;

public class Employee {
    private String position="Employee";
    private String name;
    private String id;
    private double salary;
    private double bonus;
    private int totalAtendence;

    public int getTotalAtendence ( ) {
        return totalAtendence;
    }

    public void setTotalAtendence ( int totalAtendence ) {
        this.totalAtendence = totalAtendence;
    }

    public String getPosition ( ) {
        return position;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getId ( ) {
        return id;
    }

    public void setId ( String id ) {
        this.id = id;
    }

    public double getSalary ( ) {
        return salary;
    }

    public void setSalary ( double salary ) {
        this.salary = salary;
    }

    public double getBonus ( ) {
        return bonus;
    }

    public void setBonus ( double bonus ) {
        this.bonus = bonus;
    }

    Employee(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}