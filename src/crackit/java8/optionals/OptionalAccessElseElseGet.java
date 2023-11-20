package crackit.java8.optionals;

import java.util.Optional;

public class OptionalAccessElseElseGet {
    public static void main(String[] args) {
        Optional<String> optionalByNullableNull = Optional.ofNullable("crackIT");
        String crackIT = optionalByNullableNull.orElse("Welcome to crackIT");
        System.out.println(crackIT);

        String crackIT1 = optionalByNullableNull.orElseGet(() -> new String("Welcome to crackIT1"));
        System.out.println(crackIT1);

        System.out.println(optionalByNullableNull.orElseThrow(IllegalArgumentException::new));

    }
}
