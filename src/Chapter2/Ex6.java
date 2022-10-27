package Chapter2;

class Room{
    private int beds;
    private boolean tv;
    private boolean telephone;

    public Room(int beds, boolean tv, boolean telephone){
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

    public String toString(){
        return "Beds: " + this.beds + ", TV: " + this.tv + ", Telephone: " + this.telephone;
    }
}

class Currency{
    private String name;
    private double currentDollarRate;

    public Currency(String name, double currentDollarRate){
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
        return "Name: " + name + ", Current Dollar Rate: " + currentDollarRate;
    }
}


class Place{
    private String cityName;
    private String countryName;
    private Currency currency;
    private String cityHallTel;

    public Place(String cityName, String countryName, Currency currency, String cityHallTel){
        this.cityName = cityName;
        this.countryName = countryName;
        this.currency = currency;
        this.cityHallTel = cityHallTel;
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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getCityHallTel() {
        return cityHallTel;
    }

    public void setCityHallTel(String cityHallTel) {
        this.cityHallTel = cityHallTel;
    }
}


class Hotel{
    private Room[] rooms;
    private String name;
    private Place place;

    public Hotel(Room[] rooms, String name, Place place){
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
        return "Name: " + this.name +  ",Place: " + this.place.getCityName() + ",No Rooms: " + this.rooms.length;
    }
}


public class Ex6 {
    public static void main(String[] args) {
        Currency currency = new Currency("Currency 1", 25.5);
        Place place = new Place("Danang", "Vietnam", currency, "123456789");
        Room[] rooms = new Room[3];
        rooms[0] = new Room(3, true, true);
        rooms[1] = new Room(1, false, false);
        rooms[2] = new Room(5, true, true);

        Hotel hotel = new Hotel(rooms, "Hotel 1", place);
        hotel.getRooms();
        System.out.println(hotel);
        for (Room r:hotel.getRooms()) {
            System.out.println(r);
        }

        Room[] rooms1 = hotel.getRooms();
        for (int i = 0; i < rooms1.length; i++){
            Room room = rooms1[i];
            System.out.println(room);
        }
    }
}
