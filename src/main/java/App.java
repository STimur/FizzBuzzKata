import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(n -> System.out.println(FizzBuzz.answer(n)));
    }
}