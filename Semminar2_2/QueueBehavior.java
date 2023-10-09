package Semminar2_2;

public interface QueueBehavior {
    public void takeinQueue(Actor actor);
    public void takeOrders();
    public void giveOrders();
    public void releaseFromQueue();
}
