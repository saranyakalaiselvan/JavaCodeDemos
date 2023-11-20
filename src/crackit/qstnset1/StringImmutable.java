package crackit.qstnset1;

public class StringImmutable {
    public static void main(String[] args) {
        String str1 = "Hi";
        str1.concat("Hello");
        System.out.println("Value - Immutable: "+ str1);

        str1 = str1.concat("Hello");
        System.out.println("Reference Mutable:" + str1);
    }
}
