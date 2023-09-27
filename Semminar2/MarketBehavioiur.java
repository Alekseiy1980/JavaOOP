package Semminar2;

import java.util.List;

public interface MarketBehavioiur {

    void acceptToMarket(Actor actor);
    void relesseFromMarket(List<Actor> actor);
    void update();
}
