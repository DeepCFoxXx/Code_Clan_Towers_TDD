import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiningRoom {

    DiningRoom room;

    @Before
    public void before() {
        room = new DiningRoom("Mos Eisley Cantina", 45);
    }

    @Test
    public void hasName() {
        assertEquals("Mos Eisley Cantina", room.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(45, room.getCapacity());
    }

}
