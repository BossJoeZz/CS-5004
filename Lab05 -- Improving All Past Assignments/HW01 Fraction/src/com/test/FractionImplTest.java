package com.test;

import com.company.impl.FractionImpl;
import org.junit.Test;

public class FractionImplTest {

    @Test
    public void testConstruct()
    {
        FractionImpl fraction1 = new FractionImpl(-1.0, 1.0);
        FractionImpl fraction2 = new FractionImpl(1.0, 0.0);
        FractionImpl fraction3 = new FractionImpl(1.0, -1.0);
    }

    /**
     * test for SetDenominator method
     */
    @Test
    public void testSetDenominator()
    {
        FractionImpl fraction = new FractionImpl();
        fraction.setDenominator(0.0);
        fraction.setDenominator(-0.1);
        fraction.setDenominator(0.1);
    }

    /**
     * test for ToDouble method
     */
    @Test
    public void testToDouble()
    {
        FractionImpl fraction = new FractionImpl(-0.5, 3.5);
        System.out.println(fraction.toDouble());
    }

    /**
     * test for toString method
     */
    @Test
    public void testToString()
    {
        FractionImpl fraction = new FractionImpl(-0.5, 3.5);
        System.out.println(fraction.toString());
    }

    /**
     * test for reciprocal method
     */
    @Test
    public void testReciprocal()
    {
        FractionImpl fraction1 = new FractionImpl(0.0, 3.5);
        fraction1.reciprocal();

        FractionImpl fraction2 = new FractionImpl(1.5, 3.5);
        fraction2.reciprocal();

        FractionImpl fraction3 = new FractionImpl(-1.5, 3.5);
        fraction3.reciprocal();
    }

    /**
     * test for add method
     */
    @Test
    public void testAdd()
    {
        FractionImpl fraction1 = new FractionImpl(1.5, 3.5);
        FractionImpl fraction2 = new FractionImpl(2.5, 7.0);
        System.out.println(fraction1.add(fraction2).toString());

        FractionImpl fraction3 = new FractionImpl(-1.5, 3.5);
        FractionImpl fraction4 = new FractionImpl(2.5, 7.0);
        System.out.println(fraction3.add(fraction4).toString());
    }

    /**
     * test for compare method
     */
    @Test
    public void testCompareTo()
    {
        FractionImpl fraction1 = new FractionImpl(1.5, 3.5);
        FractionImpl fraction2 = new FractionImpl(2.5, 7.0);
        System.out.println(fraction1.compareTo(fraction2));

        FractionImpl fraction3 = new FractionImpl(-1.5, 3.5);
        FractionImpl fraction4 = new FractionImpl(2.5, 7.0);
        System.out.println(fraction3.compareTo(fraction4));

        FractionImpl fraction5 = new FractionImpl(2.5, 3.5);
        FractionImpl fraction6 = new FractionImpl(2.5, 3.5);
        System.out.println(fraction5.compareTo(fraction6));
    }
}
