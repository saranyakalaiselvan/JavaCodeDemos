package crackit.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamsCreationExample {
    public static void main(String[] args) {

        //Stream.of
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));

        //Stream.of(arrays)
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream<Integer> streamFromArrays = Stream.of(integerArray);
        streamFromArrays.forEach(p -> System.out.println(p));

        //Stream.of(collection)
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        Stream<Integer> streamFromList = integerList.stream();
        streamFromList.forEach(p -> System.out.println(p));

        //Stream.builder()
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();
        streamBuilder.forEach(p -> System.out.println(p));

        // using Stream.generate() method
        // to generate 5 random Integer values
        Stream.generate(new Random()::nextInt)
                .limit(5).forEach(System.out::println);

        //Stream.empty
        Stream<Integer> emptyStream = Stream.empty();

    }
}
