package crackit.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamStatefulExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(21, 2,3,4,5, null);
        List<Integer> square = number
                .stream()
                .filter(Objects::nonNull)
                .peek(System.out::println)
                .map(x->x*x)
                .collect(Collectors.toList());
        square.forEach(System.out::println);

        System.out.println("******Stateful*******");
        List<Integer> statefulSquare = number
                .stream()
                .filter(Objects::nonNull)
                .sorted()
                .peek(System.out::println)
                .map(x->x*x)
                .collect(Collectors.toList());
        statefulSquare.forEach(System.out::println);
    }
}
