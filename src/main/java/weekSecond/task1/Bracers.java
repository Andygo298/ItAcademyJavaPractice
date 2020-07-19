package weekSecond.task1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Bracers {

    private Map<Character,Character> bracersMap = new HashMap<>();
    private Deque<Character> characters = new ArrayDeque<>();

    {
        bracersMap.put('(',')');
        bracersMap.put('{','}');
        bracersMap.put('[',']');
    }

    public boolean isCorrect(String stringToCheck){
        
        return false;
    }

}
