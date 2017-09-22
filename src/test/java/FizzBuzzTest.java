import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private void assertAnswerForNumber(int n, String answer) {
        assertEquals(answer, FizzBuzz.answer(n));
    }

    private void assertAnswerIsFizzForNumber(int n) {
        assertAnswerForNumber(n, "Fizz");
    }

    private void assertAnswerIsBuzzForNumber(int n) {
        assertAnswerForNumber(n, "Buzz");
    }

    @Test(expected = FizzBuzz.NumberOutOfRangeException.class)
    public void outOfLowerBound() throws Exception {
        FizzBuzz.answer(0);
    }

    @Test(expected = FizzBuzz.NumberOutOfRangeException.class)
    public void outOfUpperBound() throws Exception {
        FizzBuzz.answer(101);
    }

    @Test
    public void number() throws Exception {
        assertAnswerForNumber(1, "1");
    }

    @Test
    public void fizz() throws Exception {
        assertAnswerIsFizzForNumber(3);
        assertAnswerIsFizzForNumber(13);
        assertAnswerIsFizzForNumber(31);
    }

    @Test
    public void buzz() throws Exception {
        assertAnswerIsBuzzForNumber(5);
        assertAnswerIsBuzzForNumber(52);
    }

    @Test
    public void fizzBuzz() throws Exception {
        assertAnswerForNumber(15, "FizzBuzz");
    }
}
