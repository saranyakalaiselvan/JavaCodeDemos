package crackit.qstnset1;

import java.util.ArrayList;
import java.util.List;

public class ArrayConversionMethod3 {
    public static void main(String[] args) {
        String[] strArr = {"Welcome", "to", "crackIT", "!!"};
        List<String> arrayList = new ArrayList();
        for (String str : strArr)
            arrayList.add(str);
        System.out.println(arrayList);
    }
}
