package crackit.java8.optionals;

import java.util.Optional;

public class OptionalMap {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Welcome to ");
        optional.map(s -> s.concat("crackIT")).ifPresent(System.out::println);

    }
}
