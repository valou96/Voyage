import static org.junit.Assert.assertEquals;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;

public class OptionVoyageTest {
    private static final double DELTA = 1e-2;
    
    @Test
    public void testToString() {

    }

    @Test
    public void testprix(){
        OptionVoyage voyage1 = new OptionVoyage("Londres", 50.00, true);
        assertEquals(40, voyage1.prix(), DELTA);

    }
    @Test
    public void testtostring(){
        OptionVoyage voyage1 = new OptionVoyage("Londres", 50.00);
        assertEquals("Londres"+ " -> " + 50.00 + " euros", voyage1.toString());

    }

    @Test
    public void testprixtranspotFalse(){
        Transport transportLong = new Transport("Londres", 50.00, false);
        assertEquals(250, transportLong.prix(), DELTA);

    }

    @Test
    public void testprixtranspotTrue(){
        Transport transportLong = new Transport("Londres", 50.00, true);
        assertEquals(1550, transportLong.prix(), DELTA);

    }

    
    @Test
    public void testtoStringSejour(){
        Sejour sejour1 = new Sejour("bamako", 50, 3,30 );
        assertEquals("bamako -> 140.0 euros", sejour1.toString());

    }
}
