public class HotDrink {
    private String name;
    private int volume;
    private int temperatur;

    public HotDrink(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperatur = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }
}