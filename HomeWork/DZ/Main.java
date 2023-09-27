package HomeWork.DZ;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<HotDrink> ListDrinks = new ArrayList<HotDrink>();
        ListDrinks.add(new HotDrink("Кофе", 60,150,95));
        ListDrinks.add(new HotDrink("Макочино", 100,200,90));
        ListDrinks.add(new HotDrink("Чай", 30,250,100));
        ListDrinks.add(new HotDrink("Капучино", 100,100,95));
        ListDrinks.add(new HotDrink("Эспрессо", 75,75,100));
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine(ListDrinks);
        System.out.println(vendingMachine.getDrinks("Чай"));
        System.out.println(vendingMachine.getDrinks("Чай", 100));
        System.out.println(vendingMachine.getDrinks("Эспрессо", 100,100));
        System.out.println(vendingMachine.getDrinks("Капучино", 95,75,100));
    }
}