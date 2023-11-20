package crackit.comparable;

import java.util.Comparator;

public class ViewComparator implements Comparator<CrackIT> {
    @Override
    public int compare(CrackIT o1, CrackIT o2) {
        if(o1.getNoOfViews() < o2.getNoOfViews()) {
            return -1;
        }
        if(o1.getNoOfViews() > o2.getNoOfViews()) {
            return 1;
        }
        return 0;
    }
}
