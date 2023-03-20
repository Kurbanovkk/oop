package model;

public abstract class HotDrink {
    private String name;
    private int price;
    private int volume;

    @Override
    public String toString() {
        return String.format("Наименование товара - %s. Цена товара - %d. Объем товара - %d", getName(), getPrice(),
                getVolume());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }
}