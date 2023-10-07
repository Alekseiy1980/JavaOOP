package seminar1;

import java.util.List;

public class BottleOfWaterMachine implements Machine{
    List<BottleofWater>productList;


    public List<BottleofWater> getProductList() {
        return productList;
    }

    public void setProductList(List<BottleofWater> productList) {
        this.productList = productList;
    }

    public BottleOfWaterMachine(List<BottleofWater> productList) {
        this.productList = productList;
    }

    public Product getProduct(String name, int volume) {
        for(BottleofWater bottleofWater : productList){
            if(bottleofWater.getName().equals(name)&&bottleofWater.getVolume()==volume){
                return bottleofWater;
            }
        }
        return null;
    }
    @Override
    public Product getProduct(String name) {
        for(Product product : productList){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    public void addBottleOfWater(BottleofWater bottleofWate){
        this.productList.add(bottleofWate);
    }

}

