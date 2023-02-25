
public class Notebook {
    private String brand;
    private int ram;
    private int storageCapacity;
    private String os;
    private String color;

    public Notebook(String brand, String string, int ram, int storageCapacity, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.os = os;
        this.color = color;
    }

    // геттеры и сеттеры для полей

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // переопределение метода toString() для вывода объекта в удобном формате

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", storageCapacity=" + storageCapacity +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
