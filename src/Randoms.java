import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int observers = 0;
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList());
    Iterator<Integer> numbersInt = numbers.iterator();

    public Randoms(int min, int max) {
        observers = max - min + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int next = 0;
            @Override
            public boolean hasNext() {
                if (next <= observers) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                if (next <= observers) {
                    next++;
                    return next;
                }
                return null;
            }
        };
    }
}
