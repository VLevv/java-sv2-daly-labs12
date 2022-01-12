package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {
    @Test
    void testLNKO(){
        MathAlgorithms algorithms = new MathAlgorithms();
        assertEquals(1, algorithms.lNKO(11,17));
        assertEquals(8,algorithms.lNKO(24,32));
    }
}