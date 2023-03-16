
import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine<T extends Tea> {
    List<T> assortment = new ArrayList<>();

    public void initProduct(ArrayList<T> list) {
        for (T item : list) {
            assortment.add(item);
        }
    }

    public void getProduct(String name, int volume, int temperature) {
        for (T item : assortment) {
            if (item.getName().equals(name) &&
                    item.getVolume() == volume &&
                    item.getTemperature() == temperature) {
                System.out.println(item);
            }
        }
    }
}
