public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("Чай", 200, 70);
        HotDrinkWithTemperature coffee = new HotDrinkWithTemperature("Кофе", 300, 80);

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        HotDrink hotTea = vendingMachine.getProduct("Чай", 200, 70);
        HotDrinkWithTemperature hotCoffee = vendingMachine.getProduct("Кофе", 300, 80);

        System.out.println(hotTea.getName() + " " + hotTea.getVolume()+ " " + ((HotDrinkWithTemperature) hotTea).getTemperature());
        System.out.println(hotCoffee.getName() + " " + hotCoffee.getVolume() + " " + hotCoffee.getTemperature());
    }
}