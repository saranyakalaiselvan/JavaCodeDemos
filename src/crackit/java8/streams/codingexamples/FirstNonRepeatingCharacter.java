package crackit.java8.streams.codingexamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String crackIT = "Welcome to crackIT";
        Map<Character, Long> charCountMap = crackIT.chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(
                        Function.identity(), LinkedHashMap::new, Collectors.counting()
                ));
        Optional<Character> firstNonRepeating = charCountMap.entrySet()
                .stream().filter(characterLongEntry -> characterLongEntry.getValue() == 1)
                .map(characterLongEntry -> characterLongEntry.getKey())
                .findFirst();
        System.out.println(firstNonRepeating.orElse(null));
    }
}

/***
 * String to char
 * W -> 1
 * e -> 2
 * l -> 1
 * c -> 3
 *
 * Map -> {W , 1}, {e,2}, {l,1} -> LinkedHashMap
 *
 */