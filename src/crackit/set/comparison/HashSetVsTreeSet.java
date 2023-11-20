package crackit.set.comparison;

import crackit.equals.CrackIT;

import java.util.HashSet;
import java.util.TreeSet;


public class HashSetVsTreeSet {

    public static void main(String[] args) {
        CrackIT crackIT = new CrackIT(1, "Java Interview Questions");
        CrackIT crackIT1 = new CrackIT(2, "SpringBoot Interview Questions");

        HashSet hashSet = new HashSet();
        hashSet.add(crackIT);
        hashSet.add(crackIT1);
        hashSet.add(null);
        hashSet.add(1);
        System.out.println(hashSet);


        TreeSet treeSet = new TreeSet();
        treeSet.add(crackIT);
        treeSet.add(crackIT1);
        //treeSet.add(null);
        //treeSet.add(1);
        System.out.println(treeSet);

    }
}
