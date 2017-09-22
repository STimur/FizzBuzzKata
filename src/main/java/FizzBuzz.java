public class FizzBuzz {
    public static void ask(int n) {
        if (isValid(n))
            throw new NumberOutOfRangeException();
    }

    private static boolean isValid(int n) {
        return n < 1 || n > 100;
    }

    public static class NumberOutOfRangeException extends RuntimeException {
    }
}
