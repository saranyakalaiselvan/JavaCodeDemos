package crackit.qstnset1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronized {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Welcome");
        strings.add("to");
        strings.add("crackIT");

        Collections.synchronizedList(strings);

        synchronized (strings) {
            Iterator i = strings.iterator(); //Must be in synchronized block
            while(i.hasNext()) {
                System.out.println(i.next());
            }
        }
    }
}
