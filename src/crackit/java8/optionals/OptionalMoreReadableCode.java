package crackit.java8.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalMoreReadableCode {
    public static void main(String[] args) {

        /***
         * A typical pattern in programming is to return a default
         * value if we determine that the result of an operation is null.
         * In general, we can use the ternary operator;
         */
        Optional<String> optionalByNullableNull = Optional.ofNullable(null);
        String crackIT = optionalByNullableNull.orElse("Welcome to crackIT");
        System.out.println(crackIT);

        /***
         * Throw an exception if optional is empty
         */
        optionalByNullableNull.orElseThrow(NoSuchElementException::new);
    }
}
