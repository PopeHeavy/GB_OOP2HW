import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Actor> queue;

    public Market(){
        this.queue = new ArrayList<>();
    }

    @Override
    public void enterMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        addToQueue(actor);
    }

    @Override
    public void addToQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for(Actor actor: queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for(Actor actor: queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void removeFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for(Actor actor: queue){
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " ушел из очереди");
            }
        }
        removeFromMarket(releasedActors);
    }

    @Override
    public void removeFromMarket(List<Actor> actors) {
        for(Actor actor: actors){
            System.out.println(actor.getName() + " ушел");
            queue.remove(actor);
        }
    }

    @Override
    public void serve() {
        takeOrders();
        giveOrders();
        removeFromQueue();
    }
}