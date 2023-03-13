package Les1_dz1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HotDrink tea = new Tea(121, 80, "Ahmad");

        Tea<Integer> tea2 = new Tea<Integer>(100, 45, "Safia", 85);
        System.out.println(tea2);

        Iterator<String> components = tea;

        while (components.hasNext()) {
            System.out.println(tea.next());
        }
    }
}
