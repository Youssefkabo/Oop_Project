import java.util.*;
public class User {
    public String name;
    public String age;
    public String password;
    public Course[] courses;
    public int permissions = 0;
    
    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }


}
