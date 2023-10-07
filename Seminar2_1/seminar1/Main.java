package seminar1;

import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
//        List<BottleofWater> listProduct = new ArrayList<>();
//        listProduct.add(new BottleofWater("OOPseminar",7,2));
//        listProduct.add(new BottleofWater("OOPleccia",7,1));
//        listProduct.add(new BottleofWater("DZ",5,4));
//        listProduct.add(new BottleofWater("Java",20,100));
//        listProduct.add(new BottleofWater("Test",11,5));
//        BottleOfWaterMachine machine = new BottleOfWaterMachine(listProduct);
//        System.out.println(machine.getProduct("OOPleccia"));
//        System.out.println(machine.getProduct("DZ"));
//        System.out.println(machine.getProduct("Test"));
//        System.out.println(machine.getProduct("OOPleccia", 5));

        List<HotDrink>hotDrinkList = new ArrayList<>();
        hotDrinkList.add(new HotDrink("Cofee",7,2,100));
        hotDrinkList.add(new HotDrink("Americano",5,1,100));
        hotDrinkList.add(new HotDrink("Espresso",6,3,90));
        hotDrinkList.add(new HotDrink("Tea",7,2,100));
        CofeeMachina machina=new CofeeMachina(hotDrinkList);
        System.out.println(machina.getProduct("Tea"));
        System.out.println(machina.getProduct("Tea",2));
        System.out.println(machina.getProduct("Tea",2,100));
        System.out.println(machina.getProduct("Tea",21));
        System.out.println(machina.getProduct("Tea",2,90));
    }
}
