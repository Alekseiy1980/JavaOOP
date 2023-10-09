package Semminar2_2;

import java.util.Random;

public class Thief extends Actor {
    public Thief(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
    super.isMakeOrder = makeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return true;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
    super.isTakeOrder = takeOrder;
    }


