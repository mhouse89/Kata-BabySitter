import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BabySitterTest {

    private BabySitter babySitter;
    int total;

    @Before
    public void setUp() {
        babySitter = new BabySitter();
    }

    @Test
    public void ifStartIs5pmEndIs4amWith8pmBedtimePayEquals132Dollars() {
        total = babySitter.calculateCharge(17, 4, 20);
        assertEquals(total, 132);
    }

    @Test
    public void ifStartIs6pmEndIs3amWith8pmBedtimePayEquals104Dollars() {
        total = babySitter.calculateCharge(18, 3, 20);
        assertEquals(total, 104);
    }

    @Test
    public void ifStartIs5pmEndIs12amWith10pmBedtimePayEquals76Dollars() {
        total = babySitter.calculateCharge(17, 24, 22);
        assertEquals(total, 76);
    }

    @Test
    public void ifStartIs5pmEndIs2amWithMidnightBedtimePayEquals116Dollars(){
        total = babySitter.calculateCharge(17, 2, 24);
        assertEquals(total, 116);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void ifStartIsLessThan5pmReturnAnError(){
        total = babySitter.calculateCharge(16, 4, 20);

    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void ifEndIsLaterThan4amReturnAnError(){
        total = babySitter.calculateCharge(17, 5, 20);

    }

}
