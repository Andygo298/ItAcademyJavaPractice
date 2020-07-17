package Week1Task1;

import Week1Task1.impl.RegExpNumberTransformer;
import Week1Task1.impl.SimpleNumberTransformer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NumberTransformerTest {
    private static List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

    @Test
    public void RegExpNumberFormatTest() {
        NumberTransformer numberTransformer = new RegExpNumberTransformer();
        String afterFormat = numberTransformer.toFormat(testList);
        System.out.println(afterFormat + " -- by RegExp");
    }
    @Test
    public void SimpleNumberFormatTest(){
        NumberTransformer numberTransformer = new SimpleNumberTransformer();
        String afterFormat = numberTransformer.toFormat(testList);
        System.out.println(afterFormat + " -- by StringBuilder");
    }
}