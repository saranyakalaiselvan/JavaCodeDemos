package crackit.java8.streams.codingexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        //Split the list for even and odd numbers
        List<Integer> integerList = Arrays.asList(10, 15, 20, 23, 15, 14, 67, 2, 7, 19, 17, 22, 88, 100);
        Map<Boolean, List<Integer>> oddEvenNumbersMap =
                integerList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        oddEvenNumbersMap.entrySet().stream()
                .forEach(s -> printValues(s));
    }


    private static void printValues(Map.Entry<Boolean, List<Integer>> s) {
        if(s.getKey()) {
            System.out.println("Even Numbers:::");
        } else {
            System.out.println("Odd Numbers:::");
        }
        s.getValue().forEach(System.out::println);
    }
}


/*****
 * true -> 10,20,14 ...
 * false -> 15,23 ...
 *
 *
 *
 */