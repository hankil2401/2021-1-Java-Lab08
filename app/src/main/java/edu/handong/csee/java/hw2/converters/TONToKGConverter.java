package edu.handong.csee.java.hw2.converters;

/**
 * Ton to Kg converter implement methods from Convertible interface
 */
public class TONToKGConverter implements Convertible {
    private double originalValue;
    private double convertedValue;

    /**
     * original value
     */
    public void setFromValue(double fromValue) {
        originalValue = fromValue;
    }
    /**
     * converting from ton to kg
     */
    public void convert() {
        convertedValue = originalValue * 1000;
    }
    /**
     * receive the converted value
     */
    public double getConvertedValue() {
        return convertedValue;
    }
}
