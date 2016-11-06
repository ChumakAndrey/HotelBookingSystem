package hotelbooking;

import java.util.List;

public class Hotel implements HasGetIdMethod {

    private static long forHotelId = 1;
    private long hotelId;
    private String hotelName;
    private String hotelCity;
    private List<Room> hotelRooms;

    public Hotel(String hotelName, String hotelCity, List<Room> hotelRooms) {
        hotelId += forHotelId;
        this.hotelName = hotelName;
        this.hotelCity = hotelCity;
        this.hotelRooms = hotelRooms;
        forHotelId++;
    }

    @Override
    public long getId() {
        return hotelId;
    }

    public String getName() {
        return hotelName;
    }

    public String getCity() {
        return hotelCity;
    }

    public List<Room> getHotelRooms() {
        return hotelRooms;
    }

    @Override
    public String toString() {
        return "\nHotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", hotelCity='" + hotelCity + '\'' +
                ", hotelRooms=" + hotelRooms +
                '}';
    }
}
