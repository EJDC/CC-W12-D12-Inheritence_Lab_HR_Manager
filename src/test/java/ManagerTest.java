import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup() {
        manager = new Manager("John", "JE3245B", 324500.00, "Basement");
    }

    @Test
    public void hasName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JE3245B", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(324500.00, manager.getSalary(), 0);
    }

    @Test
    public void hasDepartment() {
        assertEquals("Basement", manager.getDeptName());
    }


}
