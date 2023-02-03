import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class PetRockTest {
    private PetRock rocky = new PetRock("Rocky");

    @Test
    public void getName() {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testUnhappyToStart() {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    // 2.Exception
    @Test
    public void getNameException() {
        assertEquals("RockyException", rocky.getName());
    }

    // 3
    @Test
    public void sameAndEquals() {
        rocky.setHeight(3.0);
        assertEquals(new Double(3.0), rocky.getHeight());
        assertNotSame(new Double(3.0), rocky.getHeight());
    }

    // 4
    @Test
    public void testToString()
    {
        assertEquals("PetRock{name='Rocky', happy=false, height=null}", rocky.toString());
    }
}
