package Semminar2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human = new Human("John");
        Human human2 = new Human("Vladimir");
        market.acceptToMarket(human);
        market.acceptToMarket(human2);
        market.update();
    }
}
