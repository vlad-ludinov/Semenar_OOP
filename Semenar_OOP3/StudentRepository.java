package Semenar_OOP3;

// import Lombok.Getter;



// @Getter
public class StudentRepository {

    private final StudentGroup studentGroup;

    public StudentRepository(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student){
        studentGroup.addStudent(student);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}
