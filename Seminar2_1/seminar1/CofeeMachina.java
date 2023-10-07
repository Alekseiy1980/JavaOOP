package seminar1;

import java.util.List;

public class CofeeMachina implements Machine{
    List<HotDrink>listHotDrink;

    public void setListHotDrink(List<HotDrink> listHotDrink) {
        this.listHotDrink = listHotDrink;
    }

    public CofeeMachina(List<HotDrink> listHotDrink) {
        this.listHotDrink = listHotDrink;
    }
    public Product getProduct(String name,int volume, int temp) {
        for(HotDrink hotDrink : listHotDrink){
            if(hotDrink.getName().equals(name)&&hotDrink.getVolume()==volume && hotDrink.getTemp()==temp){
                return hotDrink;
            }
        }
        return null;
    }
    public Product getProduct(String name,int volume) {
        for(HotDrink hotDrink : listHotDrink){
            if(hotDrink.getName().equals(name)&&hotDrink.getVolume()==volume){
                return hotDrink;
            }
        }
        return null;
    }
    @Override
    public Product getProduct(String name) {
        for(Product product : listHotDrink){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    public void addHotDrink(HotDrink hotDrink){
        this.listHotDrink.add(hotDrink);
    }
}
