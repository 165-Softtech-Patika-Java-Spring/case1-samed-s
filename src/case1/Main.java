package case1;

import case1.houses.House;
import case1.houses.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        System.out.println("Total Price of All: " + service.getTotalPriceOfAll());
        System.out.println("Total Price of House: " + service.getTotalPriceOfHouses());
        System.out.println("Total Price of Villa: " + service.getTotalPriceOfVillas());
        System.out.println("Total Price of Summer House: " + service.getTotalPriceOfSummerHouses());

        System.out.println("Average Square Meters Of All: " + service.getAverageSquareMetersOfAll());
        System.out.println("Average Square Meters of House: " + service.getAverageSquareMetersOfHouses());
        System.out.println("Average Square Meters of Villa: " + service.getAverageSquareMetersOfVillas());
        System.out.println("Average Square Meters of Summer House: " + service.getAverageSquareMetersOfSummerHouses());

        System.out.println("IDs of Filtered House List");
        for (House house : service.filterAllHousesByNumberOfRoomsAndLivingRooms(3,1)){
            System.out.println("ID:" + house.getId());
        }
    }
}
