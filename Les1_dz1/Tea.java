package Les1_dz1;

/**
 * Tea
 */
public class Tea extends HotDrink {
    private Integer temperature;

    @Override
    public String toString() {
        return String.format("Наименование товара - %s. Цена товара - %d. Объем товара - %d. Температура товара - %d",
                getName(), getPrice(), getVolume(), getTemperature());
    }

    public Tea(int price, int volume, String name, int temperature) {
        super(price, volume, name);
        this.temperature = temperature;
    }

    public Tea(int price, String name, int temperature) {
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

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}