public class FizzBuzz {
    public static void ask(int n) {
        if (n < 1 || n > 100)
            throw new NumberOutOfRangeException();
    }

    public static class NumberOutOfRangeException extends RuntimeException {
    }
}
