package crackit.java8.optionals;

import java.util.Optional;

public class OptionalStreamExample {
    public static void main(String[] args) {
        Optional<String> optionalByNullable = Optional.ofNullable("crackIT");
        optionalByNullable.stream().forEach(System.out::println);
    }
}
