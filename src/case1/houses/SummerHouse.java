package case1.houses;

import java.math.BigDecimal;

public class SummerHouse extends House {
    private int numberOfFloors;

    public SummerHouse(){

    }

    public SummerHouse(long id, BigDecimal price, int numberOfRooms, int numberOfLivingRooms, int squareMeters){
        this.setId(id);
        this.setPrice(price);
        this.setNumberOfRooms(numberOfRooms);
        this.setNumberOfLivingRooms(numberOfLivingRooms);
        this.setSquareMeters(squareMeters);
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
