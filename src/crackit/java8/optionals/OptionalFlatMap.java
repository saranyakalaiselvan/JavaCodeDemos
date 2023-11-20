package crackit.java8.optionals;

import crackit.equals.CrackIT;

import java.util.Optional;

public class OptionalFlatMap {
    public static void main(String[] args) {
        CrackIT crackIT = new CrackIT(1, "Java Interview Questions");
        crackIT.setViews(Optional.of(100000));
        Optional<CrackIT> crackItOptional = Optional.ofNullable(crackIT);

       crackItOptional.filter(crackIT1 -> crackIT1.getId().equals(1))
               .map(crackIT1 -> crackIT1.getViews())
               .ifPresent(integer -> System.out.println(integer));

        crackItOptional.filter(crackIT1 -> crackIT1.getId().equals(1))
                .flatMap(crackIT1 -> crackIT1.getViews())
                .ifPresent(integer -> System.out.println(integer));
    }
}
