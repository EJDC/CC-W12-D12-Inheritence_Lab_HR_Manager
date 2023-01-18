import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup() {
        director = new Director("John", "JE3245B", 324500.00, "Basement", 400000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("John", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JE3245B", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(324500.00, director.getSalary(), 0);
    }

    @Test
    public void hasDepartment() {
        assertEquals("Basement", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(400000000.00, director.getBudget(),0);
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(6490.00, director.payBonus(), 0);
    }


}
