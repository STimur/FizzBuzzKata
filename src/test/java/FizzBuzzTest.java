import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private void assertAnswerForNumber(int n, String answer) {
        assertEquals(answer, FizzBuzz.answer(n));
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
    public void one() throws Exception {
        assertAnswerForNumber(1, "1");
    }

    @Test
    public void two() throws Exception {
        assertAnswerForNumber(2, "2");
    }

    @Test
    public void fizz() throws Exception {
        assertAnswerForNumber(3, "Fizz");
    }

    @Test
    public void buzz() throws Exception {
        assertAnswerForNumber(5, "Buzz");
    }
}
