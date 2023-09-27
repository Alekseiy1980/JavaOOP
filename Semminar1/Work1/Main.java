package Semminar1.Work1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
     List<BottleoWater> ListProduct = new ArrayList<BottleoWater>();
     ListProduct.add(new BottleoWater("OOPseminar",7,2));
     ListProduct.add(new BottleoWater("OOPLec",7,1));
     ListProduct.add(new BottleoWater("DZ",5,4));
     ListProduct.add(new BottleoWater("Java",20,100));
     ListProduct.add(new BottleoWater("Test",11,5));
     BottleofWaterVendingMachine vendingMachine = new BottleofWaterVendingMachine(ListProduct);
     System.out.println(vendingMachine.getProduct("OOPseminar"));

    }
}
