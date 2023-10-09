package Semminar2_2;

public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected boolean isMakeOrder;  // сделать заказ
    protected boolean isTakeOrder;  //принять заказ

    public Actor(String name){this.name = name;}

    public abstract String getName();


    public abstract boolean isMakeOrder();

    public abstract void setMakeOrder(boolean makeOrder);

    public abstract boolean isTakeOrder();

    public abstract void setTakeOrder(boolean takeOrder);
}
