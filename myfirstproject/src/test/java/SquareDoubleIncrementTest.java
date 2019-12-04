import firstpackage.SquareDoubleIncrement;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareDoubleIncrementTest {

    SquareDoubleIncrement sdi = new SquareDoubleIncrement();

    @Test
    public void square() {
        assertEquals(25, sdi.square(5));
    }

    @Test
    public void increment() {
        assertEquals(26, sdi.increment(25));
    }

    @Test
    public void doubling() {
        assertEquals(26, sdi.doubling(13));
    }
}