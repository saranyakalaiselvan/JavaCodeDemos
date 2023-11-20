package crackit.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPipelineExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5, null);
        List<Integer> square = number
                                .stream()
                                .filter(Objects::nonNull)
                                .map(x->x*x)
                                .collect(Collectors.toList());
        square.forEach(System.out::println);
        System.out.println("Printing numbers list");
        number.forEach(System.out::println);
    }
}
