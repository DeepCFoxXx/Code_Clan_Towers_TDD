import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    Bedroom singleRoom;
    Bedroom doubleRoom;
    Bedroom twinRoom;

    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        singleRoom = new Bedroom(101, BedroomType.SINGLE, 25.00);
        doubleRoom = new Bedroom(102, BedroomType.DOUBLE, 50.00);
        twinRoom = new Bedroom(103, BedroomType.TWIN, 60.00);
        guest1 = new Guest("Mara Jade");
        guest2 = new Guest("Luke Skywalker");
    }

    @Test
    public void singleRoomHasNumber() {
        assertEquals(101, singleRoom.getNumber());
    }


}
