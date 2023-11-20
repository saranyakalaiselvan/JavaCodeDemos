package crackit.java8.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsIntermediateOperationsLazyExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Welcome", "to", "crackIT", "youtube", "channel", "Java", "Coding");
        Stream<String> stream = strings.stream().filter(s->s.startsWith("c")).peek(System.out::println);
        List<String> filteredList  = stream.collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }
}
