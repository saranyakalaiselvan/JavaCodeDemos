package crackit.java8.optionals;

import java.util.Optional;

public class OptionalCreationExample {
    public static void main(String[] args) {

        //Optional.empty() to create empty optional.
        Optional<Integer> emptyOptional = Optional.empty();

        //Optional.of() -> to create optional with default non-null value.
        Optional<String> stringOptional = Optional.of("crackIT");

        //if null throws NullPointerException
        //Optional<String> stringOptionalNull = Optional.of(null);

        //Optional.ofNullable() -> to create optional that may hold null value
        Optional<String> optionalByNullable = Optional.ofNullable("crackIT");

        //if null throws NullPointerException
        Optional<String> optionalByNullableNull = Optional.ofNullable(null);

        if(optionalByNullable.isPresent())
            System.out.println(optionalByNullable.get());

        //in ofNullble of, if the value is null, it wont enter into this if block ->
        //nothing will be printed
        if(optionalByNullableNull.isPresent())
            System.out.println(optionalByNullableNull.get());
    }
}
