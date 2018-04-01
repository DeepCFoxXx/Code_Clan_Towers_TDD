import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRoom {

    Room room;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before() {
        room = new Room( 2);
        guest1 = new Guest("Jyn Erso");
        guest2 = new Guest("Mara Jade");
        guest3 = new Guest("Jaina Solo");
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, room.getCapacity());
    }

}
