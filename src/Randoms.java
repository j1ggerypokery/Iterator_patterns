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
            final boolean isRandoms = true;

            @Override
            public boolean hasNext() {
                if (isRandoms) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                if (isRandoms) {
                    return random.nextInt(down, up + 1);
                }
                return null;
            }
        };
    }
}
