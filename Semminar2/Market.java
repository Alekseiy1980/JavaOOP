package Semminar2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour ,MarketBehavioiur {

    private List<Actor> queue;
    private boolean isInQueue;


    public Market() {
        this.queue = new ArrayList<Actor>();
    }


    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(" пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(" встал в очередь" + actor.getName());
        this.queue.add(actor);
    }
    @Override
    public void takeOrders() {
        for(Actor actor : queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(" сделал свой заказ "+ actor.getName());
            }
        }
    }


    @Override
    public void qiverOrders() {
        for(Actor actor : queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println("получил свой заказ " + actor.getName());
            }
        }

    }

    @Override
    public void releaseFromQueue() {
         List<Actor> releasedActors = new ArrayList<>();
         for (Actor actor : queue) {
            if(actor.isTakeOrder()){
            releasedActors.add(actor);
            System.out.println("Вышел из очереди " + actor.getName());
         }
        }
        relesseFromMarket(releasedActors);
    }
    @Override
    public void relesseFromMarket(List<Actor> actors) {
        for (Actor actor : actors){
            System.out.println(" вышел с магазина " + actor.getName());
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        qiverOrders();
        releaseFromQueue();

    }
}
