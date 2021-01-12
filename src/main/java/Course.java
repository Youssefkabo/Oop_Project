import java.util.*;
public class Course {
    String name;
    int credit;
    Exam[] exams;

    public void setExams(Exam[] exams) {
        this.exams = exams;
    }

    public Course(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }
}
