package crackit.java8.functionalinterfaces.Demos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Welcome", "to", "crackIT", "youtube", "channel");
        // Creating predicate - String starting with startWithC
        Predicate<String> startWithC = s -> s.startsWith("c");

        //Using it in filter
        List<String> filteredList = strings.stream()
                .filter(startWithC)
                .collect(Collectors.toList());
        System.out.println("Starts With c: " + filteredList);

        //Predicate AND - String starting with startWithC and ends with t
        Predicate<String> endWithT = s -> s.endsWith("T");
        List<String> filteredList1 = strings.stream()
                .filter(startWithC.and(endWithT))
                .collect(Collectors.toList());
        System.out.println("Starts With c and ends with T: " + filteredList1);

        //Predicate OR - String starting with startWithC or W
        List<String> filteredList3 = strings.stream()
                .filter(startWithC.or(s -> s.startsWith("W")))
                .collect(Collectors.toList());
        System.out.println("Starts With c or starts with T: " + filteredList3);

        //Predicate NEGATE - String not starting with startWithC
        List<String> filteredList2 = strings.stream()
                .filter(startWithC.negate())
                .collect(Collectors.toList());
        System.out.println("Not Starting With c : " + filteredList2);

    }
}
