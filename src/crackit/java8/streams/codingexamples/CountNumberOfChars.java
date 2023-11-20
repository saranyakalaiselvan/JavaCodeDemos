package crackit.java8.streams.codingexamples;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumberOfChars {
    public static void main(String[] args) {
        String inputString = "Welcome to crackIT Youtube Channel";

        Map<Character, Long> charCountMap =
                inputString
                        .chars() //For String count - only this isn't required
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        /***********************************************************
         * Split the string into chars(Int Stream)  -> inputString.chars()
         * Then we need to group by the characters
         * classifier: (Function.identity() -> accepts and returns the same value like x->x)
         * MapFactory -> default(HashMAp)
         * Since we are using a grouping, we need to decide how to collect the grouped elements.
         * In this case, we need the count of occurrences. For this, you can use:
         * Collectors.counting() which will simply sum up how many elements are available of a given character.
         *  If no elements are present, the result is 0.
         * and count each character.
         * Store it in Map. Key will have the character and
         * value will have the count of the characters
         ***********************************************************/

        System.out.println(charCountMap);

    }
}

