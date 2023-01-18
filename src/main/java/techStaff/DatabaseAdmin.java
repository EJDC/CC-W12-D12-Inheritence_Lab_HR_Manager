package techStaff;

import staff.Employee;

public class DatabaseAdmin extends Employee {

    private String deptName;

    public DatabaseAdmin(String name, String niNumber, Double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
