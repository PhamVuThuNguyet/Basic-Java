package Chuong5;

class Room{
    private int beds;
    private boolean tv, telephone;

    public Room(int beds, boolean tv, boolean telephone) {
        this.beds = beds;
        this.tv = tv;
        this.telephone = telephone;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isTelephone() {
        return telephone;
    }

    public void setTelephone(boolean telephone) {
        this.telephone = telephone;
    }
}

class Currency{
    private String name;
    private double currentDollarRate;

    public Currency(String name, double currentDollarRate) {
        this.name = name;
        this.currentDollarRate = currentDollarRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentDollarRate() {
        return currentDollarRate;
    }

    public void setCurrentDollarRate(double currentDollarRate) {
        this.currentDollarRate = currentDollarRate;
    }

    public String toString(){
        return ("name" + this.name + "; current dollar rate: " + this.currentDollarRate);
    }
}

class Place{
    private String cityName, countryName, cityHallTel;
    private Currency currency;

    public Place(String cityName, String countryName, String cityHallTel, Currency currency) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.cityHallTel = cityHallTel;
        this.currency = currency;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityHallTel() {
        return cityHallTel;
    }

    public void setCityHallTel(String cityHallTel) {
        this.cityHallTel = cityHallTel;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}

class Hotel{
    private Room[] rooms;
    private String name;
    private Place place;

    public Hotel(Room[] rooms, String name, Place place) {
        this.rooms = rooms;
        this.name = name;
        this.place = place;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String toString(){
        return ("name" + this.name + "; place: " + this.place.getCityName() +
                "; room 1: " + this.rooms[0].getBeds());
    }
}

public class Ex6_nosolution {
    public static void main(String[] args) {
        Currency currency = new Currency("currency 1", 20);
        Place place = new Place("cityName", "countryName", "cityHallTel", currency);

        Room room1 = new Room(2, false, false);
        Room room2 = new Room(4, true, true);

        Room[] rooms = new Room[2];
        rooms[0] = room1;
        rooms[1] = room2;

        Hotel hotel = new Hotel(rooms, "Hotel 1", place);
        System.out.println(hotel.toString());
    }
}
