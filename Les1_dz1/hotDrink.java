package Les1_dz1;

public class hotDrink {
    String name;
    int price;
    int volume;

    @Override
    public String toString() {
        return String.format("Наименование товара - %s. Цена товара - %d. Объем товара - %d", getName(), getPrice(),
                getVolume());
    }

    public hotDrink(int price, int volume, String name) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public hotDrink(int price, String name) {
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
}
