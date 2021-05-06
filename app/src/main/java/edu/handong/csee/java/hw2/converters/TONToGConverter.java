package edu.handong.csee.java.hw2.converters;

/**
 * Ton to G converter implement methods from Convertible interface
 */
public class TONToGConverter implements Convertible {
    private double originalValue;
    private double convertedValue;

    /**
     * original value
     */
    public void setFromValue(double fromValue) {
        originalValue = fromValue;
    }
    /**
     * converting from ton to g
     */
    public void convert() {
        convertedValue = originalValue * 1000000;
    }
    /**
     * receive the converted value
     */
    public double getConvertedValue() {
        return convertedValue;
    }
}
