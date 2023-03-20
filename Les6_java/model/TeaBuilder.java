package model;

public class TeaBuilder {
    public static TeaBuilder instance;
    public Tea tea;

    public static TeaBuilder getInstance() {
        instance = new TeaBuilder();
        instance.tea = new Tea();
        return instance;
    }

    public TeaBuilder setName(String name) {
        tea.setName(name);
        return this;
    }

    public TeaBuilder setPrice(int price) {
        tea.setPrice(price);
        return this;
    }

    public TeaBuilder setVolume(int volume) {
        tea.setVolume(volume);
        return this;
    }

    public TeaBuilder setTemperature(Integer temperature) {
        tea.setTemperature(temperature);
        return this;
    }

    public Tea build() {
        return tea;
    }

}