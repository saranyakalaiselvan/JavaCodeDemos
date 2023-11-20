package crackit.equals;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashcodeContract {
    public static void main(String[] args) {

        /***
         * No hashcode and no equals - false
         * No hascode and equals - true (but inappropriate - 2 values in hashset)
         * Hashcode and equals - true (valid - one element in hasshet as expected)
         */
        CrackIT crackIT = new CrackIT();
        crackIT.setId(1);
        crackIT.setPlayList("Java");

        CrackIT crackIT1 = new CrackIT();
        crackIT1.setId(1);
        crackIT1.setPlayList("Java");

        System.out.println("Hashcodes..");
        System.out.println(crackIT.hashCode());
        System.out.println(crackIT1.hashCode());

        System.out.println("Equals..." + crackIT.equals(crackIT1));

        Set<CrackIT> crackITSet = new HashSet<>();
        crackITSet.add(crackIT);
        crackITSet.add(crackIT1);

        System.out.println("Set size::" + crackITSet.size());

    }
}
