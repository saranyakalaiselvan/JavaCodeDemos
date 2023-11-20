package crackit.qstnset1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Welcome to crackIT ");
        arrayList.add("!!");
        List list = Collections.unmodifiableList(arrayList);
        System.out.println("Unmodifiable list: " + list);
        list.add("Welcome"); //Will throw exception
    }
}
