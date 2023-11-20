package crackit.comparable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        CrackIT crackIT = new CrackIT(1000000, "How HashMap Works", "Java");
        CrackIT crackIT1 = new CrackIT(1000001, "Equals And HashCodeContract", "Java");
        CrackIT crackIT2 = new CrackIT(2000000, "Microservices Architecture", "Microservices");
        CrackIT crackIT3 = new CrackIT(2000001, "Microservices Interview Questions", "Microservices");
        CrackIT crackIT4 = new CrackIT(200000, "Spring boot Interview Questions", "SpringBoot");
        CrackIT crackIT5 = new CrackIT(200001, "Logging in Spring boot", "SpringBoot");

        List crackITList = Arrays.asList(crackIT, crackIT1,crackIT2, crackIT3, crackIT4, crackIT5);

        //Sort by title - natural sorting
        System.out.println("Sort by title - Natural Sorting");
        Collections.sort(crackITList);
        System.out.println(crackITList);

    }
}
