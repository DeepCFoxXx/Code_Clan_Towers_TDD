import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEventRoom {

    EventRoom room;

    @Before
    public void before() {
        room = new EventRoom("Hoth", 100);
    }

    @Test
    public void hasName() {
        assertEquals("Hoth", room.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, room.getCapacity());
    }

}
