import management.Manager;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void canPayBonus() {
        employee = new Manager("John", "JE3245B", 324500.00, "Basement");
        employee.payBonus();
        assertEquals(3245.00, employee.payBonus(), 0);
    }

    @Test
    public void canRaiseSalary() {
        employee = new Manager("John", "JE3245B", 324500.00, "Basement");
        employee.raiseSalary(2.5);
        assertEquals(332612.5, employee.getSalary(), 0);
    }

    @Test
    public void cannotRaiseSalaryAsNegativeIncrement() {
        employee = new Manager("John", "JE3245B", 324500.00, "Basement");
        employee.raiseSalary(-2.5);
        assertEquals(324500.00, employee.getSalary(), 0);
    }

    @Test
    public void canChangeName() {
        employee = new Manager("John", "JE3245B", 324500.00, "Basement");
        employee.setName("Bob");
        assertEquals("Bob", employee.getName());
    }

    @Test
    public void cannotChangeNameAsNull() {
        employee = new Manager("John", "JE3245B", 324500.00, "Basement");
        employee.setName(null);
        assertEquals("John", employee.getName());
    }


}
