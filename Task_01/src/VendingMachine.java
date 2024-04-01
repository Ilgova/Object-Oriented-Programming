public interface VendingMachine {
    public HotDrink getProduct(String name, int volume);
    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature);
}
