package weekSecond.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracersTest {

    private Bracers bracers = new Bracers();
    private String exampleOne = "";
    private String exampleTwo = "()";
    private String exampleThree = "(){}[]";
    private String exampleFour = "(]";
    private String exampleFive = "([)]";
    private String exampleSix = "{[]}";

    @Test
    void isCorrectTest() {
        assertAll(
                () -> assertTrue(bracers.isCorrect(exampleOne)),
                () -> assertTrue(bracers.isCorrect(exampleTwo)),
                () -> assertTrue(bracers.isCorrect(exampleThree)),
                () -> assertFalse(bracers.isCorrect(exampleFour)),
                () -> assertFalse(bracers.isCorrect(exampleFive)),
                () -> assertTrue(bracers.isCorrect(exampleSix))
        );
    }
}