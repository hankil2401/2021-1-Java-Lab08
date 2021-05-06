package edu.handong.csee.java.hw2.converters;

/**
 * Convertible interface contains methods for all converters
 */
public interface Convertible {

    /**
     * 
     * @param fromValue original value from args
     */
    public void setFromValue(double fromValue);
    /**
     * 
     * @return double
     */
    public double getConvertedValue();
    /**
     * converting to target measurement
     */
    public void convert();

}