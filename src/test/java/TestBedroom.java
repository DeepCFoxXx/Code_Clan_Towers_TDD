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

    @Test
    public void singleRoomHasRoomType() {
        assertEquals("Single", singleRoom.getType());
    }

    @Test
    public void singleRoomHasRoomPricePerNight() {
        assertEquals(25.00, singleRoom.getPricePerNight(), 0.01);
    }

    @Test
    public void singleRoomHasCapacity() {
        assertEquals(1, singleRoom.getCapacity());
    }

    @Test
    public void singleRoomStartsVacant() {
        assertEquals(true, singleRoom.isVacant());
        assertEquals(false, singleRoom.isFull());
    }

    @Test
    public void singleRoomStartsEmpty() {
        assertEquals(0, singleRoom.numberOfGuests());
        assertEquals(false, singleRoom.isFull());
    }

}
