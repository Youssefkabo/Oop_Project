import java.util.*;
public class Student extends User{
   public int year;
   public float gpa;
   public String major;
   Exam[] s_exams;

    public void setExams(Exam[] s_exams) {
        this.s_exams = s_exams;
    }
   

    public Student(String name,String age,String password,int year, float gpa, String major) {
        this.name=name;
        this.age=age;
        this.password=password;
        this.year = year;
        this.gpa = gpa;
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }
   

   
    
}
