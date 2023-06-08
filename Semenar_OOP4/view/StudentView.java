package Semenar_OOP4.view;

import java.util.List;

import Semenar_OOP4.Controller.UserController;
import Semenar_OOP4.Model.Student;

public class StudentView implements UserView<Student>{

    UserController<Student> controller;

    public StudentView(UserController<Student> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Student> students = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersBySurname();
            case SortType.AGE -> controller.getAllSortUsersByAge();
            default -> null;
        };
        if (students == null) {
            return;
        }
        System.out.println("===================================");        
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("===================================");        
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        controller.create(fullName, age, phoneNumber);
    }

    @Override
    public void removeUser(String fullName) {
        controller.removeUser(fullName);
    }
    
}
