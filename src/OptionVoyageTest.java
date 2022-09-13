import static org.junit.Assert.assertEquals;

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
}
