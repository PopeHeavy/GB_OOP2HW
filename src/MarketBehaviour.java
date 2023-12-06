import java.util.*;

public interface MarketBehaviour {
    void enterMarket(Actor actor);
    void removeFromMarket(List<Actor> actors);
    void serve();
}