package crackit.java8.streams.codingexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedLimit {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 15, 20, 23, 15, 14, 67, 2, 7, 19, 17, 22, 88, 100);
        List<Integer> sortedLimitList = integerList.stream().sorted().limit(3).collect(Collectors.toList());
        sortedLimitList.forEach(System.out::println);
    }
}
