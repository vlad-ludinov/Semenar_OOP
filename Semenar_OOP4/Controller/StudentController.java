package Semenar_OOP4.Controller;

import java.util.List;

import Semenar_OOP4.Model.Student;
import Semenar_OOP4.Service.StudentService;
import Semenar_OOP4.Service.UserService;

public class StudentController implements UserController<Student>{

    public UserService<Student> studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        studentService.create(fullName, age, phoneNumber);
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @Override
    public List<Student> getAllSortUsers() {
        return studentService.getAllSortUsers();
    }

    @Override
    public List<Student> getAllSortUsersBySurname() {
        return studentService.getAllSortUsersBySurname();    
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        return studentService.getAllSortUsersByAge();    
    }
    
    @Override
    public boolean removeUser(String fullName) {
        studentService.removeUser(fullName);
        return true;
    }

    
}
