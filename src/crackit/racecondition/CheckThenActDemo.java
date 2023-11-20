package crackit.racecondition;
public class CheckThenActDemo {
    public int checkThenAct(int x, int y) {
      synchronized (this) {
          if(x == 6) {
              y = x * 2;
          }
      }
      return y;
    }
}
