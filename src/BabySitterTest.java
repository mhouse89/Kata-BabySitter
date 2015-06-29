import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by matthewhouse on 6/27/15.
 */
public class BabySitterTest {
    @Test
    public void ifStartIs5pmEndIs4amWith8pmBedtimePayEquals132Dollars() {
        BabySitter babySitter = new BabySitter();
        int total = babySitter.calculateCharge(17, 4, 20);
        assertEquals(total, 132);
    }

}