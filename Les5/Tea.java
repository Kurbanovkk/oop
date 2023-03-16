
public class Tea extends HotDrink {
    Integer temperature;

    @Override
    public String toString() {
        return String.format("Наименование товара - %s. Цена товара - %d. Объем товара - %d. Температура товара - %d",
                getName(), getPrice(), getVolume(), getTemperature());
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}