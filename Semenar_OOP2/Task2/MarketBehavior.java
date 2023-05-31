package Semenar_OOP2.Task2;

import java.util.List;

import Semenar_OOP2.Task1.Actor;

public interface MarketBehavior {
    
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update(); 

}
