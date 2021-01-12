import java.util.*;
public class Teacher extends User{
    String[] office_hours;
    
    public Teacher(String name,String age,String password,String[] office_hours) {
        this.office_hours = office_hours;
        this.name=name;
        this.age=age;
        this.password=password;
        setPermissions();
    }

    public void setPermissions() {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Professor 2.Assistant");
        int permissions =  scan.nextInt();
        this.permissions = permissions;
    }

    
}
