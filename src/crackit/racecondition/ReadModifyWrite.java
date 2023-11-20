package crackit.racecondition;

public class ReadModifyWrite {
    private int counter = 0;

    public synchronized void incrementCounter() {
        ++counter;
    }
}
