public class Module {
    private String name;
    private int id;
    private Student[] students;
    private Program[] programs;
    private Lecturer lecturer;

    public Module(String name, int id, Student[] students, Program[] programs, Lecturer lecturer) {
        this.name = name;
        this.id = id;
        this.students = students;
        this.programs = programs;
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Program[] getPrograms() {
        return programs;
    }

    public void setPrograms(Program[] programs) {
        this.programs = programs;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
