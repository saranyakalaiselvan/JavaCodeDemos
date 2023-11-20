package crackit.java8.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Integer> crackITList = Arrays.asList(20,30,40,20,21,34,56,87,35,90);
        System.out.println(crackITList.stream().reduce((x, y) -> Math.max(x, y)).orElse(0));

        //With method reference ->
        Optional<Integer> maxValue = crackITList.stream().reduce(Math::max);

        //Instance with instance method name
        maxValue.ifPresent(System.out::println);

        //Class with instanceMethodName
        crackITList.stream().sorted(Integer::compareTo).forEach(System.out::println);

        //Reference to constructor
        crackITList.stream().sorted(Integer::compareTo)
                .collect(Collectors.toCollection(ArrayList::new));

    }
}
