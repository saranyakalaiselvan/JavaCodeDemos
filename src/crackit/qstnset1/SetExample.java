package crackit.qstnset1;

import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        TreeSet<String> continents = new TreeSet<>();
        continents.add("Asia");
        continents.add("Europe");
        continents.add("NorthAmerica");
        continents.add("Antarctica");
        continents.add("SouthAmerica");

        //Prints elements in sorted order
        System.out.println("Elements in list: " + continents);

        //Prints element before Asia(exclusive)
        System.out.println("Headset: " + continents.headSet("Asia"));

        //Prints elements after Asia(inclusive)
        System.out.println("TailSet: " + continents.tailSet("Asia"));

        System.out.println("Subset: " +continents.subSet("Asia", "NorthAmerica"));

    }
}
