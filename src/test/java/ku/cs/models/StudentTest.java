package ku.cs.models;

import javafx.fxml.FXML;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("61xxxxxx","Petch");
    }
    @Test
    @DisplayName("Test 101")
    void testAddScore() {
        Student s1 = new Student("61xxxxxx", "Petch");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }
    @Test
    @DisplayName("Grade")
    void testCalculateGrade(){
        Student s1 = new Student("61xxxxxx", "Petch");
        s1.addScore(60.8);
        assertEquals("C", s1.grade());
    }
    @Test
    void testGetName() {
        Student s1 = new Student("61xxxxxx", "Petch");
        assertEquals("Petch", s1.getName());
    }

    @Test
    void testGetId() {
        Student s1 = new Student("61xxxxxx", "Petch");
        assertEquals("61xxxxxx", s1.getId());
    }


    @Test
    void testIsId(){
        Student s1 = new Student("61xxxxxx", "Petch");
        assertTrue(true , s1.getId());
    }

    @Test
    void testGetScore(){
        Student s1 = new Student("61xxxxxx", "Petch");
        s1.addScore(60.8);
        assertEquals(60.8, s1.getScore());
    }
}