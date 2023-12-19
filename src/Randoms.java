import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int up;
    int down;

    public Randoms(int min, int max) {
        up = max;
        down = min;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(down, up + 1);
            }
        };
    }
}
