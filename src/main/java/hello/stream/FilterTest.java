package hello.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterTest {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0; // 양수를 찾는 Predict

        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 42, 7);
        Stream<Integer> s = numbers.stream().filter(isPositive);
        s.forEach(n-> System.out.println(n));

      /*  List<String> words = Arrays.asList("apple","banana", "sherry");
        Function<String, Integer> stringLength = String::lenghth */

    }
}
