import org.junit.Test;

public class FizzBuzzTest {
    @Test(expected = FizzBuzz.NumberOutOfRangeException.class)
    public void outOfLowerBound() throws Exception {
        FizzBuzz.ask(0);
    }

    @Test(expected = FizzBuzz.NumberOutOfRangeException.class)
    public void outOfUpperBound() throws Exception {
        FizzBuzz.ask(101);
    }
}
