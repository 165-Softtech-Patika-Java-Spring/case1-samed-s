package case1.houses;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HouseManager {
    private List<House> houseList;
    private List<Villa> villaList;
    private List<SummerHouse> summerHouseList;

    public HouseManager(){
        houseList = new ArrayList<>();
        villaList = new ArrayList<>();
        summerHouseList = new ArrayList<>();

        addHousesToHouseList();
        addVillasToVillaList();
        addSummerHousesToSummerHouseList();
    }

    public List<House> getAllHouseList(){
        List<House> fullList = new ArrayList<>();
        fullList.addAll(getHouseList());
        fullList.addAll(getVillaList());
        fullList.addAll(getSummerHouseList());
        return fullList;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }

    private void addHousesToHouseList(){
        House houseOne = new House();
        houseOne.setId(100L);
        houseOne.setSquareMeters(110);
        houseOne.setPrice(new BigDecimal(890000));
        houseOne.setNumberOfRooms(2);
        houseOne.setNumberOfLivingRooms(1);
        houseList.add(houseOne);

        House houseTwo = new House();
        houseTwo.setId(101L);
        houseTwo.setSquareMeters(130);
        houseTwo.setPrice(new BigDecimal(1150000));
        houseTwo.setNumberOfRooms(3);
        houseTwo.setNumberOfLivingRooms(1);
        houseList.add(houseTwo);

        houseList.add(new House(102L,new BigDecimal(2350000),4,1,210));
        houseList.add(new House(103L,new BigDecimal(770000),2,1,100));
    }

    private void addVillasToVillaList(){
        Villa villaOne = new Villa();
        villaOne.setId(1L);
        villaOne.setSquareMeters(220);
        villaOne.setPrice(new BigDecimal(1600000));
        villaOne.setNumberOfRooms(4);
        villaOne.setNumberOfLivingRooms(1);
        villaList.add(villaOne);

        Villa villaTwo = new Villa();
        villaTwo.setId(2L);
        villaTwo.setSquareMeters(160);
        villaTwo.setPrice(new BigDecimal(830000));
        villaTwo.setNumberOfRooms(3);
        villaTwo.setNumberOfLivingRooms(1);
        villaList.add(villaTwo);

        villaList.add(new Villa(3L,new BigDecimal(2900000),4,1,216));
        villaList.add(new Villa(4L,new BigDecimal(940000),3,1,200));
    }

    private void addSummerHousesToSummerHouseList(){
        SummerHouse summerHouseOne = new SummerHouse();
        summerHouseOne.setId(10L);
        summerHouseOne.setSquareMeters(190);
        summerHouseOne.setPrice(new BigDecimal(2250000));
        summerHouseOne.setNumberOfRooms(3);
        summerHouseOne.setNumberOfLivingRooms(1);
        summerHouseList.add(summerHouseOne);

        SummerHouse summerHouseTwo = new SummerHouse();
        summerHouseTwo.setId(11L);
        summerHouseTwo.setSquareMeters(180);
        summerHouseTwo.setPrice(new BigDecimal(1100000));
        summerHouseTwo.setNumberOfRooms(3);
        summerHouseTwo.setNumberOfLivingRooms(1);
        summerHouseList.add(summerHouseTwo);

        summerHouseList.add(new SummerHouse(12L,new BigDecimal(2150000),5,1,320));
        summerHouseList.add(new SummerHouse(13L,new BigDecimal(1250000),4,1,190));
    }
}
