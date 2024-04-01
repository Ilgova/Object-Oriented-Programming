public class HotDrinkVendingMachine implements VendingMachine {
    public HotDrink getProduct(String name, int volume) {
        int temperature = 0;
        return new HotDrink(name, volume, temperature);
    }

    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        return new HotDrinkWithTemperature(name, volume, temperature);
    }
}