import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private DiningRoom diningRoom;
    private ConferenceRoom conferenceRoom;

    public Hotel(String name) {
        this.name = name;
        bedrooms = new ArrayList<Bedroom>();
    }


    public String getName() {
        return this.name;
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void setConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }

    public ConferenceRoom getConferenceRoom() {
        return this.conferenceRoom;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public DiningRoom getDiningRoom() {
        return this.diningRoom;
    }

    public void checkInGuestsToConferenceRoom(ArrayList<Guest> guests) {
        this.conferenceRoom.checkInGuests(guests);
    }

    public void checkInGuestsToDiningRoom(ArrayList<Guest> guests) {
        this.diningRoom.checkInGuests(guests);
    }


    public ArrayList<Guest> getGuestsCheckedIntoBedroom(int number) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                return room.getGuests();
            }
        }
        return new ArrayList<Guest>();
    }

    public void checkGuestsIntoBedroom(int number, ArrayList<Guest> guestList) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                room.checkInGuests(guestList);
                return;
            }
        }
    }

    public void checkGuestsOutOfBedroom(int number) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                room.checkOut();
                return;
            }
        }
    }
}
