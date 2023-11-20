package crackit.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        CrackIT crackIT = new CrackIT(1000000, "How HashMap Works", "Java");
        CrackIT crackIT1 = new CrackIT(1000001, "Equals And HashCodeContract", "Java");
        CrackIT crackIT2 = new CrackIT(2000000, "Microservices Architecture", "Microservices");
        CrackIT crackIT3 = new CrackIT(2000001, "Microservices Interview Questions", "Microservices");
        CrackIT crackIT4 = new CrackIT(200000, "Spring boot Interview Questions", "SpringBoot");
        CrackIT crackIT5 = new CrackIT(200001, "Logging in Spring boot", "SpringBoot");
        List crackITList = Arrays.asList(crackIT, crackIT1,crackIT2, crackIT3, crackIT4, crackIT5);

        //Sort by no Of Views
        System.out.println("Sort by no.Of Views");
        ViewComparator viewComparator = new ViewComparator();
        Collections.sort(crackITList, viewComparator);
        System.out.println(crackITList);

        //Using Collections.comparing()
        Collections.sort(crackITList, Comparator.comparing(CrackIT::getPlayListName));
        System.out.println(crackITList);

        //multiple comparison
        Comparator.comparing(CrackIT::getTitle)
                .thenComparing(CrackIT::getNoOfViews);
        System.out.println(crackITList);

        //Reversing using comparator
        Collections.sort(crackITList, viewComparator.reversed());
        System.out.println(crackITList);

    }

}
