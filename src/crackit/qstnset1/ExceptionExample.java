package crackit.qstnset1;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b); //anythin divide by zero will throw exception
        } catch (ArithmeticException ex) {
            System.out.printf("Exception caught");
            ex.printStackTrace(); //Method to print exception information.
        }
    }
}
