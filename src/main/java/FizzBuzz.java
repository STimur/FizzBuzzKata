public class FizzBuzz {
    public static String answer(int n) {
        if (isValid(n))
            throw new NumberOutOfRangeException();
        return fizzBuzz(n);
    }

    private static boolean isValid(int n) {
        return n < 1 || n > 100;
    }

    private static String fizzBuzz(int n) {
        if (isFizzBuzz(n))
            return "FizzBuzz";
        return fizz(n);
    }

    private static boolean isFizzBuzz(int n) {
        return isFizz(n) && isBuzz(n);
    }

    private static String fizz(int n) {
        if (isFizz(n))
            return "Fizz";
        return buzz(n);
    }

    private static boolean isFizz(int n) {
        return dividableByThree(n) || containsThree(n);
    }

    private static boolean dividableByThree(int n) {
        return n % 3 == 0;
    }

    private static boolean containsThree(int n) {
        return startsWithThree(n) || endsOnThree(n);
    }

    private static boolean startsWithThree(int n) {
        return n >= 30 && n <= 39;
    }

    private static boolean endsOnThree(int n) {
        return n % 10 == 3;
    }

    private static String buzz(int n) {
        if (isBuzz(n))
            return "Buzz";
        return String.valueOf(n);
    }

    private static boolean isBuzz(int n) {
        return n % 5 == 0;
    }

    public static class NumberOutOfRangeException extends RuntimeException {
    }
}
