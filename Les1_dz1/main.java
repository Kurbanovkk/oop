package Les1_dz1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Tea black = new Tea(45, 220, "Safia ", 66);
        Tea green = new Tea(50, 235, "Maryam", 72);
        Tea red = new Tea(57, 223, "Ahmad", 80);

        ArrayList<Tea> availableAssortment = new ArrayList<>();
        availableAssortment.add(black);
        availableAssortment.add(green);
        availableAssortment.add(red);

        hotDrinksVendingM.initProduct(availableAssortment);
        hotDrinksVendingM.getProduct(black, 200, 70);
    }
}
