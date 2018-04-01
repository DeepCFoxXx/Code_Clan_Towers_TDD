import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private DiningRoom  diningRoom;
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
}
