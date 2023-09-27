package Semminar2;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrders();
    void qiverOrders();
    void releaseFromQueue();
}
