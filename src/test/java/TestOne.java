import org.joda.time.DateTime;
import org.junit.jupiter.api.*;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOne {
    Student s1;
    Student s2;
    Student s3;
    Student s4;
    Module m1;
    Module m2;
    Module m3;
    Lecturer l1;
    Lecturer l2;
    Program ece;
    Program comp;
    Student[] group1 = new Student[]{};
    Student[] group2 = new Student[]{};
    Module[] mod1 = new Module[]{};
    Module[] mod2 = new Module[]{};
    Program[] progs = new Program[]{};
    DateTime eDate;
    DateTime sDate;
    DateTime dob1;
    DateTime dob2;
    DateTime dob3;
    DateTime dob4;
    DateTime dob5;

    @BeforeEach
    void populate() {
        // Populate dates
        for (int i=0; i<2; i++) {
            eDate = new DateTime(2022, 8, 1, 12, 30, 0, 0);
            sDate = new DateTime(2023, 6, 19, 12, 30, 0, 0);
            dob1 = new DateTime(2001, 1, 10, 12, 30, 0, 0);
            dob2 = new DateTime(2001, 4, 18, 12, 30, 0, 0);
            dob3 = new DateTime(2001, 3, 26, 12, 30, 0, 0);
            dob4 = new DateTime(2000, 8, 4, 12, 30, 0, 0);
            dob5 = new DateTime(1979, 12, 11, 12, 30, 0, 0);
            // Populate groups
            group1 = new Student[]{s1, s2};
            group2 = new Student[]{s3, s4};
            mod1 = new Module[]{m1, m2};
            mod2 = new Module[]{m2, m3};
            // Populate Class Objects
            // Programs
            ece = new Program("ECE", group1, mod1, sDate, eDate);
            comp = new Program("Comp Sci", group2, mod2, sDate, eDate);
            progs = new Program[] {ece, comp};
            // Students
            s1 = new Student("John", 21, dob1, 1221, ece, mod1);
            s2 = new Student("Amy", 21, dob2, 1222, ece, mod1);
            s3 = new Student("Sarah", 21, dob3, 1223, comp, mod2);
            s4 = new Student("Adam", 22, dob4, 1224, comp, mod2);
            // Lecturer
            l1 = new Lecturer("Aberdeen", 42, dob5, 12, mod1);
            l2 = new Lecturer("Michaels", 42, dob5, 13, mod2);
            // Modules
            m1 = new Module("Programming_3", 29102, group1, new Program[]{ece, comp}, l1);
            m2 = new Module("Digital Systems", 29213, group1, new Program[]{ece}, l1);
            m3 = new Module("Cloud Architecture", 2813, group1, new Program[]{comp}, l1);
        }
    }

    // All Student Method Tests
    @Nested
    @Order(1)
    @DisplayName("Student Tests")
    class Students {
        @Test
        @Order(1)
        @DisplayName("Student Name")
        void studentName() {
            s1.setName("Jim");
            Assertions.assertEquals("Jim", s1.getName());
        }

        @Test
        @Order(2)
        @DisplayName("Student Age")
        void studentAge(){
            s1.setAge(21);
            Assertions.assertEquals(21, s1.getAge());
        }

        @Test
        @Order(3)
        @DisplayName("Student Date of Birth")
        void studentBDay(){
            s2.setDob(dob3);
            Assertions.assertEquals(dob3, s2.getDob());
        }

        @Test
        @Order(4)
        @DisplayName("Student ID")
        void studentID(){
            s3.setId(1929);
            Assertions.assertEquals(1929, s3.getId());
        }

        @Test
        @Order(5)
        @DisplayName("Student Programme")
        void studentProgramme(){
            s2.setCourse(comp);
            Assertions.assertEquals(comp, s2.getCourse());
        }

        @Test
        @Order(6)
        @DisplayName("Student Modules")
        void studentModules(){
            s3.setModules(mod1);
            Assertions.assertEquals(mod1, s3.getModules());
        }

        @Test
        @Order(7)
        @DisplayName("Student Username")
        void studentUsername(){
            Assertions.assertEquals(s3.getName()+s3.getAge(), s3.getUsername());
        }

    }

    // All Lecturer Method Tests
    @Nested
    @Order(2)
    @DisplayName("Lecturer Tests")
    class Lecturers {
        @Test
        @Order(1)
        @DisplayName("Lecturer Name")
        void LecturerName() {
            l1.setName("Hawthorn");
            Assertions.assertEquals("Hawthorn", l1.getName());
        }

        @Test
        @Order(2)
        @DisplayName("Lecturer Age")
        void LecturerAge() {
            l1.setAge(42);
            Assertions.assertEquals(42, l1.getAge());
        }

        @Test
        @Order(3)
        @DisplayName("Lecturer Date of Birth")
        void LecturerBDay() {
            l1.setDob(dob2);
            Assertions.assertEquals(dob2, l1.getDob());
        }

        @Test
        @Order(4)
        @DisplayName("Lecturer ID")
        void LecturerID() {
            l1.setId(2121);
            Assertions.assertEquals(2121, l1.getId());
        }

        @Test
        @Order(5)
        @DisplayName("Lecturer Modules")
        void LecturerProgramme() {
            l1.setModules(mod2);
            Assertions.assertEquals(mod2, l1.getModules());
        }

        @Test
        @Order(6)
        @DisplayName("Lecturer Username")
        void LecturerUsername() {
            Assertions.assertEquals(l1.getName() + l1.getAge(), l1.getUsername());
        }
    }

    // All Module Method Tests
    @Nested
    @Order(3)
    @DisplayName("Module Tests")
    class Modules {
        @Test
        @Order(1)
        @DisplayName("Module Name")
        void moduleName() {
            m1.setName("Biochem");
            Assertions.assertEquals("Biochem", m1.getName());
        }

        @Test
        @Order(2)
        @DisplayName("Module ID")
        void moduleID() {
            m2.setId(1929);
            Assertions.assertEquals(1929, m2.getId());
        }

        @Test
        @Order(3)
        @DisplayName("Module Students")
        void moduleStudents() {
            m2.setStudents(group1);
            Assertions.assertEquals(group1, m2.getStudents());
        }

        @Test
        @Order(4)
        @DisplayName("Module Programmes")
        void moduleProgramms() {
            m2.setPrograms(progs);
            Assertions.assertEquals(progs, m2.getPrograms());
        }

        @Test
        @Order(5)
        @DisplayName("Module Lecturer")
        void moduleLecturer() {
            m2.setLecturer(l2);
            Assertions.assertEquals(l2, m2.getLecturer());
        }
    }

    // All Course Method Tests
    @Nested
    @Order(4)
    @DisplayName("Program Tests")
    class Programs {
        @Test
        @Order(1)
        @DisplayName("ProgramName")
        void programName() {
            ece.setName("EEE");
            Assertions.assertEquals("EEE", ece.getName());
        }

        @Test
        @Order(2)
        @DisplayName("Program Students")
        void programStudents() {
            ece.setStudents(group2);
            Assertions.assertEquals(group2, ece.getStudents());
        }

        @Test
        @Order(3)
        @DisplayName("Program Modules")
        void programModules() {
            ece.setModules(mod2);
            Assertions.assertEquals(mod2, ece.getModules());
        }

        @Test
        @Order(4)
        @DisplayName("Program Start")
        void programStart() {
            ece.setStartDate(dob2);
            Assertions.assertEquals(dob2, ece.getStartDate());
        }

        @Test
        @Order(5)
        @DisplayName("Program End")
        void programEnd() {
            ece.setEndDate(dob2);
            Assertions.assertEquals(dob2, ece.getEndDate());
        }
    }

}
