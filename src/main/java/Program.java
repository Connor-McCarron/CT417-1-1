import org.joda.time.DateTime;

public class Program {
    private String name;
    private Student[] students;
    private Module[] modules;
    private DateTime startDate;
    private DateTime endDate;

    public Program(String name, Student[] students, Module[] modules, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.students = students;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
