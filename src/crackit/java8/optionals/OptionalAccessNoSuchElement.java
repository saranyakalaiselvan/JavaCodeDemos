package crackit.java8.optionals;

import java.util.Optional;

public class OptionalAccessNoSuchElement {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("crackIT");
        System.out.println(stringOptional.get());

        Optional<String> stringOptional1 = Optional.empty();
        //NoSuch Element Exception
        stringOptional1.get();


    }
}
