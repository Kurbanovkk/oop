package Les1_dz1;

import java.util.ArrayList;

/**
 * hotDrinksVendingM
 */
public class hotDrinksVendingM {

    private static ArrayList<Tea> assortment = new ArrayList<>();

    public static void initProduct(ArrayList<Tea> list) {
        for (Tea item : list) {
            assortment.add(item);
        }
    }

    public static void getProduct(Tea red, int volume, int temperature) {
        for (Tea item : assortment) {
            if (item.getName().equals(red) &&
                    item.getVolume() == volume &&
                    item.getTemperature() == temperature) {
                System.out.println(item);
            }
        }
    }
}