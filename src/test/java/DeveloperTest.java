import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setup() {
        developer = new Developer("John", "JE3245B", 324500.00, "Basement");
    }

    @Test
    public void hasName() {
        assertEquals("John", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JE3245B", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(324500.00, developer.getSalary(), 0);
    }

    @Test
    public void hasDepartment() {
        assertEquals("Basement", developer.getDeptName());
    }


}
