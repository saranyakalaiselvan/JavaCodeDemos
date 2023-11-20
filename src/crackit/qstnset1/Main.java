package crackit.qstnset1;

public class Main {
    public static void main(String[] args) {

        String s1 = "Hi";
        String s2 = new String("Hi");
        String s3 = "Hi";

        if(s1 == s3)
            System.out.println("S1 and S3 stored in literal pool. So referencing same location");

        if(s1 != s2)
            System.out.println("S2 String created using new keyword. So S1 and S2 are different ");

    }
}