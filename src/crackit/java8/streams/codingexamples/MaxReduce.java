package crackit.java8.streams.codingexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxReduce {
    public static void main(String[] args) {
        //Find the max element
        List<Integer> integerList = Arrays.asList(10, 15, 20, 23, 15, 14, 67, 2, 7, 19, 17, 22, 88, 100);
        Optional<Integer> max =  integerList.stream()
                .max(Integer::compareTo);
        System.out.println("Max element in the list:"+ max.orElse(null));
        //Sum of the elements
         Optional<Integer> sum = integerList.stream().reduce(Integer::sum);
        System.out.println("sum of the elements in the list:" + sum.orElse(null));
    }
}


/***
 *get the list
 * sort
 * max
 *
 *
 */