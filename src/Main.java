public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Human human1 = new Human("Karen");

        Human human2 = new Human("Chad");

        Human human3 = new Human("Steve");

        Human human4 = new Human("Harold");

        market.enterMarket(human1);

        market.enterMarket(human2);

        market.enterMarket(human3);

        market.enterMarket(human4);

        market.serve();
    }
}