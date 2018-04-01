import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    Hotel hotel;
    Bedroom singleRoom;
    Bedroom doubleRoom;
    Bedroom twinRoom;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before() {
        hotel = new Hotel("Galaxy Towers");
        singleRoom = new Bedroom(101, BedroomType.SINGLE, 25.00);
        doubleRoom = new Bedroom(102, BedroomType.DOUBLE, 50.00);
        twinRoom = new Bedroom(103, BedroomType.TWIN, 60.00);
        conferenceRoom = new ConferenceRoom("Coruscant", 2, 1000.00);
        diningRoom = new DiningRoom("Mos Eisley Cantina", 2);
        guest1 = new Guest("Leia Organa");
        guest2 = new Guest("Mara Jade");
        guest3 = new Guest("Rey Solo");
    }

    @Test
    public void hasName(){
        assertEquals("Galaxy Towers", hotel.getName());
    }

    @Test
    public void bedroomCountStartsEmpty(){
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(singleRoom);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canSetConferenceRoom() {
        hotel.setConferenceRoom(conferenceRoom);
        assertEquals("Coruscant", hotel.getConferenceRoom().getName());
    }

    @Test
    public void canSetDiningRoom() {
        hotel.setDiningRoom(diningRoom);
        assertEquals("Mos Eisley Cantina", hotel.getDiningRoom().getName());
    }

    @Test
    public void canCheckGuestsIntoConferenceRoom() {
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        hotel.setConferenceRoom(conferenceRoom);
        hotel.checkInGuestsToConferenceRoom(guestList);
        assertEquals(2, hotel.getConferenceRoom().numberOfGuests());
        assertEquals(false, hotel.getConferenceRoom().isVacant());
    }

    @Test
    public void cannotCheckTooManyGuestsIntoConferenceRoom() {
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        guestList.add(guest3);
        hotel.setConferenceRoom(conferenceRoom);
        hotel.checkInGuestsToConferenceRoom(guestList);
        assertEquals(0, hotel.getConferenceRoom().numberOfGuests());
        assertEquals(true, hotel.getConferenceRoom().isVacant());
    }

    @Test
    public void canCheckGuestsIntoDiningRoom() {
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        hotel.setDiningRoom(diningRoom);
        hotel.checkInGuestsToDiningRoom(guestList);
        assertEquals(2, hotel.getDiningRoom().numberOfGuests());
        assertEquals(false, hotel.getDiningRoom().isVacant());
    }

    @Test
    public void cannotCheckTooManyGuestsIntoDiningRoom() {
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        guestList.add(guest3);
        hotel.setDiningRoom(diningRoom);
        hotel.checkInGuestsToDiningRoom(guestList);
        assertEquals(0, hotel.getDiningRoom().numberOfGuests());
        assertEquals(true, hotel.getDiningRoom().isVacant());
    }

}
