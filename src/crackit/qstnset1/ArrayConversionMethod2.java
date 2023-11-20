package crackit.qstnset1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayConversionMethod2 {
    public static void main(String[] args) {
        String[] strArr = {"Welcome", "to", "crackIT", "!!"};
        List<String> arrayList = new ArrayList();
        Collections.addAll(arrayList, strArr);
        System.out.println(arrayList);
    }
}
