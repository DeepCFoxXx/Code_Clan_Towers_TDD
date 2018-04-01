import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Leia Organa");
    }

    @Test
    public void hasName() {
        assertEquals("Leia Organa", guest.getName());
    }

}
