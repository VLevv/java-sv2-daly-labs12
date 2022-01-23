package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {
    public Map<Character,Integer> dissectWord(String word){
        Map<Character,Integer> result = new HashMap<>();
        char[] tmp = word.toCharArray();
        for (char c :
                tmp) {
            if(!result.containsKey(c)) result.put(c,0);
            result.put(c,result.get(c)+1);
        }
        return result;
    }
}
