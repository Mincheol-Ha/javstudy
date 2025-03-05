package hello.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTest {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0; // 양수를 찾는 Predict

        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 42, 7);

        List<Integer> positiveNumbers = numbers.stream()
                .filter(isPositive)
                .collect(Collectors.toList());
        System.out.println(positiveNumbers);


    }
}
