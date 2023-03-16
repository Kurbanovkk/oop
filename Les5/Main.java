
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Tea black = TeaBuilder.getInstance().setName("Greenfield").setPrice(50).setVolume(230).setTemperature(70)
                .build();
        Tea green = TeaBuilder.getInstance().setName("Tess").setPrice(55).setTemperature(70).build();
        Tea red = TeaBuilder.getInstance().setName("Ahmad").setPrice(60).setVolume(250).build();
        Tea defult = TeaBuilder.getInstance().setName("java").setPrice(50).build();

        ArrayList<Tea> availableAssortment = new ArrayList<>();
        availableAssortment.add(black);
        availableAssortment.add(green);
        availableAssortment.add(red);
        availableAssortment.add(defult);

        var obobchenie = new HotDrinksVendingMachine();
        obobchenie.initProduct(availableAssortment);
        obobchenie.getProduct("java", 200, 90);
        //
        for (Tea tea : availableAssortment) {
            System.out.println(tea.toString());
        }
    }
}