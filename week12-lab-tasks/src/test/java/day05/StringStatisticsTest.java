package day05;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    @Test
    void dissectWord() {
        StringStatistics statistics = new StringStatistics();
        Map<Character,Integer> testMap= statistics.dissectWord("alma");
        assertEquals(2,testMap.get('a'));
        assertEquals(1,testMap.get('l'));
        assertEquals(1,testMap.get('m'));
    }
}