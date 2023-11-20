package crackit.java8.streams.codingexamples;

public class CountALetterInAString {
    public static void main(String[] args) {
        String s = "Welcome to crackIT";
        long count = s.chars()
                .filter(s1-> s1 == 'c')
                .count();
        System.out.println(count);

    }
}
