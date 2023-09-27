package Semminar1.Work1;

public class BottleoWater extends Product{
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleoWater(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleoWater{" +
                "name = " + super.getName() + "\\"+
                ", price = " + super.getPrice() +"\\" +
                "volume=" + volume +
                '}';
    }
}
