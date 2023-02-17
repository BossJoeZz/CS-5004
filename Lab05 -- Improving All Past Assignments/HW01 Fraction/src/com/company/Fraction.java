package com.company;

import com.company.impl.FractionImpl;

public interface Fraction {

    /**
     * @return Double
     */
    public Double getNumerator();


    /**
     * @param numerator
     */
    public void setNumerator(Double numerator);


    /**
     * @return Double
     */
    public Double getDenominator();


    /**
     * @param denominator
     * @return
     */
    public void setDenominator(Double denominator);

    /**
     * @return
     */
    public double toDouble();

    /**
     * @return FractionImpl
     */
    public FractionImpl reciprocal();

    /**
     * @param fraction
     * @return FractionImpl
     */
    public FractionImpl add(FractionImpl fraction);

    /**
     * @param fraction
     * @return Integer
     */
    public Integer compareTo(FractionImpl fraction);

}
