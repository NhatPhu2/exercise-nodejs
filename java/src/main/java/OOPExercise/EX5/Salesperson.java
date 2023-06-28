package OOPExercise.EX5;

public class Salesperson extends Employee {
    private String name;
    private double salary;

    public Salesperson() {

    }

    public Salesperson(String name, double salary) {
        super(name, salary);
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        if (salary > 10000)
            return salary + (salary * 0.1);
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
