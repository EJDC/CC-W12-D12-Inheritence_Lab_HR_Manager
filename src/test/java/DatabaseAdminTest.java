import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setup() {
        databaseAdmin = new DatabaseAdmin("John", "JE3245B", 324500.00, "Basement");
    }

    @Test
    public void hasName() {
        assertEquals("John", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JE3245B", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(324500.00, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void hasDepartment() {
        assertEquals("Basement", databaseAdmin.getDeptName());
    }


}
