package Semenar_OOP4.Controller;

import java.util.List;

import Semenar_OOP4.Model.User;

/**
 * UserController
 */
public interface UserController<T extends User> {

    void create(String fullName, Integer age, String phoneNumber);

    List<T> getAll();
    
    List<T> getAllSortUsers();

    List<T> getAllSortUsersBySurname();

    List<T> getAllSortUsersByAge();

    boolean removeUser(String fullName);
}