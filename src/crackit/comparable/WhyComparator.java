package crackit.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhyComparator {
    public static void main(String[] args) {
        Integer[] arr = {12,14,17,23,87};
        Arrays.sort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));

        CrackIT1 crackIT = new CrackIT1(1, "crackIT");
        CrackIT1 crackIT1 = new CrackIT1(2, "crackIT");

        List crackitList = Arrays.asList(crackIT, crackIT1);
        Collections.sort(crackitList);

    }
}
