import org.junit.Test;

import static org.junit.Assert.*;

public class MountainBikeTest extends BicycleTest {

    @Override
    public void default_chain() {
        super.default_chain();

    }

    @Test
    public void getTire_size() {
        assertEquals(21,new MountainBike().getTire_size());
    }
}