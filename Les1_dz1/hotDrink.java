package Les1_dz1;

import java.util.Iterator;

public class HotDrink implements Iterator<String> {
    private String name;
    private int price;
    private int volume;

    @Override
    public String toString() {
        return String.format("Наименование товара - %s. Цена товара - %d. Объем товара - %d", getName(), getPrice(),
                getVolume());
    }

    public HotDrink(int price, int volume, String name) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public HotDrink(int price, String name) {
        this(price, 200, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 3;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                // return firstName;
                return String.format("Наименование товара - %s", name);
            case 2:
                // return lastName;
                return String.format("Цена товара - %d", price);
            case 3:
                // return age;
                return String.format("Объем товара - %d", volume);

        }
        return name;
    }
}
