import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
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
        assertEquals("1", FizzBuzz.answer(1));
    }

    @Test
    public void two() throws Exception {
        assertEquals("2", FizzBuzz.answer(2));
    }
}
