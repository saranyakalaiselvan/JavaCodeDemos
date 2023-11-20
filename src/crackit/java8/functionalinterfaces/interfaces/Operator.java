package crackit.java8.functionalinterfaces.interfaces;

@FunctionalInterface
public interface Operator<T> {
    T operate(T a, T b);
}
