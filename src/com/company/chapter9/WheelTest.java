import org.junit.Test;

import static org.junit.Assert.*;

public class WheelTest  {

    @org.junit.Test
    public void diameter() {

    }

    @org.junit.Test
    public void circumference() {
        Wheel wh = new Wheel(20 ,40);
        assertEquals(314.15927,wh.circumference(),0.5);
    }

    @Test
    public void tyre() {
        Wheel wh = new Wheel(20 ,40);
        assertEquals(100,wh.diameter(),0);
    }
}