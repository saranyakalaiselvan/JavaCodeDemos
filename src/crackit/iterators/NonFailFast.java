package crackit.iterators;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NonFailFast {
    public static void main(String[] args) {
        Map crackITMap = new ConcurrentHashMap();
        crackITMap.put("Java", "How HashMap works?");
        crackITMap.put("Java Interview", "HashSet vs TreeSet?");
        crackITMap.put("Java Interview Questions", "Equals and Hashcode contract");
        crackITMap.put("Hello", "Hello World");

        Iterator iterator = crackITMap.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(crackITMap.get(iterator.next()));
            crackITMap.put("Hi", "Hi World");
        }
        //crackITMap.keySet().stream().forEach(System.out::println);

    }
}
