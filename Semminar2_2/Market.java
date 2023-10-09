package Semminar2_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehavior ,MarcetBehaviour{
   private List<Actor>actors;

    public Market() {
        this.actors = new ArrayList<Actor>() ;
    }

    //зашел в магазин
    @Override
    public void acceptToMarcet(Actor actor) {

        System.out.println(actor.getName()+" зашел в магазин");
       takeinQueue(actor);
    }
    //добовляет в очередь
    @Override
    public void takeinQueue(Actor actor) {
        this.actors.add(actor);
        System.out.println(actor.getName()+" встал в очередь");
    }
    //взял заказ
    @Override
    public void takeOrders() {
        for(Actor actor:actors){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }

    }
    //отдал заказ
    @Override
    public void giveOrders() {
        for (Actor actor:actors){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName()+" получил товар");
            }else System.out.println(actor.getName()+" вынес товар");
        }

    }
    //покинул очередь
    @Override
    public void releaseFromQueue() {
        List<Actor>relesedActors = new ArrayList<>();
        for (Actor actor: actors){
            if(actor.isTakeOrder()){
                relesedActors.add(actor);
                System.out.println(actor.getName()+ " вышел из очереди");
            }
        }
        realiseFromMarcet(relesedActors);
    }
    //покинул магазин
    @Override
    public void realiseFromMarcet(List<Actor> actors) {
        for(Actor actor:actors){
           System.out.println(actor.getName()+" вышел с магазина");
           this.actors.remove(actor);
        }
    }

    //обновление
    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

}
