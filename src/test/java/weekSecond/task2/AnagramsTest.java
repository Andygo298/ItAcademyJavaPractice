package weekSecond.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class AnagramsTest {
    private List<String> testStrings = new ArrayList<>(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
    private Anagrams anagrams = new Anagrams();

    @Test
    void toSortedAnagramsListsTest() {
        List<String> exp1 = new ArrayList<>(Arrays.asList("ate", "eat", "tea"));
        List<String> exp2 = new ArrayList<>(Arrays.asList("nat", "tan"));
        List<String> exp3 = new ArrayList<>(Collections.singletonList("bat"));
        List<List<String>> lists = anagrams.toSortedAnagramsLists(testStrings);
        assertNotNull(lists);
        assertEquals(exp1, lists.get(0));
        assertEquals(exp2, lists.get(1));
        assertEquals(exp3, lists.get(2));
    }
}