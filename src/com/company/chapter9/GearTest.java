import junit.framework.Test;

import static org.junit.Assert.*;

public class GearTest  {

    @org.junit.Test
    public void ratio() {
        Gear g  =new Gear(2,1,2,3);
        assertEquals(2,g.ratio(),0);

    }

    @org.junit.Test
    public void gear_inch() {
        Gear g = new Gear(50,10,40,28);
        assertEquals(480,g.gear_inch(),0.5);
    }

    @org.junit.Test
    public void diameter() {


        Gear g = new Gear(50,10,40,28);
        assertEquals(96,g.diameter(),0.5);

    }


}