package Semenar_OOP3;

// import lombok.*;

//@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode
// @Data
public class Student implements Comparable<Student> {

    private final Long id;
    private final String fullName;

    public Student(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    @Override
    public int compareTo(Student o) {
        return fullName.compareTo(o.fullName);
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return String.format("%d: %s", id, fullName);
    }

    @Override
    public boolean equals(Object obj) {
        String str = (String)obj;
        return this.fullName == str;
    }

}
