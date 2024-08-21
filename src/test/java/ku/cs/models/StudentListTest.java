package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    Student s1;

    @BeforeEach
    void init() {
        s1 = new Student("61xxxxxx", "Petch");
    }

    @Test
    void testAddnewStudents() {
        s1 = new Student("61xxxxxx", "Petch");
    }

    @Test
    void testAddnewStudentsScore() {
        s1 = new Student("61xxxxxx", "Petch", 60.5);
    }

    @Test
    void testfindStudentById(){
        s1 = new Student(null, null);
        assertNull(null);
        assertNotNull(s1);
    }

    @Test
    void testgiveScoreToId() {
        s1 = new Student("61xxxxxx", "Petch", 60.5);
        s1.addScore(85);
        assertEquals("A", s1.grade());
    }

    @Test
    void viewGradeOfId() {
        s1 = new Student("61xxxxxx", "Petch", 60.5);
        assertEquals("C", s1.grade());
    }
}