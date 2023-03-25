import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

/**
 * as a test for class MyStack
 */
public class MyStackTest {

    MyStack<Double> doubleMyStack;
    MyStack<Integer> integerMyStack;
    MyStack<String> stringMyStack;

    /**
     * we initialize the stack like type of Double, Integer, String
     */
    @Before
    public void testMyStack() {
        doubleMyStack = new MyStack<Double>();
        integerMyStack = new MyStack<>();
        stringMyStack = new MyStack<>();
    }

    /*
    * we push the element of type like Double, Integer, String into stack
    *
    * */
    @Test
    public void testPush1() {
        doubleMyStack.push(3.14);
        integerMyStack.push(3);
        stringMyStack.push("xxx");
    }

    /*
     * we push the element of type like Double, Integer, String into stack
     *
     * */
    @Test
    public void testPush2() {
        doubleMyStack.push(321.3);
        integerMyStack.push(32);
        stringMyStack.push("xxasx");
    }

    /*
    * Verify that stack can pop
    * */
    @Test
    public void testPop1() {
        doubleMyStack.push(3.14);
        integerMyStack.push(3);
        stringMyStack.push("xxx");

        // test object doubleMyStack can pop
        assertEquals(doubleMyStack.pop(), (Double) 3.14);
        // test object integerMyStack can pop
        assertEquals(integerMyStack.pop(), (Integer) 3);
        // test object stringMyStack can pop
        assertEquals(stringMyStack.pop(), (String) "xxx");
    }

    /*
     * Verify that empty stack can not pop
     * otherwise throw exception
     * */
    @Test
    public void testPop2() {
        // test empty object doubleMyStack can not pop
        try {
            doubleMyStack.pop();
        } catch (EmptyStackException ex) {
            assertSame(ex.toString(), "java.util.EmptyStackException");
        }

        // test empty object integerMyStack can not pop
        try {
            integerMyStack.pop();
        } catch (EmptyStackException ex) {
            assertSame(ex.toString(), "java.util.EmptyStackException");
        }

        // test empty object stringMyStack can not pop
        try {
            stringMyStack.pop();
        } catch (EmptyStackException ex) {
            assertSame(ex.toString(), "java.util.EmptyStackException");
        }
    }

    /*
    * Verify that top element of stack equals values
    * */
    @Test
    public void testTop1() {
        doubleMyStack.push(3.14);
        integerMyStack.push(3);
        stringMyStack.push("xxx");

        // test object doubleMyStack's top element is 3.14
        assertEquals(doubleMyStack.top(), (Double) 3.14);
        // test object integerMyStack's top element is 3
        assertEquals(integerMyStack.top(), (Integer) 3);
        // test object stringMyStack's top element is xxx
        assertEquals(stringMyStack.top(), (String)"xxx");
    }

    /*
     * Verify that top element of stack equals values
     * */
    @Test
    public void testTop2() {
        doubleMyStack.push(3.14);
        integerMyStack.push(3);
        stringMyStack.push("xxx");

        // test object doubleMyStack's top element is not 3.4
        assertNotEquals(doubleMyStack.top(), (Double) 3.4);
        // test object integerMyStack's top element is 23
        assertNotEquals(integerMyStack.top(), (Integer) 23);
        // test object stringMyStack's top element is xxxx
        assertNotEquals(stringMyStack.top(), (String)"xxxx");
    }

    /*
     * Verify that top element of stack can throw exception
     * */
    @Test
    public void testTop3() {
        // test empty object integerMyStack can not top
        try {
            doubleMyStack.top();
        } catch (EmptyStackException ex) {
            assertSame(ex.toString(), "java.util.EmptyStackException");
        }

        // test empty object integerMyStack can not top
        try {
            integerMyStack.top();
        } catch (EmptyStackException ex) {
            assertSame(ex.toString(), "java.util.EmptyStackException");
        }

        // test empty object stringMyStack can not top
        try {
            stringMyStack.top();
        } catch (EmptyStackException ex) {
            assertSame(ex.toString(), "java.util.EmptyStackException");
        }
    }

    /*
    * Verify that  element of stack' string equals values
    * */
    @Test
    public void testString1() {
        doubleMyStack.push(3.14);
        integerMyStack.push(3);
        stringMyStack.push("xxx");

        // test object doubleMyStack's toString method is "3.14 "
        assertEquals(doubleMyStack.toString(), (String)"3.14 ");
        // test object integerMyStack's toString method is "3 "
        assertEquals(integerMyStack.toString(), (String)"3 ");
        // test object stringMyStack's toString method is "xxx "
        assertEquals(stringMyStack.toString(), (String)"xxx ");
    }

    /*
     * Verify that  element of stack' string equals values
     * */
    @Test
    public void testString2() {
        doubleMyStack.push(3.14);
        integerMyStack.push(3);
        stringMyStack.push("xxx");

        // test object doubleMyStack's toString method is not "3.14dsad "
        assertNotEquals(doubleMyStack.toString(), (String)"3.14dsad ");
        // test object integerMyStack's toString method is not "asd3 "
        assertNotEquals(integerMyStack.toString(), (String)"asd3 ");
        // test object stringMyStack's toString method is not "xdasxx "
        assertNotEquals(stringMyStack.toString(), (String)"xdasxx ");
    }

    /**
     * Verify that stack not empty correctly
     */
    @Test
    public void testEmpty1() {
        doubleMyStack.push(3.14);
        integerMyStack.push(3);
        stringMyStack.push("xxx");

        // test object doubleMyStack has element
        assertFalse(doubleMyStack.empty());
        // test object integerMyStack has element
        assertFalse(integerMyStack.empty());
        // test object stringMyStack has element
        assertFalse(stringMyStack.empty());
    }


    /*
     * Verify that stack empty correctly
     */
    @Test
    public void testEmpty2() {
        // test object doubleMyStack is empty
        assertTrue(doubleMyStack.empty());
        // test object integerMyStack is empty
        assertTrue(integerMyStack.empty());
        // test object stringMyStack is empty
        assertTrue(stringMyStack.empty());
    }
}
