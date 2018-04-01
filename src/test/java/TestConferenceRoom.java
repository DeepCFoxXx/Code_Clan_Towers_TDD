import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConferenceRoom {

    ConferenceRoom room;

    @Before
    public void before() {
        room = new ConferenceRoom("Coruscant", 5000, 2000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Coruscant", room.getName());
    }

}
