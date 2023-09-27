package Semminar1.Work1;

import java.util.List;

public class BottleofWaterVendingMachine implements VendingMachine {
    List<BottleoWater> productList;

    public BottleofWaterVendingMachine(List<BottleoWater> productList) {
        this.productList = productList;
    }

    public List<BottleoWater> getProductList() {
        return productList;
    }

    public void setProductList(List<BottleoWater> productList) {
        this.productList = productList;
    }
    public Product getProduct(String name, int volume) {

        for(BottleoWater bottleoWater : productList) {
            if(bottleoWater.getName().equals(name) && bottleoWater.getVolume() == volume){
                return bottleoWater;
            }
        }
        return null;
    }
    @Override
    public Product getProduct(String name) {

        for(Product product : productList) {
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    public  void addBotleofWater(BottleoWater bottleoWater){
        this.productList.add(bottleoWater);
    }

}
