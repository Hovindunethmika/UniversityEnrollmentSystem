package universityenrollmentsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonStudentLecturerTest {

    // Verify constructor behaviour of Student
    @Test
    public void testStudentConstructor() {
        Student student = new Student("Alice", "Brown");

        // Verify that getName() and getSurname() return correct values
        assertEquals("Alice", student.getName(), "Name should be Alice");
        assertEquals("Brown", student.getSurname(), "Surname should be Brown");
    }

    // Check updating modulesEnrolled field
    @Test
    public void testStudentModulesEnrolledUpdate() {
        Student student = new Student("John", "Doe");
        student.setModulesEnrolled(4);
        assertEquals(4, student.getModulesEnrolled(), "Initial modules should be 4");
        student.setModulesEnrolled(6);
        assertEquals(6, student.getModulesEnrolled(), "Final modules should be 6");
    }

    @Test
    public void testLecturerOfficeNumber() {
        Lecturer lecturer = new Lecturer("Jane", "Smith");
        lecturer.setOfficeNumber(210);
        assertEquals(210, lecturer.getOfficeNumber(), "Office number should be 210");
    }
}