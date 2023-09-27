package HomeWork.DZ;

import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    List<HotDrink> hotDrinkList;

    public HotDrinksVendingMachine(List<HotDrink> hotDrinkList){this.hotDrinkList=hotDrinkList;}

    public List<HotDrink> getHotDrinkList() {
        return hotDrinkList;
    }

    public void setHotDrinkList(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    public Drinks getDrinks(String name, int temperature, int volum, int price) {
        for(HotDrink hotDrink : hotDrinkList){
            if(hotDrink.getName().equals(name)&&hotDrink.getVolume() == volum && hotDrink.getTemperature() == temperature && hotDrink.getPrice() == price){
                return hotDrink;
            }
        }
        return null;
    }

    public Drinks getDrinks(String name){
        for(HotDrink hotDrink : hotDrinkList){
            if(hotDrink.getName().equals(name)){
                return hotDrink;
            }
        }
        return null;
    }
    public Drinks getDrinks(String name, int temperature){
        for(HotDrink hotDrink : hotDrinkList){
            if(hotDrink.getName().equals(name) && hotDrink.getTemperature() == temperature){
                return hotDrink;
            }
        }
        return null;
    }

    public Drinks getDrinks(String name, int temperature, int volume) {
        for(HotDrink hotDrink : hotDrinkList){
            if(hotDrink.getName().equals(name)&& hotDrink.getTemperature() == temperature && hotDrink.getVolume() == volume){
                return hotDrink;
            }
        }

        return null;
    }

    public void addHotDrink(HotDrink hotDrink){
        this.hotDrinkList.add(hotDrink);
    }


    @Override
    public Drinks getProduct(String name, int temperature, int volume) {
        for(HotDrink hotDrink : hotDrinkList){
            if(hotDrink.getName().equals(name)&& hotDrink.getTemperature() == temperature && hotDrink.getVolume() == volume){
                return hotDrink;
            }
        }
        return null;
    }
}
