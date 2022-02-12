package case1.houses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private HouseManager houseManager;

    public Service(){
        houseManager = new HouseManager();
    }

    public BigDecimal getTotalPriceOfAll(){
        return getTotalPrice(houseManager.getAllHouseList());
    }

    public BigDecimal getTotalPriceOfHouses(){
        return getTotalPrice(houseManager.getHouseList());
    }

    public BigDecimal getTotalPriceOfVillas(){
        return getTotalPrice(houseManager.getVillaList());
    }

    public BigDecimal getTotalPriceOfSummerHouses(){
        return getTotalPrice(houseManager.getSummerHouseList());
    }

    public BigDecimal getAverageSquareMetersOfAll(){
        return getAverageSquareMeters(houseManager.getAllHouseList());
    }

    public BigDecimal getAverageSquareMetersOfHouses(){
        return getAverageSquareMeters(houseManager.getHouseList());
    }

    public BigDecimal getAverageSquareMetersOfVillas(){
        return getAverageSquareMeters(houseManager.getVillaList());
    }

    public BigDecimal getAverageSquareMetersOfSummerHouses(){
        return getAverageSquareMeters(houseManager.getSummerHouseList());
    }

    public List<House> filterAllHousesByNumberOfRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms){
        List<House> filteredHouses = new ArrayList<>();
        List<House> allHouseList = houseManager.getAllHouseList();
        for (House house : allHouseList){
            if (house.getNumberOfRooms()==numberOfRooms && house.getNumberOfLivingRooms()==numberOfLivingRooms){
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }

    private BigDecimal getTotalPrice(List houseList){
        BigDecimal totalPrice = new BigDecimal(BigInteger.ZERO);
        List<House> houses = new ArrayList<>(houseList);
        for (House house : houses){
            totalPrice = totalPrice.add(house.getPrice());
        }
        return totalPrice;
    }

    private BigDecimal getAverageSquareMeters(List houses){
        BigDecimal averageSquareMeters = new BigDecimal(0);
        List<House> houseList = new ArrayList<>(houses);
        for (House house : houseList){
            averageSquareMeters = averageSquareMeters.add(BigDecimal.valueOf(house.getSquareMeters()));
        }
        averageSquareMeters = averageSquareMeters.divide(BigDecimal.valueOf(houseList.size()), 1, RoundingMode.HALF_UP);
        return averageSquareMeters;
    }
}
