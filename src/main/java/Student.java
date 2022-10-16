import org.joda.time.*;
public class Student {
    private String name;
    private int age;
    private DateTime dob;
    private int id;
    private Program course;
    private Module[] modules;

    public Student(String name, int age, DateTime dob, int id, Program course, Module[] modules) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.course = course;
        this.modules = modules;
    }

    public String getUsername() {
        return name+age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Program getCourse() {
        return course;
    }

    public void setCourse(Program course) {
        this.course = course;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }
}
