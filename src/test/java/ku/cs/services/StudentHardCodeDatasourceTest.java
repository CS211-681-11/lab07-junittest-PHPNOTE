package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    void testReadData() {
        StudentHardCodeDatasource sl =  new StudentHardCodeDatasource();
        StudentList list = sl.readData();
        assertEquals(4,list.getStudents().size());
        assertNull(list.findStudentById("6710405111"));
        assertEquals(2,list.filterByName("i").getStudents().size());
    }
}