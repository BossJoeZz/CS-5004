import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class PetRockTest {
    private PetRock rocky = new PetRock("Rocky");

    /**
     * test for getName method
     * @param
     * @return
     */
    @Test
    public void testGetName() {
        assertEquals("Rocky", rocky.getName());
    }

    /**
     * test for isHappy method
     * @param
     * @return
     */
    @Test
    public void testIsStart() {
        assertFalse(rocky.isHappy());
    }

    /**
     * test for playWithRock method
     * @param
     * @return
     */
    @Test
    public void testPlayWithRock() {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    /**
     * getNameException
     * @param
     * @return
     */
    @Test
    public void getNameException() {
        assertEquals("RockyException", rocky.getName());
    }

    /**
     * test for setHeight method
     * @param
     * @return
     */
    @Test
    public void testSetHeight() {
        rocky.setHeight(3.0);
        assertEquals(new Double(3.0), rocky.getHeight());
        assertNotSame(new Double(3.0), rocky.getHeight());
    }

    /**
     * test for toString method
     * @param
     * @return
     */
    @Test
    public void testToString()
    {
        assertEquals("PetRock{name='Rocky', happy=false, height=null}", rocky.toString());
    }
}
