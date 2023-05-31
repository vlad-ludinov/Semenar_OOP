package Semenar_OOP2.Task2;

import Semenar_OOP2.Task1.Actor;

public interface QueueBehavior {
    
    void takelnQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();

}
