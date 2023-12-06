public interface QueueBehaviour {
    void addToQueue(Actor actor);
    void removeFromQueue();
    void takeOrders();
    void giveOrders();

}