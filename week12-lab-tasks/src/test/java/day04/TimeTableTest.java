package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTableTest {

    @Test
    void getNumberOfClassesByName() {
        TimeTable table = new TimeTable();
        table.readFile();
        System.out.println(table.getNumberOfClassesByName("Albatrosz Aladin"));
    }
}