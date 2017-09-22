import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test(expected = FizzBuzz.NumberOutOfRangeException.class)
    public void outOfLowerBound() throws Exception {
        FizzBuzz.ask(0);
    }

    @Test(expected = FizzBuzz.NumberOutOfRangeException.class)
    public void outOfUpperBound() throws Exception {
        FizzBuzz.ask(101);
    }

    @Test
    public void one() throws Exception {
        assertEquals("1", FizzBuzz.ask(1));
    }
}
