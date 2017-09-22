public class FizzBuzz {
    public static String answer(int n) {
        if (isValid(n))
            throw new NumberOutOfRangeException();
        if (n % 3 == 0)
            return "Fizz";
        return String.valueOf(n);
    }

    private static boolean isValid(int n) {
        return n < 1 || n > 100;
    }

    public static class NumberOutOfRangeException extends RuntimeException {
    }
}
