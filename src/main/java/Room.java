import java.util.ArrayList;

public class Room {

    private ArrayList<Guest> guests;
    private int capacity;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return this.capacity;
    }


    public int numberOfGuests() {
        return this.guests.size();
    }

    public boolean isVacant() {
        return numberOfGuests() == 0;
    }

    public void checkIn(Guest guest) {
        if (!isFull()) {
            this.guests.add(guest);
        }
    }

    public void checkOut() {
        this.guests.clear();
    }

    public boolean isFull() {
        return this.guests.size() == this.capacity;
    }

    public ArrayList<Guest> getGuests() {
        return new ArrayList<>(guests);
    }
}
