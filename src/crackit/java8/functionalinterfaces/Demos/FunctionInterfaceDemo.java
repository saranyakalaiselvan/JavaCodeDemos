package crackit.java8.functionalinterfaces.Demos;

import crackit.java8.functionalinterfaces.interfaces.Operator;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {

        Operator<Integer> addition = ((a, b) -> a + b);
        System.out.println("From Java8: " + addition.operate(2,3));

        //Function<>

    }
}
