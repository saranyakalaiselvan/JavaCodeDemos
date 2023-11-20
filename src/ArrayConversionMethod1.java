import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConversionMethod1 {
    public static void main(String[] args) {
        String[] strArr = {"Welcome", "to", "crack", "IT"};
        //No exception
        List arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add("!!");
        List arrayList1 = Arrays.asList(strArr); // Exception thrown
        arrayList1.add("!!");
    }
}
