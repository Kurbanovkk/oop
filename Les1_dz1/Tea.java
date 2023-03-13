package Les1_dz1;

/**
 * Tea
 */
public class Tea<E> extends HotDrink {
    private E temperature;

    @Override
    public String toString() {
        return String.format("Наименование товара - %s. Цена товара - %d. Объем товара - %d. Температура товара - %d",
                getName(), getPrice(), getVolume(), getTemperature());
    }

    public Tea(int price, int volume, String name, E temperature) {
        super(price, volume, name);
        this.temperature = temperature;
    }

    public Tea(int price, String name, E temperature) {
        super(price, name);
        this.temperature = temperature;
    }

    public Tea(int price, int volume, String name) {
        super(price, volume, name);
        this.temperature = 90;
    }

    public Tea(int price, String name) {
        super(price, name);
        this.temperature = 90;
    }

    public E getTemperature() {
        return temperature;
    }

    public E setTemperature(E temperature) {
        return this.temperature = temperature;
    }
}