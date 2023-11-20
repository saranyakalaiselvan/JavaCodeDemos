package crackit.java8.functionalinterfaces.Demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionExamples {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Welcome", "to", "crackIT", "youtube", "channel");
        //Lambdas as method argument
        strings.forEach(s -> System.out.println());

        List<String> filteredList = strings.stream()
                //Lambdas as method argument
                .filter(s -> s.startsWith("c"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Filtered list: " +filteredList);

        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
        //Lambda as object for constructor
        new Thread(runnable).start();
    }
}
