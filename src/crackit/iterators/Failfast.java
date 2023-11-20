package crackit.iterators;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Failfast {

    public static void main(String[] args) {
        Map<String, String> crackITMap = new HashMap<>();
        crackITMap.put("Java", "How HashMap works?");
        crackITMap.put("Java Interview", "HashSet vs TreeSet?");
        crackITMap.put("Java Interview Questions Series", "Failfast vs Failsafe");
        crackITMap.put("Hello", "World");

        Iterator iterator = crackITMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(crackITMap.get(iterator.next()));
            // removing an element using iterators remove method
            // will not throw exception
            if(iterator.equals("Hello"))
                iterator.remove();
        }
        iterator = crackITMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(crackITMap.get(iterator.next()));
            // removing an element using Maps remove method
            // will throw exception
            crackITMap.remove("Hello");
        }

    }
}
