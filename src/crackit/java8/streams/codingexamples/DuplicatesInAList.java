package crackit.java8.streams.codingexamples;


import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesInAList {
    public static void main(String[] args) {
        var list = List.of(1,2,3,100,20,32,21,56,34,2,3,20,100);

        //Find if duplicate elements present in the list
        var set = new HashSet<>(list);
        int listSize = list.size();
        int setSize = set.size();
        if(listSize != setSize)
            System.out.println("Duplicates present");

        long distinctListSize = list.stream()
                .distinct()
                .count();
        if(listSize != setSize)
            System.out.println("Duplicates present");

        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
