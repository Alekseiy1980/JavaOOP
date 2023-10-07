package seminar1;

public class BottleofWater extends Product{
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleofWater(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleofWater { " +
                "name = " + super.getName() + " " +
                "price = " + super.getPrice() +" " +
                "volume = " + volume +
                " }";
    }
}
