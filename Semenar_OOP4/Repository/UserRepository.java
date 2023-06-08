package Semenar_OOP4.Repository;

import java.util.List;

import Semenar_OOP4.Model.User;

public interface UserRepository<T extends User> {
    
    List<T> getAll();

    void add(T t);

    void remove(String s);

    Long getMaxId();
}
