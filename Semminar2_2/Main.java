package Semminar2_2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human = new Human("Mixa");
        Human human1 = new Human("Lexa");
        Thief thief = new Thief("Vasy");
        market.acceptToMarcet(human);
        market.acceptToMarcet(human1);
        market.acceptToMarcet(thief);
        market.update();


    }
}
