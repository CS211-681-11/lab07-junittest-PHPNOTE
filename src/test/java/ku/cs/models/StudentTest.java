package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init() {
        s = new Student("6710405010","Note");
    }
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    void testIsId(){
        assertTrue(s.isId("6710405010"));
        assertFalse(s.isId("6xxxxxxxxx"));
    }

    @Test
    void testIsNameContains(){
        assertFalse(s.isNameContains("FF"));
        assertTrue(s.isNameContains("ot"));
    }

    @Test
    void testChangeName(){
        s.changeName("Teenoi");
        assertEquals("Teenoi", s.getName());
    }


    @Test
    void testToString(){
        assertEquals("{id: '6710405010', name: 'Note', score: 0.0}", s.toString());
    }
}