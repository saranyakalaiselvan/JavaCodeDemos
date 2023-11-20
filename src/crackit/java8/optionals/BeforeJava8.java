package crackit.java8.optionals;

import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {
    public static void main(String[] args) {
        CrackIT crackIT = new CrackIT(1, "crackIT");
        CrackIT crackIT1 = new CrackIT(2, "crackIT1");
        CrackIT crackIT2 = null;

        List<CrackIT> crackITList = Arrays.asList(crackIT, crackIT1, crackIT2);

    }
}
