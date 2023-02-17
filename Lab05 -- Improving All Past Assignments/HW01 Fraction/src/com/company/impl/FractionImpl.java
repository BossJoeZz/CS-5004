package com.company.impl;

import com.company.Fraction;

public class FractionImpl implements Fraction {

    private Double numerator;
    private Double denominator;

    /**
     * tow elements construct
     * @param numerator
     * @param denominator
     */
    public FractionImpl(Double numerator, Double denominator) {
        if (denominator <= 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    /**
     * nono elemment construct
     */
    public FractionImpl() {
    }

    /**
     * @return Double
     */
    public Double getNumerator() {
        return numerator;
    }

    /**
     * @param numerator
     */
    public void setNumerator(Double numerator) {
        this.numerator = numerator;
    }

    /**
     * @return Double
     */
    public Double getDenominator() {
        return denominator;
    }

    /**
     * @param denominator
     */
    public void setDenominator(Double denominator) {
        if (denominator <= 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            this.denominator = denominator;
        }
    }

    /**
     * @return double
     */
    public double toDouble()
    {
        double fraction;
        int fractionValue;
        int decimal;
        double value;

        fraction = (double) numerator / denominator;
        fractionValue = (int) (fraction * 10);
        decimal = fractionValue % 10;
        value = decimal * 0.1;
        return value;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        int n = (int)(this.numerator * 100);
        int d = (int)(this.denominator * 100);

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && d % i == 0) {
                n = n / i;
                d = d / i;
                i=1;
            }
        }

        return "FractionImpl{" + "numerator=" + n + ", denominator=" + d + '}';
    }

    /**
     * @return FractionImpl
     */
    public FractionImpl reciprocal()
    {
        if(this.numerator <= 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            return new FractionImpl(this.denominator, this.numerator);
        }
    }

    /**
     * @param fraction
     * @return FractionImpl
     */
    public FractionImpl add(FractionImpl fraction)
    {
        if (this.numerator * fraction.getNumerator() < 0)
        {
            Double n = this.numerator * fraction.getDenominator() + this.denominator + fraction.getNumerator();
            Double d = this.denominator * fraction.getDenominator();
            return new FractionImpl(n, d);
        }
        else
        {
            Double n = this.numerator * fraction.getDenominator() + this.denominator + fraction.getNumerator();
            Double d = this.denominator * fraction.getDenominator();
            return new FractionImpl(n, d);
        }
    }

    /**
     * > positive
     * < nagetive
     * == 0
     * @param fraction
     * @return Integer
     */
    public Integer compareTo(FractionImpl fraction)
    {
        if (toDouble() < fraction.toDouble())
            return -1;
        else if(toDouble() > fraction.toDouble())
            return 1;
        else
            return 0;
    }
}
