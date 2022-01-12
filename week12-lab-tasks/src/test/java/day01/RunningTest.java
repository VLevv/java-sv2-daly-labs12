package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningTest {
    @Test
    void testRunning(){
        Running running = new Running();
        assertEquals(7.1,running.monthlyResult("2021","11"));
        assertEquals(25.9,running.monthlyResult("2022","01"));
    }
}