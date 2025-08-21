package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList list;
    @BeforeEach
    void init(){
        list = new StudentList();
        list.addNewStudent("6710405001","Note");
        list.addNewStudent("6710405002","Bank",56.32);
        list.addNewStudent("6710405003","Zigzag",70.6);
    }

    @Test
    void testAddNewStudent() {
        list.addNewStudent("6710405004","Ja");
        assertEquals(4, list.getStudents().size());
        list.addNewStudent("6710405005","YN",56.32);
        assertEquals(5, list.getStudents().size());
    }

    @Test
    void testFindStudentById() {
        assertTrue(list.findStudentById("6710405001").isId("6710405001"));
        assertNull(list.findStudentById("6710405010"));
    }

    @Test
    void testFilterByName() {
        assertEquals(2,list.filterByName("a").getStudents().size());
        assertEquals(1,list.filterByName("o").getStudents().size());
        assertEquals(0,list.filterByName("p").getStudents().size());

    }

    @Test
    void testGiveScoreToId() {
        list.giveScoreToId("6710405003",5);
        assertEquals(75.6,list.findStudentById("6710405003").getScore());
    }

    @Test
    void testViewGradeOfId() {
        assertEquals("B",list.viewGradeOfId("6710405003"));
        assertEquals("D",list.viewGradeOfId("6710405002"));
    }
}