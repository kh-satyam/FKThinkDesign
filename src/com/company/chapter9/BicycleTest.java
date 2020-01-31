import junit.framework.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class BicycleTest  {

    @org.junit.Test
    public void spares() {
        assertEquals(this,this);

    }

    @org.junit.Test
    public void default_chain() {
        assertEquals("10-speed",new Bicycle().default_chain());
    }


}