package case1.houses;

import java.math.BigDecimal;

public class House {
    private long id;
    private BigDecimal price;
    private int numberOfRooms;
    private int numberOfLivingRooms;
    private int squareMeters;

    public House(){

    }

    public House(long id, BigDecimal price, int numberOfRooms, int numberOfLivingRooms, int squareMeters){
        this.setId(id);
        this.setPrice(price);
        this.setNumberOfRooms(numberOfRooms);
        this.setNumberOfLivingRooms(numberOfLivingRooms);
        this.setSquareMeters(squareMeters);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    public void setNumberOfLivingRooms(int numberOfLivingRooms) {
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }
}
