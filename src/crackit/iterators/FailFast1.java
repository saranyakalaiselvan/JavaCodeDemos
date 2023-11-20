package crackit.iterators;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast1 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList(new String[] {"Welcome", "to", "crackIT"});
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = (String) iterator.next();
            System.out.println(value);
            if(value.equals("to"))
                list.add("!!");
        }
        System.out.println(list);
    }
}
