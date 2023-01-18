package staff;

public abstract class Employee {
    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public Double payBonus() {
        return this.salary * 0.01;
    }


    public void raiseSalary(Double increment) {
        if (increment > 0) {
            double newSalary = (this.salary * (increment / 100)) + this.salary;
            this.salary = newSalary;
        }
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

}
